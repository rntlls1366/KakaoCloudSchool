const express = require('express');
const path = require('path');

const router = express.Router();


router.get('/', (req, res) => {
  if (req.session.list == undefined || req.session.list == null) {  //장바구니 리스트가 없거나, 비어있다면 새로만들기
    req.session.list = [];
    req.session.total = 0;
  }
  res.sendFile(path.join(__dirname, 'main.html'));
});

router.get('/cart', (req, res) => { //세션 내 장바구니 리스트 전체를 JSON 문자열로 리턴해줌
  console.log("cartLog");
  if (req.session.list != undefined && req.session.list != null) {
    console.log("now list's state is " + JSON.stringify(req.session.list));
    res.send(JSON.stringify(req.session.list));
  }
  res.end();
})

router.get('/total', (req, res) =>  {   //세션 리스트의 각 개수와 가격을 곱한 값을 전부 더해서 리턴
  let total = 0;
  for(let i = 0; i < req.session.list.length; i++) {
    total += parseInt(req.session.list[i]["count"]) * parseInt(req.session.list[i]["price"]);
  }
  console.log("total Price is " + total);
  res.send({"total" : total});

})

router.get('/count', (req, res) =>  {   //세션 리스트의 각 개수와 가격을 곱한 값을 전부 더해서 리턴
  console.log("count is " + req.session.list.length)
  res.send({"count" :req.session.list.length});
})

router.post('/addcart', (req, res) => {   //세션 장바구니 리스트에 새 상품 추가

  let box = JSON.stringify(req.body);
  if (req.session.list == undefined || req.session.list == null) {  //장바구니 리스트가 없거나, 비어있다면 새로만들고 이번 요청 처리
    req.session.list = [];
    req.session.list.push(req.body);
  }
  else {
    let num = req.body["number"];
    let check = 0;
    for(let i = 0; i < req.session.list.length; i++) {    //리스트 전체를 순환하며 요청이 이미 존재하는 상품이라면 수량을 +1 함
      if(req.session.list[i]["number"] == num) {
        req.session.list[i]["count"] = req.session.list[i]["count"] + 1;
        check = 1;
      }
    }
    if(check == 0) req.session.list.push(req.body);   //요청이 리스트에 존재하지 않다면 새로 리스트에 추가함
  }
  res.end();
})

router.post('/deletecart', (req, res) => {    //요청하는 상품 번호에 해당하는 상품을 세션 리스트에서 삭제함

  let num = req.body["number"];
  req.session.list = req.session.list.filter(function (data) {    //요청 번호가 아닌 리스트의 원소들로만 이루어진 리스트를 리턴함
    return data["number"] != num;
  });
  res.end();
})

router.post('/minus', (req, res) => {   //장바구니 특정 품목 하나 수량 -
  let num = req.body["number"];
  for(var i = 0; i < req.session.list.length; i++) {
    if(req.session.list[i]["number"] == num) {
      req.session.list[i]["count"] = req.session.list[i]["count"] - 1;
      break;
    }
  }
  if(req.session.list[i]["count"] <= 0) {   //만약 해당 품목의 개수가 0이면 그냥 리스트에서 없앰
    req.session.list = req.session.list.filter(function (data) { 
      return data["number"] != num;
    });
  }
  
  res.end();
})

router.post('/plus', (req, res) => {   //장바구니 특정 품목 하나 수량 +
  let num = req.body["number"];
  console.log("plus method : num : length" + num + " " + req.session.list.length);
  for(let i = 0; i < req.session.list.length; i++) {
    if(req.session.list[i]["number"] == num) {
      req.session.list[i]["count"] = req.session.list[i]["count"] + 1;
      break;
    }
  }  
  res.end();
})

module.exports = router;
