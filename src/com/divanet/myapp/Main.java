package com.divanet.myapp;

import com.divanet.calcengine.calculations.*;
import com.divanet.calcengine.util.CalculateHelper;
import com.divanet.calcengine.util.DynamicHelper;
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

        //overloading the constructors and overloading methods
        System.out.println("Overloading the constructors and Overloading methods");

        double leftDouble = 9.0d;
        double rightDouble = 4.0d;
        MathExecution eqnOverloaded = new MathExecution('d');
        System.out.println(eqnOverloaded.execute(leftDouble, rightDouble));

        int leftInt = 9;
        int rightInt = 4;
        System.out.println(eqnOverloaded.execute(leftInt, rightInt));

        System.out.println(eqnOverloaded.execute((double)leftInt, rightInt));

        System.out.println("\n");
        System.out.println("Inheritance operation ");
        System.out.println("\n");

        CalculateBase[] calculators = {
                new Adder(25.0d, 92.0d ),
                new Subtractor(255.0d, 17.0d),
                new Divider(100.0d, 50.0d),
                new Multiplier(11.0d, 3.0d)
        };

        for(CalculateBase calculate : calculators){
            calculate.calculate();
            System.out.println(calculate.getResult());
        }

//        for(CalculateBase calculate : calculators){
//            System.out.println(calculate.getResult());
//        }

        System.out.println("\n");
        System.out.println("Data Types - String classs");
        System.out.println("\n");

        String[] ops = {
                "add 1.0",
                "add xx 1.0",
                "addx 3.0 1.0",
                "add 25.0 92.0",
                "subtract 255.0 17.0",
                "division 100.0 50.0",
                "multiplication 11.0 3.0",
        };

        CalculateHelper calcHelper = new CalculateHelper();
        for(String calculate : ops){
            try {
                calcHelper.process(calculate);
                System.out.println(calcHelper);
            } catch (InvalidStatementException e) {
                System.out.println(e.getMessage());
                if(e.getCause() != null){
                    System.out.println("  Original Exception : " + e.getCause().getMessage());
                }
            }
        }

        System.out.println("\n");
        System.out.println("Dynamic calc operations - interfaces");
        System.out.println("\n");

        String[] calcOps = {
                "add 25.0 92.0",
                "add xx 1.0",
                "addx 3.0 1.0",
                "power 5.0 2.0",
                "add 40.0 44.0"
        };

        for (String calculation : calcOps) {
            DynamicHelper dynHelper = new DynamicHelper(new MathProcessing[]{
                    new Adder(),
                    new Power()
            });
            try {
                System.out.println(dynHelper.processCalcOperations(calculation));
            } catch (InvalidStatementException e) {
                System.out.println(e.getMessage());
                if(e.getCause() != null){
                    System.out.println("...cause is " + e.getCause().getMessage());
                }
            }
        }









    }
}
