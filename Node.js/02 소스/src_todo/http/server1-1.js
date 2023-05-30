const http = require('http');

const server = http.createServer((req, res) => {
  /* */ 'text/html; charset=utf-8' });
  /* */ '<h1>Hello Node!</h1>');
  /* */ ('<p>Hello Server!</p>');
});
/* */

/* */, () => {
  console.log('8080번 포트에서 서버 대기 중입니다!');
});
/* */, (error) => {
  console.error(error);
});
