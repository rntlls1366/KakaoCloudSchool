import Posts from "./Posts"
import "./Post.css";
import { dataDomain } from "./common";
import { useParams, Link } from "react-router-dom";
import { useRef, useEffect, useState } from "react";
import { call } from "./ApiService";


export default function Post() {

    const [post, setPost] = useState({
        "id": 0,
        "title": "title",
        "body": "body",
        "comments": []
    });


    const { id } = useParams();
    const [cs, setCs] = useState({ display: 'none' });
    const commentRef = useRef("");
    const userRef = useRef("");
    const pwRef = useRef("");
    const checkRef = useRef("");

    useEffect(() => {
        call(`${dataDomain}/posts/${id}`, "Get", null)
            .then(data => { setPost(data) });


    }, [id]);   // 처음 한번만 실행 됨


    const handleCheckboxChange = (event) => {
        if (event.target.checked) {
            setCs({ display: 'block' });
        } else {
            setCs({ display: 'none' });
        }
    };

    function addComment() {
        if (userRef.current.value !== "" && commentRef.current.value !== "") {
            let temp = { ...post };
            if (post.comments !== undefined && post.comments.length > 0) {
                temp.comments = [...post.comments, { user: userRef.current.value, password: pwRef.current.value, contents: commentRef.current.value, show: 0 }];
            }
            else {
                temp.comments = [{ user: userRef.current.value, password: pwRef.current.value, contents: commentRef.current.value, show: 0 }];
            }



            call(`${dataDomain}/posts/${id}`, "Put", temp)
                .then(setPost(temp))
                .catch(e => { console.log(e) });


        }

    }

    function deletePost() {
        const pw = prompt("비밀번호를 입력하세요.");
        if (post.password === pw) {
            const temp = { ...post };
            temp.show = 1;
            call(`${dataDomain}/posts/${id}`, "Put", temp)
                .then(window.location.href = `/`);
        }
        else {
            alert("비밀번호가 일치하지 않습니다.");
        }
    }

    function rend() {
        let comment = "";

        if (post.comments !== undefined && post.comments.length > 0) {
            comment = post.comments.map((comment, index) => {
                if (comment.show === 0) {
                    return (
                        <li key={index}>
                            <p>{comment.user} :  {comment.contents}</p>
                            <input type="text" placeholder="비밀번호" ref={checkRef} />
                            <button className="postBt" onClick={() => {
                                if (String(checkRef.current.value) === post.comments[index].password) {
                                    let temp = { ...post };
                                    temp.comments[index].show = 1;
                                    call(`${dataDomain}/posts/${id}`, "Put", temp)
                                        .then(setPost(temp))
                                        .catch(e => { console.log(e) });
                                }
                                else alert("비밀번호가 틀립니다.");

                            }}>삭제</button>
                        </li>
                    );
                } else {
                    return null;
                }
            });
        }

        return comment;
    }

    return (
        <div className="container">
            <div className="post-container">
                <Link to="/" className="link-container">
                    메인 화면
                </Link>
                <div className="post-content">
                    <h2>{post.id} / {post.title}</h2>
                    <hr />
                    <p>{post.body}</p>
                </div>
                <button className="postBt" onClick={() => { deletePost() }}>글 삭제</button>
                <div className="view-comment">
                    <p>댓글 보기<input type="checkbox"
                        onChange={handleCheckboxChange}
                    ></input></p>

                </div>
                <div className="comments-container" style={cs}>
                    <ul>
                        {rend()}
                    </ul>
                    <div className="comment-input-container">
                        <input type="text" placeholder="이름" ref={userRef} />
                        <input type="text" placeholder="비밀번호" ref={pwRef} />
                    </div>
                    <div className="comment-input-container">
                        <input type="text" placeholder="댓글 입력" ref={commentRef} />
                        <button className="postBt" onClick={() => { addComment() }}>등록</button>
                    </div>
                </div>
                <div>
                    <Posts />
                </div>
            </div>
        </div>

    );
}