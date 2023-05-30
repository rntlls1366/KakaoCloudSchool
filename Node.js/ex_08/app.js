const express = require("express")
const path = require("path")

const app = express()
app.set('port', process.env.PORT || 3001);    //환경변수 설정이 돼었으면 그것으로, 아니먼 3001 번

app.get("/", (req,res) =>  {  
  res.sendFile(path.join(__dirname, '/index.html'));
});

app.listen(app.get('port'), () => {
  console.log(app.get('port'), '번 포트에서 대기 중');
});