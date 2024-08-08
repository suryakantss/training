
async function add(a, b) {
    if (a < 0 || b < 0)
        throw new Error('Invalid Nos..')
    return a + b;
}
async function test() {
    try {
        let res = await add(-10, 20);
        console.log(res);
    } catch (err) {
        console.log(err.message);
    }
}
test();
console.log('Hi!!!');
console.log('Hello!!!');