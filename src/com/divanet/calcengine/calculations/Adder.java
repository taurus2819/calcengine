package com.divanet.calcengine.calculations;

public class Adder extends CalculateBase {
    public Adder(){}
    public Adder(double left, double right){
        super(left, right);
    }

    @Override
    public void calculate() {
        System.out.println("Adding operation");
        double result = getLeftVal() + getRightVal();
        setResult(result);
    }

}
