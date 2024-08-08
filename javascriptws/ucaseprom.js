

function ucaseasync(str){
    var p = new Promise(function(resolve,reject){
        resolve(str.toUpperCase());
    });
    return p;
}

ucaseasync('hello hsbc').then(function(r){
    console.log(r);
});

console.log("===========================");
console.log("===========================");
console.log("===========================");



