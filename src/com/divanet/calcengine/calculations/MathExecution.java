package com.divanet.calcengine.calculations;

public class MathExecution {

    private double val1;
    private double val2;
    private char opcode;

    public MathExecution(double val1, double val2, char opcode){
        this.val1 = val1;
        this.val2 = val2;
        this.opcode = opcode;
    }

    public double execute(){
        double result = 0.0;
        switch (this.opcode){
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
                break;
        }
        return result;
    }
}
