import { BrowserRouter, Route, Routes } from 'react-router-dom';
import App from './App';
import News from './component/News';
function Router() {
    return (
        <BrowserRouter>
        <Routes>

          <Route path="/" element={<App />} >  </Route>
          <Route path="/news" element={<News />} ></Route>
          {/* <Route path="/detail/:id" element={<StudentDetail />}>  </Route> */}


        </Routes>
      </BrowserRouter>
    )
}

export default Router;