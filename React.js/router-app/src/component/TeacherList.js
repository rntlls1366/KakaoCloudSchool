import { Link } from "react-router-dom";    // Link import 필요 


import dataJson from "../db/data.json";   // data.json 파일 읽어옴.



export default function TeacherList() {
    console.log(dataJson);

    return (
        <> <h1>선생 목록 페이지 입니다.</h1>
            <ul>
                {dataJson.teachers.map(teacher => (
                    <li key={teacher.id}>
                        {teacher.id}
                        {teacher.name}
                        <Link to={"/teacherdetail/" + teacher.id} state={{tc : teacher}}>상세</Link>
                    </li>
                ))
                }
            </ul>
        </>
    );
}