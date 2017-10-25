// 상속 (inheritance) - 기존의 calculator에 더하기 빼기 기능을 추가한다.
package bitcamp.java100.ch07.ex2;

// 상속으로 기능 확장하기
// 상속을 이용하면 기존의 코드를 손대지 않고
// 기능을 확장할 수 있따.
// 기존의 기능을 복사할 필요도 없다 
// 단지 기존 코드의 링크 정보를 기술한 다음에
// 새 기능을 추가하면 된다.
// 이때 상송을 해주는 클래스를 수퍼(super)클래스 또는 부모(parent) 클래스 라 한다.
// 상속을 받는 클래스를 서버(sub)/자식(child)라 한다.
public class Test2 {
    public static void main(String[] args) {
        CalculatorA calc = new CalculatorA();
        calc.plus(10);
        calc.plus(20);
        calc.minus(7);
        calc.multiple(2);
        calc.divide(3);
        
        System.out.println(calc.result);
    }
}
