const express = require('express');
const session = require('express-session');
const path = require('path');
const FileStore = require('session-file-store')(session); // 1
const app = express();
app.set('port', process.env.PORT || 4002);

app.use(session({  // 2
  secret: 'keyboard cat',  // 암호화
  resave: false,
  saveUninitialized: true,
  store: new FileStore()
}));

app.get('/order', (req, res)  => {  // 3  
  res.sendFile(path.join(__dirname, '/order.html'));
});

app.get('/orderprocess', (req, res)  => {  // 3  
    const url = new URL(req.url,"http://127.0.0.1:4002/");
    const price = url.searchParams.get('price'); 

   if (req.session.totalprice == undefined || req.session.totalprice == null || price == "init" || price == null ) { 
        req.session.totalprice = 0 ;    
   }
   else  {  
       req.session.totalprice = req.session.totalprice + parseInt(price) ;
   } 
   res.send ( ` Total :  ${req.session.totalprice}`  ) ;
   res.end();
});

app.listen(app.get('port'), () => {
  console.log(app.get('port'), '번 포트에서 대기 중');
});  