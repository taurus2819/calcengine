package com.divanet.calcengine;

import com.divanet.calcengine.calculations.MathExecution;
import com.divanet.calcengine.util.InputHelper;

public class Main {

    public static void main(String[] args) {

        MathExecution[] equations = new MathExecution[4];
        equations[0] = new MathExecution(100.0d, 50.0d, 'd');
        equations[1] = new MathExecution(25.0d, 92.0d, 'a');
        equations[2] = new MathExecution(225.0d, 17.0d, 's');
        equations[3] = new MathExecution(11.0d, 3.0d, 'm');

        for (MathExecution eqtn : equations) {
            System.out.println(eqtn.execute());
        }

    }
}
