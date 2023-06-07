import { useState } from "react";
import "./Product.css"

export default function Product(props) {

    const[product, setProduct] = useState(props.product);
    const[sell, setSell] = useState("");

    const handleCheckboxChange = (event) => {
        if (event.target.checked) {
            setSell("판매중지");
        } else {
            setSell("");
        }
    };

    const handlePriceUpdate = () => {
        const newPrice = prompt("변경할 가격을 입력하세요.");
        if (newPrice !== null) {
            setProduct((prevProduct) => ({
                ...prevProduct,
                price: Number(newPrice),
            }));
        }
    };


    const imageUrl = `${process.env.PUBLIC_URL}/${product.imageFileName}`;

    return (
        <tr key={product.id}>
            <td>{product.id}</td>
            <td>{product.productName}</td>
            <td>{product.price}</td>
            <td> <img src= {imageUrl} alt="상품 이미지" /></td>
            <td>{sell}</td>
            <input type="checkbox"
                onChange={handleCheckboxChange}
            />
            <button onClick={handlePriceUpdate}>price update</button>
        </tr>
    )
}