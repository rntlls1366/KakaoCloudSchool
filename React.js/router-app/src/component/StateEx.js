import {useState} from 'react';

export default function StateEx () {
    const [ month, setMonth ] = useState ("June") ;  
   
    function clickHandler1(){
        setMonth("April");  // 비동기 처리됨 
        alert(month); // June 이 나옴 
    }

    const [ point, setPoint ] = useState (0) ;  

    function clickHandler2(){
        setPoint(point+1);   
        setPoint(point+1);
        setPoint(point+1);
        setPoint(point+1);  // 하나만 처리됨.  비동기라서.. 
    }  // 아래와 같이 하면 됨 

    function clickHandler3(){
        setPoint( (prevState) => (prevState+1) ); //prevState는 항상 최신 값을 가지고 옴.
        setPoint( (prevState) => (prevState+1) );   
        setPoint( (prevState) => (prevState+1) );   
        setPoint( (prevState) => (prevState+1) );       
    }

    const NewOne = {
        name : "김영수", 
        age : 30 
    }

    const [user, setUser] = useState(NewOne); 

    function clickHandler4_1(){
        NewOne.age = 31;
        setUser(NewOne) ;  // 화면의 값이 갱신되었는가? Yes or No
        // 리엑트는 이전 상태값과, 이후 상태값을 비교해서 다른 경우만 ui 갱신해줌  
    }

    function clickHandler4_2(){
        setUser( prevState => {
            NewOne.age = 31;
            console.log(prevState === NewOne) ; // true.  객체 내부가 바꾸어도 모름.  
            return NewOne;            //새 객체를 만들어야 함.
        }) ;  
      }

    function clickHandler4_3(){
        setUser( prevState => {
            NewOne.age = 31;
            const NewNewOne = {...NewOne , age : 31 } // 새 객체 
            console.log(prevState === NewNewOne) ;   // false
            return NewNewOne;             
        }) ;  
    }
    
   
    return (
        <div>
            {month} <button onClick={clickHandler1}> month 변경 </button>
            {point} <button onClick={clickHandler2}> point 변경 </button>
            {point} <button onClick={clickHandler3}> point 변경 </button>
            {user.name} {user.age} <button onClick={clickHandler4_3}> age 변경 </button>
        </div>
    )
}