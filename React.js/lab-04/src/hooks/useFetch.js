import { useState, useEffect } from   "react";
 
export default function useFetch(url) {
    const [value, setValue] = useState([]);
    
    useEffect(() => {
      fetch(url)
       .then(res => res.json())
       .then(data => { 
             setValue(data)
       })
    }, [url])
    
    return value;
}

// export default function useFetch(url, method = "Get", request = null) {
//     const [value, setValue] = useState([]);
//     useEffect(() => {
//         if (method === "Get") {

//             fetch(url)
//                 .then(res => res.json())
//                 .then(res => {
//                     setValue(res)
//                 })

//         }
//         else if (method === "Delete") {

//             fetch(url,
//                 {
//                     method: "Delete",
//                     headers: {
//                         'Content-Type': "application/json",
//                     },
//                 }
//             ).then(setValue(null))

//         }
//         else {
//             fetch(url,
//                 {
//                     method: method,
//                     headers: {
//                         'Content-Type': "application/json",
//                     },
//                     body: JSON.stringify(request),

//                 }).then(res => {
//                     if (res.ok) {
//                         console.log(res);
//                         setValue(res);
//                     }
//                 }
//                 )
//         }
//     }, [url])


//     return value;
// }
