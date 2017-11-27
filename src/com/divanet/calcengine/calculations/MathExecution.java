package com.divanet.calcengine.calculations;

public class MathExecution {

    private double val1;
    private double val2;
    private char opcode;
    private double result = 0.0;

    public MathExecution(){
    }

    public double getVal1() {
        return val1;
    }

    public void setVal1(double val1) {
        this.val1 = val1;
    }

    public double getVal2() {
        return val2;
    }

    public void setVal2(double val2) {
        this.val2 = val2;
    }

    public char getOpcode() {
        return opcode;
    }

    public void setOpcode(char opcode) {
        this.opcode = opcode;
    }

    public double getResult() {
        result = execute();
        return result;
    }

    private double execute(){

        switch (this.opcode){
            case 'a':
                this.result = val1 + val2;
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
