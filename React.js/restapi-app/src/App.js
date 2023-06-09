import './App.css';
import StudentsList from './component/StudentsList'; 
import {BrowserRouter,Route,Routes} from 'react-router-dom';
import Student from  './component/Student';
import BootStrapEx from './component/BootStrapEx';

function App() {
  return (
    <BrowserRouter>
    <div> 
      <Routes>
        <Route path="/" element={ <StudentsList/> } >   
        </Route>
        <Route path="/students/:id" element={ <Student/> } >   
        </Route>  
        <Route path="/boot" element={ <BootStrapEx/>} >
        </Route>
      </Routes>
    </div>
    </BrowserRouter>
  );
}

export default App;