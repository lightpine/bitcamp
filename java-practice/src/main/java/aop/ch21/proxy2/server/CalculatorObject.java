package aop.ch21.proxy2.server;

import aop.ch21.proxy2.Calculator;

public class CalculatorObject implements Calculator{

    @Override
    public int plus(int a, int b) {
        return a + b;
    }

    @Override
    public int minus(int a, int b) {
        return a - b;
    }

}
