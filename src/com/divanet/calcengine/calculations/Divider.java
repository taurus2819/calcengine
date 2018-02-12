package com.divanet.calcengine.calculations;

public class Divider extends CalculateBase {
    public Divider(){}
    public Divider(double left, double right){
        super(left, right);
    }

    @Override
    public void calculate() {
        System.out.println("Dividing operation");
        double result = getLeftVal() / getRightVal();
        setResult(result);
    }

}
