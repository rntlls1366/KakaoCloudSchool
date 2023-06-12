import './App.css';
import { Provider, useDispatch, useSelector } from 'react-redux';
import { configureStore } from '@reduxjs/toolkit';
import QuizProb from './component/QuizProb';
import Show from './component/Show';
import Result from './component/Result';
import ReactDOM from 'react-dom';

/**reducer가 state를 작성해줌. state는 값 action은 해야할 행동과 필요한 값 */
function scoreReducer(state, action) {
  if (state === undefined) {
    return {
      num: 0,
      score: 0,
      result: 0,
    }
  }
  let newState;
  
  if (action.type === 'correct') {
    newState = { ...state, score: state.score + action.point };
  }
  else if (action.type === 'uncorrect') {
    newState = { ...state, score: state.score + action.point };
  }
  else if (action.type === 'onResult') {
    newState = { ...state, result: state.score};
  }
  console.log(state.score +" and " +newState.score);
  return newState;
}

export const store = configureStore({
  reducer: {
    score: scoreReducer,
  }
})


function App() {
  return (

    <div className="App">
      <QuizProb />
      <Provider store={store}>
        <div>
          <Show data={0} />
          <br />
          <Show data={1} />
          <br />
          <Show data={2} />
          <br />
        </div>
        <Result/>
      </Provider>
      
    </div>
  );
}

export default App;
