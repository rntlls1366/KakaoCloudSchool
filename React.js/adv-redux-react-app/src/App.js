import React from 'react';
import { Provider, useDispatch, useSelector } from 'react-redux';
import { configureStore } from '@reduxjs/toolkit';

/**reducer가 state를 작성해줌. state는 값 action은 해야할 행동과 필요한 값 */
function counterReducer(state, action) {
  if (state === undefined) {
    return { cnt: 0 };
  }
  let newState;
  if (action.type === 'up') {
    newState = { ...state, cnt: state.cnt + action.step }
  }
  console.log(state, action);
  return newState;
}

export const store = configureStore({
  reducer: {
    counter: counterReducer,
  }
})

function Counter() {
  const dispatch = useDispatch();

  const count = useSelector(state => {
    console.log(state);
    return state.counter.cnt;
  })

  function add() {
    dispatch({ type: 'up', step: 2 });
  }

  return (
    <div>
      <button onClick={add}>+</button> {count}
    </div>
  )
}


function App() {
  return (
    <Provider store={store}>
      <div>
        <Counter></Counter>
      </div>
    </Provider>
  );
}

export default App;
