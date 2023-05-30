const express = require('express');
const path = require('path');

const router = express.Router();


router.get('/', (req, res) => {
  req.session.num = 0;

  res.render('order', { price: req.session.num });
  });

router.get('/on', (req, res) => {
  // const url = new URL(req.url, 'http://localhost:3005');
  // const price = url.searchParams.get('price');
  const price = req.query['price'];
  if(price == ("init")) req.session.num = 0;
  else req.session.num = parseInt(req.session.num) + parseInt(price);

  
  console.log(req.session.num);
  res.render('order', {price:req.session.num});
});
 
router.get('/init', (req, res) => {
  console.log("init");
  req.session.num = 0;
  res.render('order', { price: req.session.num });
}
);


module.exports = router;
