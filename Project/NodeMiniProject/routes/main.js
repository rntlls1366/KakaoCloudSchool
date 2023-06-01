const express = require('express');
const path = require('path');

const router = express.Router();

// GET /login 라우터
router.get('/', (req, res) => {
  res.sendFile(path.join(__dirname, 'main.html'));
});

router.get('/cart', (req, res) => {
  //세션에 담긴 장바구니 값을 json 문자열로 리턴할 것.

  console.log("cartLog");
  if (req.session.list != undefined && req.session.list != null) {
    console.log("now list's state is " + JSON.stringify(req.session.list));
    res.send(JSON.stringify(req.session.list));

  }
  res.end();
})

router.post('/addcart', (req, res) => {

  let box = JSON.stringify(req.body);
  if (req.session.list == undefined || req.session.list == null) {
    req.session.list = [];
    req.session.list.push(req.body);
  }
  else {
    let num = req.body["number"];
    let check = 0;
    for(let i = 0; i < req.session.list.length; i++) {
      if(req.session.list[i]["number"] == num) {
        req.session.list[i]["count"] = req.session.list[i]["count"] + 1;
        check = 1;
      }
    }
    if(check == 0) req.session.list.push(req.body);
  }
  res.end();
})

router.post('/deletecart', (req, res) => {

  let num = req.body["number"];
  req.session.list = req.session.list.filter(function (data) {
    return data["number"] != num;
  });
  res.end();
})

module.exports = router;
