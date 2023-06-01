member1 = { name:"aa", score:1000};
member2 = { name:"bb", score:200};
member3 = { name:"cc", score:300};
members = [member1, member2, member3];

members.sort(function(a, b) {
    if(a.score > b.score) return 1;
    else if(b.score > a.score) return -1;
    else return 0;
});

members.forEach(function(name) {
    console.log(name);
});