const express = require('express');
const session = require('express-session');
const path = require('path');
const FileStore = require('session-file-store')(session); // 1
const app = express();
app.set('port', process.env.PORT || 4003);

app.use(session({  // 2
  secret: 'keyboard cat',  // 암호화
  resave: false,
  saveUninitialized: true,
  store: new FileStore()
}));

var htmlstring = '<form action="/order" >  \
    <h1> 주문 </h1> \
    <table> \
        <tr> <td>짜장면(500)</td> <td><input type="radio" name="price" value="500"/></td></tr> \
        <tr> <td>짬뽕(700)  </td> <td><input type="radio" name="price" value="700"/></td></tr> \
        <tr> <td>초기화     </td> <td><input type="radio" name="price" value="init" /></td></tr> \
        <tr> <td> <input type="submit"/> </td></tr> \
     </table>  \
     </form> '

app.get('/order', (req, res)  => {  // 3  
    const url = new URL(req.url,"http://127.0.0.1:4003/");
    const price = url.searchParams.get('price'); 

   if (req.session.totalprice == undefined || req.session.totalprice == null || price == "init" || price == null ) { 
        req.session.totalprice = 0 ;    
   }
   else  {  
       req.session.totalprice = req.session.totalprice + parseInt(price) ;
   } 
   res.send (  htmlstring  + ` Total :  ${req.session.totalprice}`  ) ;
   res.end();
});

app.listen(app.get('port'), () => {
  console.log(app.get('port'), '번 포트에서 대기 중');
});  

