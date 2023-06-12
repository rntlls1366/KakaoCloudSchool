import { BrowserRouter, Route, Routes } from 'react-router-dom';
import App from './App';
import Post from './component/Post';
import Error from './Error';
import AddPost from './component/AddPost';
function Router() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<App />} />
        <Route path="/error" element={<Error />} />
        <Route path="/post/:id" element={<Post />} />
        <Route path="/addpost" element={<AddPost/>} />
      </Routes>
    </BrowserRouter>
  )
}

export default Router;