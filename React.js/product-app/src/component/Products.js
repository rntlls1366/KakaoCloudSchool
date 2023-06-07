import {useRef} from "react";
import {useState} from "react";

export default function Products(props) {
    const productList = [];
    

    props.products.forEach(product => {
        productList.push(<li>상품명 : {product.name}<br/>상품가격 : {product.price}</li>)
    });

    const nameRef = useRef(null);
    const priceRef = useRef(null);

    function enroll() {
        console.log(nameRef.current.value);
        console.log(priceRef.current.value);
    }

    return (
        <div>
            <ul>
                {productList}
            </ul>
            <div>
                <input type="text" placeholder="상품이름 입력" ref={nameRef}/>
                <input type="text" placeholder="상품가격 입력" ref={priceRef}/>
                <button onClick={enroll}>등록</button>
            </div>
        </div>//{} 로 싼 배열은 문자열로 나온다.
    )
}