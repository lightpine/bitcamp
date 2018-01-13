"use strict"
//함수 - 익명 함수 만들기

// 함수의 이름 없이 정의 할 때는,
// 정의하는 즉시 함수의 주소를 변수에 저장해야 한다.

var plus = function(a, b) {
    return a + b
}
console.log(plus(20, 30))

var plus

plus = function(a, b) {
    return a + b
}
console.log(plus(30, 40))
