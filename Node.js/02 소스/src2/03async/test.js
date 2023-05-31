const encrypte = (data) => {
    return new Promise((resolve, reject) => {
    console.log("암호화를 시작합니다. ");
    data = data + 1;
    
    console.log("암호화가 완료되었습니다.");
    if(data > 0) resolve(data);
    else reject(data);
  });
}
  
  encrypte(5)
    .then(display)
    .catch(err)
    .finally(compress)

  function compress() {
    console.log("압축을 시작합니다. ");
    console.log("압축이 완료되었습니다. ");
  }
  function display(result) {
    console.log("success!" + result);
  }
  
  function err(result) {
    console.log("error!" + result);
  }