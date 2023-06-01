// async function whatsYourFavorite() {
//     let fav = "Javascript";
//     return fav;
//   }
// async function displaySubject(subject) {
//     return `Hello, ${subject}`;
//   }
  
// whatsYourFavorite()
//     .then(displaySubject)
//     .then(console.log);
  
// Promise 
function whatsYourFavorite() { 
  let fav = "Javascript"; 
  for(let i = 0; i < 10; i++) console.log(i);
  return new Promise((resolve, reject) => resolve(fav)); 
} 
function displaySubject(subject) { 
  for(let i = 10; i < 20; i++) console.log(i);
  return new Promise((resolve, reject) => resolve(`Hello, ${subject}`)); 
} 
whatsYourFavorite() 
  .then(displaySubject)
  .then(console.log); 