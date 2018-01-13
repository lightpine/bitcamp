"use strict"
//함수 - 함수 호이스팅(hoisting)

// 항상 함수 정의가 먼저 실행 된다.

// 밑에 함수 정의코드가 먼저실행된 후 다음 문잔이 실행된다.
var result = f1 (10, 20)
console.log(result)

// 이렇게 밑에 정의된 함수가 위로 끌어올려져 먼저 실행된다고 해서
// "함수 호이스팅(function hoisting)" 이라 부른다.
function f1(a, b){
    return a+b;
}