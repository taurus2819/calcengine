package com.divanet.calcengine;

import com.divanet.calcengine.calculations.MathExecution;
import com.divanet.calcengine.util.InputHelper;

public class Main {

    public static void main(String[] args) {

        MathExecution[] equations = new MathExecution[4];
        equations[0] = create(100.0d, 50.0d, 'd');
        equations[1] = create(25.0d, 92.0d, 'a');
        equations[2] = create(225.0d, 17.0d, 's');
        equations[3] = create(11.0d, 3.0d, 'm');

        for (MathExecution eqtn : equations) {
            System.out.println(eqtn.getResult());
        }
    }

    public static MathExecution create(double leftVal, double rightVal, char operation){
        MathExecution equation = new MathExecution();
        equation.setVal1(leftVal);
        equation.setVal2(rightVal);
        equation.setOpcode(operation);
        return equation;
    }
}
