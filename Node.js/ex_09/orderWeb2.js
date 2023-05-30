const express = require('express');
const session = require('express-session');
const FileStore = require('session-file-store')(session); // 1
const app = express();
app.set('port', process.env.PORT || 4000);


app.use(session({  // 2
    secret: 'keyboard cat',  // 암호화
    resave: false,
    saveUninitialized: true,
    store: new FileStore()
}));

app.get('/', (req, res) => {  // 3
    console.log(__dirname);
    req.session.num = 0;
    res.send('<h1>주문</h1> <a href="order?price=500">짜장면</a> <a href="order?price=700">짬뽕</a> <a href="init">초기화</a>');
});

app.get('/order', (req, res) => {
    console.log("*******req.sessionID = ", req.sessionID);
    const url = new URL(req.url, 'http://localhost:4000');
    const price = url.searchParams.get('price');

    req.session.num = parseInt(req.session.num) + parseInt(price);

    res.send(`<h1>총 금액 :  ${req.session.num} </h1> <a href="order?price=500">짜장면</a> <a href="order?price=700">짬뽕</a>  <a href="init">초기화</a>`)
});

app.get('/init', (req, res) => {
    console.log("init");
    req.session.num = 0;
    res.send('<h1>주문</h1> <a href="order?price=500">짜장면</a> <a href="order?price=700">짬뽕</a> <a href="init">초기화</a>');
}
);

app.listen(app.get('port'), () => {
    console.log(app.get('port'), '번 포트에서 대기 중');
});