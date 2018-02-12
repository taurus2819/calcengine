package com.divanet.calcengine.calculations;

public class Multiplier extends CalculateBase {
    public Multiplier(){}
    public Multiplier(double left, double right){
        super(left, right);
    }

    @Override
    public void calculate() {
        System.out.println("Multiplying operation");
        double result = getLeftVal() * getRightVal();
        setResult(result);
    }

}
