import data from '../db/quiz.json';
import {useDispatch} from 'react-redux';
import {useState} from 'react';

export default function Show(props) {
    const id = props.data;
    const dispatch = useDispatch();
    const [point, setPoint] = useState(0);

    function correct() {
        if(point === 0) {
            setPoint(1);
            dispatch({ type: 'correct', point: 1});
        }
        else if(point === -1) {
            setPoint(1);
            dispatch({ type: 'correct', point: 1});
        }
        
    }
    function uncorrect() {
        if(point === 0) {
            setPoint(-1);
        }
        else if(point === 1) {
            setPoint(-1);
            dispatch({ type: 'uncorrect', point: -1});
        }
        
    }

    function check(value) {
        console.log(value);
        if(value === data.quizzes[id].ans) {
            correct();
        }
        else uncorrect();
    }


    return (
        <>
            a : {data.quizzes[id].item[0].a} b : {data.quizzes[id].item[1].b} c : {data.quizzes[id].item[2].c}
            <br/>
            <input type="radio" name={`options${id}`} value="a" id="option-a" onChange={() => check("a")} />
            <label for="option-a">A</label>

            <input type="radio" name={`options${id}`} value="b" id="option-b"  onChange={() => check("b")} />
            <label for="option-b">B</label>

            <input type="radio" name={`options${id}`} value="c" id="option-c"  onChange={() => check("c")} />
            <label for="option-c">C</label>

        </>
    )
}