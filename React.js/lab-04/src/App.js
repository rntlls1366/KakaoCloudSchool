import logo from './logo.svg';
import './App.css';
import { dataDomain } from "./component/common";
import { useEffect, useState } from "react";
import { Link } from "react-router-dom";
import Posts from './component/Posts';
import Post from './component/Post';

function App() {
  

  return (
    <div className="App">
      <header className="App-header">
        <h1>일단 헤더임</h1>
      </header>
        <Posts/>
    </div>
  )
}

export default App;
