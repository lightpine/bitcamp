"use strict"
// 변수 선언 - 블록과 로컬변수

var v1 = 100;

{
    var v2 = 200;
}

console.log(v1) // ok
console.log(v2) // ok

function test() {
    var a = 100;
    {
        var b = 200; // 함수의 로컬 변수이다. 블록은 무시된다.
    }
        
        console.log(v1)
        console.log(v2)
        
        console.log(a)
        console.log(b)
}
console.log("--------------------------------------")

test()

