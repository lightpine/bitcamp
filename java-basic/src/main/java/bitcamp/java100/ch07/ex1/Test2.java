// 상속 (inheritance) - 기존의 calculator에 곱하기 나누기 기능을 추가한다.
package bitcamp.java100.ch07.ex1;

// 기능 확장
// 방법 1 - 기존 클래스에 기능을 추가한다.
//          => 기존 소스코드에 새 코드를 추가하다보면 기존 코드를 건드리게 된다.
//          => 그러면 새로운 버그가 발생할 가능성이 있다.
//          => 그래서 가능한 기존 소스를 손대지 않는것이 유지보수에 좋다.
//          

// 방법 2 - 새 클래스를 만들어 기존 클래스의 코드를 복사하고 새 기능을 추가한다.
//          => 기존소스를 손대지 않기 때문에 버그가 발생할 가능성은 줄어든다.
//          => 문제는 
//              - 기존 코드를 복사 붙여넣기 해야하는 번거로움이 있다.
//              - 기존 코드에 버그가 있을 때 그 코드를 복사해서 만든 모든 새 코드는 
//              - 같은 버그를 같는다.
//              - 버그를 잡으려면 기존 코드 뿐만 아니라 복사해서 만든 모든 코드를 찾아서
//              - 바꿔야 하는 무지막지한 번거로움이 생긴다.
public class Test2 {
    public static void main(String[] args) {
        CalculatorA calc = new CalculatorA();
        calc.plus(10);
        calc.plus(20);
        calc.minus(7);
        calc.multiple(2);
        calc.divide(3);
        calc.divide(0);
        
        System.out.println(calc.result);
    }
}
