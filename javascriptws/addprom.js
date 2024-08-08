function add(a, b) {

    var p = new Promise(function (resolve, reject) {
        if (a < 0 || b < 0)
            reject('Invalid Nos.');
        var sum = a + b;
        resolve(sum);
    });
    return p;
}

add(100, 20).then(function (s) {
    console.log(s);
}).catch(function (err) {
    console.log(err);
});

console.log('END!!!!');