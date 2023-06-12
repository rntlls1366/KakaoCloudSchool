import "./AddPost.css";
import { dataDomain } from "./common";
import { useRef, useEffect, useState } from "react";
import { call } from "./ApiService";

export default function AddPost() {
    const post = {
        "id": 0,
        "title": "title",
        "body": "body",
        "password": "",
        "show": 0
    };

    const [posts, setPosts] = useState([]);
    const [id, setId] = useState(0);

    useEffect(() => {

        fetch(`${dataDomain}/posts`)  // JSON-Server 에게 students data 요청
            .then(res => { return res.json() })
            .then(data => { setPosts(data); return data.length })
            .then(len => { setId(len + 1) });
    }, []);

    const titleRef = useRef("");
    const bodyRef = useRef("");
    const pwRef = useRef("");

    function addPost() {
        if (titleRef.current.value !== "" && bodyRef.current.value !== "") {
            let temp = { ...post };
            temp.id = id;
            temp.title = titleRef.current.value;
            temp.body = bodyRef.current.value;
            temp.password = pwRef.current.value;

            let temp_data = [...posts, temp];
            console.log(temp_data);

            call(`${dataDomain}/posts`, "Post", temp)
                .catch(e => { console.log(e) })
                .then(window.location.href = `/`);


        }

    }


    return (
        <div className="add-post-wrapper">
            <div className="add-post-container">
                <div className="input-field-container">
                    <p>제목</p>
                    <input type="text" ref={titleRef} className="input-field" />
                </div>
                <div className="input-field-container">
                    <p>비밀번호</p>
                    <input type="text" ref={pwRef} className="input-field" />
                </div>
                <div className="input-field-container">
                    <p>내용</p>
                    <textarea rows={8} ref={bodyRef} className="textarea-field"></textarea>
                </div>
                <button onClick={() => addPost()}>작성 완료</button>
            </div>
        </div>
    )
}