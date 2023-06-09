import { BrowserRouter, Route, Routes } from 'react-router-dom';
import App from './App';
import Posts from './component/Posts';
import Post from './component/Post';
function Router() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<App />} >
        </Route>
        <Route path="/post/:id" element={<Post />} />
      </Routes>
    </BrowserRouter>
  )
}

export default Router;