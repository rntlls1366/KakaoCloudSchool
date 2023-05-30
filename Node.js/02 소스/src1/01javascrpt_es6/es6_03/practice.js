data = [
    {id:1, name:"홍", score:10},
    {id:2, name:"김", score:100},
]

data.forEach( function (d) {
    if(d.score >= 100) console.log(d.name);
})

data.forEach( function(d) {
    for(key in d) {
        console.log(`${key} : ${id}<br>`);
    }
})