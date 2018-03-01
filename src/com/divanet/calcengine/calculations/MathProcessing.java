package com.divanet.calcengine.calculations;

public interface MathProcessing {
    String SPACE = " ";
    String getKeyword();
    String getSymbol();
    double calculation(double leftVal, double rightVal);
}
