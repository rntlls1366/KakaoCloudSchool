import Posts from "./Posts"
import { dataDomain } from "./common";
import { useParams, Link } from "react-router-dom";
import { useRef, useEffect, useState } from "react";
import useFetch from "../hooks/useFetch";


export default function Post() {

    // const [post, setPost] = useState({
    //     "id": 0,
    //     "title": "title",
    //     "body": "body",
    //     "comments": []
    // });


    const { id } = useParams();
    const [cs, setCs] = useState({ display: 'none' });
    const commentRef = useRef("");

    var post = useFetch(`${dataDomain}/posts/${id}`);
    // setPost(init);
    // useEffect(() => {
    //     //const init = useFetch(`${dataDomain}/posts/${id}`);


    // }, [id]);   // 처음 한번만 실행 됨


    const handleCheckboxChange = (event) => {
        if (event.target.checked) {
            setCs({ display: 'block' });
        } else {
            setCs({ display: 'none' });
        }
    };

    function addText() {
        if (commentRef.current.value !== "") {
            post.comments = [...post.comments, { no: 0, contents: commentRef.current.value }];
            let temp = { ...post };

           

            fetch(`${dataDomain}/posts/${id}`, {
                method: "Put",
                headers: {
                    'Content-Type': "application/json",
                },
                body: JSON.stringify(temp),
            }).then(res => {
                if (res.ok) {
                    console.log("ok");
                }
            }
            ).then(res => {post = useFetch(`${dataDomain}/posts/${id}`);})

            
        }

    }

    function rend() {
        let comment = "";

        if (post.comments !== undefined && post.comments.length > 0) {
            comment = post.comments.map((comment, index) => (
                <li key={comment.no}>
                    <p>{index + 1} / {comment.contents}</p>
                    <button>삭제</button>
                </li>
            ));
        }

        return comment;
    }

    return (
        <div>
            <Link to="/">메인 화면</Link>
            <h2>{post.id} / {post.title}</h2>
            <p>{post.body}</p>

            <p>댓글 보기</p>
            <input type="checkbox"
                onChange={handleCheckboxChange}
            ></input>
            <div className="comments-container" style={cs}>
                <ul>
                    {rend()}
                </ul>
                <div className="comment-input-container">
                    <input type="text" placeholder="댓글 입력" ref={commentRef} />
                    <button onClick={() => { addText() }}>등록</button>
                </div>
            </div>
            <div>
                <Posts />
            </div>
        </div>

    );
}