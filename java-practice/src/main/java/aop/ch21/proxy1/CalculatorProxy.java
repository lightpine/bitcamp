package aop.ch21.proxy1;

public class CalculatorProxy implements Calculator{
    
    Calculator realwork = new CalculatorImpl();
    
    @Override
    public int plus(int a, int b) {
        return realwork.plus(a, b);
    }

    @Override
    public int minus(int a, int b) {
        return realwork.minus(a, b);
    }
    

}
