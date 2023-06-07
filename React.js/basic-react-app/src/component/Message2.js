import { useState } from "react";
export default function Message2(props){ 

    const [no, setNo] = useState(3) ;  

    function changeNum(){
        setNo(no+1) ;  
    }
    return (
        <div> 
             Welcome! {props.id}번 {props.name} 
             카카오 클라우드 컴퓨팅   
             <span id="no">{no}</span>기 
             <button onClick={changeNum}> +1 Num </button> 
        </div>
    )
}