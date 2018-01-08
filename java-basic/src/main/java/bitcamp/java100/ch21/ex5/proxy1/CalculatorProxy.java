package bitcamp.java100.ch21.ex5.proxy1;

public class CalculatorProxy implements Calculator{

    Calculator realworker = new CalculatorImpl(); 

    @Override
    public int plus(int a, int b) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int minus(int a, int b) {
        // TODO Auto-generated method stub
        return 0;
    }
}