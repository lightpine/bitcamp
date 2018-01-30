package aop.ch21.proxy1;

public class CalculatorImpl implements Calculator{

    @Override
    public int plus(int a, int b) {
        return a + b;
    }

    @Override
    public int minus(int a, int b) {
        return a - b;
    }
    

}
