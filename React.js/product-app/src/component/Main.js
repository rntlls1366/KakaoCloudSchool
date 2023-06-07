import Products from "./Products"

export default function Main() {
    const products = [
        {name:"안경", price:"10000"},
        {name:"신발", price:"20000"},
        {name:"바지", price:"30000"},
        {name:"양말", price:"40000"},
    ]

    return (
        <div>
            <h1>상품 리스트</h1>
            <Products products ={products} />
        </div>
    )
}