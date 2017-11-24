package com.divanet.calcengine;

import com.divanet.calcengine.util.InputHelper;

public class Main {

    public static void main(String[] args) {
        double[] val1 = {100.0d, 25.0d, 225.0d, 11.0d} ;
        double[] val2 = {50.0d, 92.0d, 17.0d, 3.0d};
        double[] result = new double[val1.length];
        char[] opCode = {'d', 'a', 's', 'm'};


//        opCode = InputHelper.getCharInput("Enter a character (a - add, s - subtract, m - multiply, d - division): ");
//        val1 = InputHelper.getDoubleInput("Enter the first floating point value : ");
//        val2 = InputHelper.getDoubleInput("Enter the second floating point value : ");

        for(int i = 0; i < opCode.length; i++) {

            switch (opCode[i]) {
                case 'a':
                    result[i] = val1[i] + val2[i];
                    break;
                case 's':
                    result[i] = val1[i] - val2[i];
                    break;
                case 'm':
                    result[i] = val1[i] * val2[i];
                    break;
                case 'd':
                    result[i] = val2[i] != 0.0 ? val1[i] / val2[i] : 0.0;
//                if(val2 != 0.0){
//                    result = val1/val2;
//                }
//                else{
//                    result = 0.0;
//                }
                    break;
                default:
                    System.out.println("Error - Invalid opcode");
                    break;
            }
        }

        for (double val : result) {
            System.out.println(val);
        }



    }
}
