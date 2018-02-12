package com.divanet.calcengine.calculations;

public class Subtractor extends CalculateBase {
    public Subtractor(){}
    public Subtractor(double left, double right){
        super(left, right);
    }

    @Override
    public void calculate() {
        System.out.println("Subtracting op");
        double result = getLeftVal() - getRightVal();
        setResult(result);
    }

}
