import { useParams } from "react-router-dom";
import { useLocation } from "react-router-dom";

export default function TeacherDetail() {
    const params = useParams()
    console.log(params); // 전체 파라미터 값

    // const id = useParams().id;   //  id 파라미터 값만 
    const { id } = useParams();       //  id 파라미터 값만 
    console.log(id);

    const location = useLocation();


    return (
        <>
            <h1> {location.state.tc.id} 번 선생 {location.state.tc.name}에 대한 정보 상세보기 페이지 입니다.</h1>
        </>
    )
}