import logo from './logo.svg';
import './App.css';
import dataJson from "./db/news.json";
import News from './component/News';
import { useState } from "react";
import { Link } from "react-router-dom";    // Link import 필요 

function App() {
  const data = dataJson.newspaperArticles;

  return (
    <div className="App">
      <header className="App-header">
        <h1>인터넷 뉴우스</h1>
      </header>
      <ul>
        {dataJson.newspaperArticles.map(article => (
          <li key={article.id}>
            <Link to={"/news"} state={{article:article}}>no.{article.id} / {article.title}</Link>
          </li>
        ))
        }
      </ul>
    </div>
  );
}

export default App;
