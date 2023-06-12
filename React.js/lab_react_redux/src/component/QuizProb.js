import data from '../db/quiz.json';

export default function QuizProb() {

    
    return (
        <div>
            {data.quizzes[0].prob}
            <br />
            {data.quizzes[1].prob}
            <br />
            {data.quizzes[2].prob}
        </div>
    )
}