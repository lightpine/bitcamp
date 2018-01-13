"use strict"
//함수 - 파라미터로 전달하기

function play(a, b, fn) {
    fn(a, b);
}

function plus(a, b) {
    console.log(a, '+', b, '=', a + b)
}

function minus(a, b) {
    console.log(a, '-', b, '=', a - b)
}

// 함수를 호출할 때 아규먼트로 함수를 넘겨 준다.

play(10, 20, plus)
play(10, 20, minus)