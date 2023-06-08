import StudentList from './component/StudentList';
import StudentDetail from './component/StudentDetail';
import TeacherList from './component/TeacherList';
import TeacherDetail from './component/TeacherDetail';
import './App.css';
import { BrowserRouter, Route, Routes } from 'react-router-dom';


function App() {
  return (
    <div className="App">
      <BrowserRouter>
        <Routes>

          <Route path="/" element={<StudentList />} >  </Route>
          <Route path="/detail/:id" element={<StudentDetail />}>  </Route>
          <Route path="/teacher" element ={<TeacherList/>}> </Route>
          <Route path="/teacherdetail/:id" element ={<TeacherDetail/>}> </Route>

        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;