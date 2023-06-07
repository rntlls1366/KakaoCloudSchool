import Product from "./Product"
import { useRef } from "react";
import { useState } from "react";

export default function ProductList() {

    const [productlist, setProductList] = useState([
        { id: 1, productName: "상품A", price: 1000, imageFileName: "a.jpg", active: "on" },
        { id: 2, productName: "상품B", price: 2000, imageFileName: "a.jpg", active: "on" },
        { id: 3, productName: "상품C", price: 3000, imageFileName: "a.jpg", active: "on" },
        { id: 4, productName: "상품D", price: 4000, imageFileName: "a.jpg", active: "off" },
    ]);

    var list = [];
    productlist.forEach(product => {
        list.push(<Product product={product}></Product>);
    });

    const [show, setShow] = useState(list);

    const nameRef = useRef(null);
    const priceRef = useRef(null);

    function enroll() {

        var temp = {
            id: productlist.length + 1, productName: nameRef.current.value, price: priceRef.current.value, imageFileName: "a.jpg", active: "on"
        }

        var updatedList = [...productlist, temp];
        setProductList(updatedList); // Update the productlist state

        var newShow = [];
        updatedList.forEach(product => {
            newShow.push(<Product product={product}></Product>);
        });

        setShow(newShow);
    }


    return (
        <div>
            <h1>상품 리스트</h1>

            <table border="1">
                <thead>
                    <th>ID</th>
                    <th>이름</th>
                    <th>가격</th>
                    <th>사진</th>
                    <th>판매여부</th>
                </thead>
                <tbody>
                    {show}
                </tbody>
            </table>

            <div>
                <input type="text" placeholder="상품이름 입력" ref={nameRef} />
                <input type="text" placeholder="상품가격 입력" ref={priceRef} />
                <button onClick={enroll}>등록</button>
            </div>
        </div>
    )
}