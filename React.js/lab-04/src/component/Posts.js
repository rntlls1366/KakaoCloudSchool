import { dataDomain } from "./common";
import { useEffect, useState } from "react";
import { Link } from "react-router-dom";


export default function Posts() {
    const [posts, setPosts] = useState([]);

    useEffect(() => {

        fetch(`${dataDomain}/posts`)  // JSON-Server 에게 students data 요청
            .then(res => { return res.json() })
            .then(data => (setPosts(data)))

    }, []);

    function rend() {
        const content = posts.map((post, index) => {
            if (post.show === 0) {
                return (
                    <tr key={index}>
                        <td>{post.id} </td><td><Link to={"/post/" + (post.id)}>{post.title}</Link></td>
                    </tr>
                )
            }
        }

        )
        return content;
    }
    return (
        <div>
            <table>
                <caption className="title"> 목록 </caption>
                <tbody>
                    {rend()}
                </tbody>
            </table>
        </div>
    )
}