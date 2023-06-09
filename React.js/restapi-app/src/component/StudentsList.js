import { useEffect, useState } from "react"; 
import { Link } from "react-router-dom";
import { dataDomain } from "./common";

export default function StudentsList() {
    const [students, setStudents] = useState([]); 


    //  `${dataDomain}/students` 로 비동기 요청 
     useEffect( ()=>  { 

          fetch (`${dataDomain}/students`)  // JSON-Server 에게 students data 요청
	        .then(res => {return res.json()}) 
	        .then(data => (setStudents(data))) 

    }, []) ;  // 처음 한번만 실행 됨    
    
    return (
        <div> 
            <table>
						<caption className="title"> StudentList </caption>
						<tbody>
            { 
                students.map( (student ) => (
                    <tr key = {student.id}> 
                    <td>{student.id} </td><td> <Link to={"/students/"+(student.id)}>{student.name}</Link></td><td>{student.grade} </td>
                    </tr>
                  )
                )
            }
            </tbody></table>
        </div>
     );
}