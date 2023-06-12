
export async function call(url, method, request = null) {
    let headers = new Headers();

    let options = {
        method: method,
        headers: headers,
    };

    if (request !== null) {
        if (method !== "GET") {
            headers.append("Content-Type", "application/json");
            options.body = JSON.stringify(request);
        }
    }
    return fetch(url, options)
        .then((response) =>
            response.json().then((json) => {
                if (!response.ok) {
                    // response.ok가 true이면 정상적인 리스폰스를 받은것, 아니면 에러 리스폰스를 받은것.
                    return Promise.reject(json);
                }
                return json;
            })
        )
        .catch((error) => {
            console.log(error.status);
            if (error.status === 403) {
                window.location.href = "/error"; // redirect
            }
            return Promise.reject(error);
        });
}

