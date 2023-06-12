import './App.css';
import { Link } from "react-router-dom";
import Posts from './component/Posts';


function App() {


  return (
    <div className="App">
      <header className="App-header">
        <h1>김준연 게시판</h1>
        <Link to='/addpost' className="add-post-link">게시글 작성</Link>
      </header>
      <div className="Posts-container">
        <Posts />
      </div>
    </div>
  );
}

export default App;
