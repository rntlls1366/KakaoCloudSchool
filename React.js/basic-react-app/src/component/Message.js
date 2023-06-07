import { useState } from "react";

export default function Message() {

    const [no, setNo] = useState(3);

    function onClickHandle() {
        console.log("clicked");
        alert("clicked");
    }

    function onChangeName(event) {
        console.log(event.target.value);
    }

    function chaneNum() {
        setNo(no+1);
    }

    return (
        <div>
            <input type="text" onChange ={(event) => {
                console.log(event.target.value);
            }} />
            Welcome! 카카오 클라우드 컴퓨팅
            <span id="no">{ no }</span>
            <button onClick={chaneNum}>ChangeNo</button>
        </div>
    )
}