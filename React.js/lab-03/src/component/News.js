import { useLocation } from "react-router-dom";
import { useState } from "react";
import { useRef } from "react";
import './News.css';

export default function News() {
    const [data, setData] = useState(useLocation().state.article);
    const [max, setMax] = useState(0);
    const [cs, setCs] = useState({ display: 'none' });
    const commentRef = useRef(null);

    function rend() {
        let content = "";
        var num = 0;
        if (data.comments != undefined && data.comments.length > 0) {
            content = data.comments.map(comment => (
                <li key={comment.no}>
                    <p>{comment.no} / {comment.contents}</p>
                    <button onClick={() => unShow(comment.no)}>삭제</button>
                </li>
            ));
            for (let i = 0; i < data.comments.length; i++) {
                if (max < data.comments[i].no) setMax(data.comments[i].no);
            }
        }
        return content;
    }

    function enroll() {
        var temp = Object.assign({}, data);
        if (data.comments != undefined && data.comments.length > 0) {
            temp.comments = [...data.comments, { "no": max + 1, "contents": commentRef.current.value }];
        } else {
            temp.comments = [{ "no": 1, "contents": commentRef.current.value }];
        }
        setData(temp);
    }

    const handleCheckboxChange = (event) => {
        if (event.target.checked) {
            setCs({ display: 'block' });
        } else {
            setCs({ display: 'none' });
        }
    };

    function unShow(no) {
        var temp = Object.assign({}, data);
        var temp_comment = (data.comments.filter(comment => comment.no !== no));
        temp.comments = temp_comment;
        setData(temp);
    }

    return (
        <div className="news-container">
            <h1>개별 뉴스</h1>
            <h3>{data.newspaper}</h3>
            <div className="news-content">
                <h2>{data.title}</h2>
                <p>{data.contents}</p>
            </div>
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
                    <button onClick={enroll}>등록</button>
                </div>
            </div>

        </div>
    );
}