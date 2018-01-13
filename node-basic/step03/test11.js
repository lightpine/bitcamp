// 객체 - 객체와 함

// 함수도 객체다!
// 함수 = 객체 + 함수코드
//
// 자바코드로 비유하자면
// Map<String, Object> obj = new HashMap<>();
// obj.put("name", "aaa");
// obj.put("age", 20);
// => 여기까지가 일반 객체라면
//    함수 객체는 여기에 코드까지 들어간다.
// obj.put("code", "{console.log('okok'); var a = 20; a++;}");
//

function fn (){
    console.log('okok');
}
fn.user = "홍길동";
fn.age = 20;
fn.plus = function(a, b) {
    console.log(a + b);
};

fn();

console.log(fn.user);
console.log(fn.age);
fn.plus(10, 20);
