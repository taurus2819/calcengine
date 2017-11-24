package com.divanet.calcengine;

import com.divanet.calcengine.util.InputHelper;

public class Main {

    public static void main(String[] args) {
        double val1 ;
        double val2;
        double result;
        char opCode;

        opCode = InputHelper.getCharInput("Enter a character (a - add, s - subtract, m - multiply, d - division): ");
        val1 = InputHelper.getDoubleInput("Enter the first floating point value : ");
        val2 = InputHelper.getDoubleInput("Enter the second floating point value : ");

        switch (opCode){
            case 'a':
                result = val1 + val2;
                break;
            case 's':
                result = val1 - val2;
                break;
            case 'm':
                result = val1 * val2;
                break;
            case 'd':
                result = val2 != 0.0 ? val1 / val2 : 0.0;
//                if(val2 != 0.0){
//                    result = val1/val2;
//                }
//                else{
//                    result = 0.0;
//                }
                break;
            default:
                System.out.println("Error - Invalid opcode");
                result = 0.0;
                break;
        }

        System.out.println("Calculated value = " + result);



    }
}
