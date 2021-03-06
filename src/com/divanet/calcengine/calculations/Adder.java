package com.divanet.calcengine.calculations;

public class Adder extends CalculateBase implements MathProcessing{
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

    @Override
    public String getKeyword() {
        return "add";
    }

    @Override
    public String getSymbol() {
        return "+";
    }

    @Override
    public double calculation(double leftVal, double rightVal) {
        setLeftVal(leftVal);
        setRightVal(rightVal);
        calculate();
        return getResult();
    }
}
