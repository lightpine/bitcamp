package aop.ch21.proxy1;

public class test {
    public static void main(String[] args) {
        Calculator worker = new CalculatorProxy();
        System.out.println(worker.minus(10, 20));
        System.out.println(worker.plus(10, 20));
    }
}
