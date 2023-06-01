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
  if (req.session.list != null) {
    console.log("list is not null!! " + req.session.list);

  }
  res.send('[' + req.session.list + ']');
  res.end();
})

router.post('/addcart', (req, res) => {
  console.log("gogo : " + JSON.stringify(req.body));
  let box = JSON.stringify(req.body);
  if (!req.session.num || req.session.num == 0) {
    req.session.num = 1;
    req.session.list = [];
    req.session.list.push(box);
    console.log("create session : " + box + " num is " + req.session.num + " result : " + req.session.list);
  }
  else {
    req.session.list.push(box);
    req.session.num = req.session.num + 1;
    console.log("next session : " + box + " num is " + req.session.num + " result : " + req.session.list);
  }
  res.end();
})

router.post('/deletecart', (req, res) => {

  let box = JSON.stringify(req.body);
  console.log("deleted is " + box);
  res.end();
})

module.exports = router;
