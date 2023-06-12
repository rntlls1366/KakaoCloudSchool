import { useDispatch, useSelector } from 'react-redux';

export default function Result() {
    const result = useSelector(state => {
        return state.score.result;
    })

    const dispatch = useDispatch();

    function onResult() {
        dispatch({type:"onResult"});
    }

    return (
        <>
        <button onClick={() => onResult()}>정답 제출</button>
        <p>score : {result}</p>
        </>
    )
}