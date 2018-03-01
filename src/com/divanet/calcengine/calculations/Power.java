package com.divanet.calcengine.calculations;

public class Power extends CalculateBase implements MathProcessing {

    public Power(){}
    public Power(double base, double power){
        super(base, power);
    }
    @Override
    public void calculate() {
        System.out.println("...power operation");
        double base = getLeftVal();
        double power = getRightVal();
        double result = Math.pow(base, power);
        setResult(result);
    }

    @Override
    public String getKeyword() {
        return "power";
    }

    @Override
    public String getSymbol() {
        return "^";
    }

    @Override
    public double calculation(double leftVal, double rightVal) {
        setLeftVal(leftVal);
        setRightVal(rightVal);
        calculate();
        return getResult();
    }
}
