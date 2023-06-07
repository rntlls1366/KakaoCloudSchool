import Message2 from "./Message2"
import styles from "./Hello.module.css";

export default function Hello2(){
    return (
        <div> 
            <h1 className= {styles.csstest}> Hello2</h1>
            <Message2 name='홍길동' id={2} />
            <Message2 name='김연진' id={3} /> 
            <Message2/>
        </div>
    )
}