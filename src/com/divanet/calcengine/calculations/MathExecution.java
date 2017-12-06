package com.divanet.calcengine.calculations;

public class MathExecution {

    private double leftVal;
    private double rightVal;
    private char opcode;
    private double result;

    public MathExecution(){

    }

    public MathExecution(char opcode){
        this.opcode = opcode;
    }

    public MathExecution(double leftVal, double rightVal, char opcode){
        this(opcode);
        this.leftVal = leftVal;
        this.rightVal = rightVal;
//        this.opcode = opcode;
    }

    public double getLeftVal() {
        return leftVal;
    }

    public void setLeftVal(double leftVal) {
        this.leftVal = leftVal;
    }

    public double getRightVal() {
        return rightVal;
    }

    public void setRightVal(double rightVal) {
        this.rightVal = rightVal;
    }

    public char getOpcode() {
        return opcode;
    }

    public void setOpcode(char opcode) {
        this.opcode = opcode;
    }

    public double execute(double leftVal, double rightVal ){
        this.leftVal = leftVal;
        this.rightVal = rightVal;
        result = execute();
        return  result;
    }

    public double execute(int leftVal, int rightVal ){
        this.leftVal = leftVal;
        this.rightVal = rightVal;
        result = (int)execute();
        return  result;
    }

    public double execute(){
        double result = 0.0;
        switch (this.opcode){
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            case 'd':
                result = rightVal != 0.0 ? leftVal / rightVal : 0.0;
//                if(rightVal != 0.0){
//                    result = leftVal/rightVal;
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
