import { useEffect, useState } from "react";
import { useParams } from "react-router-dom";
import { homeDomain, dataDomain } from "./common";
import { useNavigate } from "react-router-dom";
import { useRef } from "react";

export default function Student() {
    const [student, setStudent] = useState({
        "id": 0,
        "name": null,
        "grade": 0,
        "marks": {
            "maths": 0,
            "physics": 0,
            "chemistry": 0
        }
    });

    const navigate = useNavigate();
    const mathScoreRef = useRef(student.marks.maths);
    const cemiScoreRef = useRef(student.marks.chemistry);

    const { id } = useParams();

    useEffect(() => {
        console.log(id);

        //GET Method (default)
        fetch(`${dataDomain}/students/${id}`)
            .then(res => { return res.json() })
            .then(data => { setStudent(data) });

    }, [id]);   // 처음 한번만 실행 됨 

    function updateStudent() {
        if (mathScoreRef.current.value != "") student.marks.maths = mathScoreRef.current.value;
        if (cemiScoreRef.current.value != "") student.marks.chemistry = cemiScoreRef.current.value;

        let newStudent = { ...student }

        fetch(`${dataDomain}/students/${id}`,
            {
                method: "Put",   // 갱신을 위해 Put Method 로 요청 
                headers: {
                    'Content-Type': "application/json",
                },
                body: JSON.stringify(newStudent),

            }).then(res => {
                if (res.ok) {
                    alert("수정 성공 ");
                    console.log(res);
                    setStudent(newStudent);    //state 변경으로 화면 갱신 
                }
            }
            )
    }

    function deleteStudent() {
        if (window.confirm("정말로 삭제하시겠습니까?")) {

            fetch(`${dataDomain}/students/${id}`,
                {
                    method: "Delete",
                    headers: {
                        'Content-Type': "application/json",
                    },
                }
            ).then(() =>   // 삭제 완료 후, 
            { navigate(-1) }  //홈으로 가기 
            )
        }
    }



    return (
        <div>
            <table border={1}>
                <tbody>
                    <tr><th>학번</th><th>이름</th><th>수학점수</th><th>화학점수</th>
                        <th>수학점수 수정</th>
                        <th>화학점수 수정</th>
                        <th>삭제하려면 삭제버튼을 클릭하세요</th></tr>
                    <tr key={student.id}>
                        <td>{student.id}</td><td>{student.name}</td>
                        <td>{student.marks.maths} </td>
                        <td>{student.marks.chemistry}</td>
                        <td><input type="number" min='0' max='100' ref={mathScoreRef} />
                            <button onClick={updateStudent} >수정</button>
                        </td>
                        <td><input type="number" min='0' max='100' ref={cemiScoreRef} />
                            <button onClick={updateStudent} >수정</button>
                        </td>
                        <td><button onClick={deleteStudent}>Delete</button></td>
                    </tr>
                </tbody>
            </table>
        </div>
    );
}