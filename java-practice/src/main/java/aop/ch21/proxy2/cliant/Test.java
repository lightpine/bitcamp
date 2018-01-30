package aop.ch21.proxy2.cliant;

import aop.ch21.proxy2.Calculator;

public class Test {
    public static void main(String[] args) {
        Calculator worker = new CalculatorStub();
        
        System.out.println(worker.plus(10, 20));
        System.out.println(worker.minus(10, 20));
        
    }
    
   
}
