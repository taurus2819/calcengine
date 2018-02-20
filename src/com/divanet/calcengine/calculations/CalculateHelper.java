package com.divanet.calcengine.calculations;

public class CalculateHelper {
    MathOperation operation;
    double leftValue;
    double rightValue;
    double result;

    public CalculateHelper(){}

    public void process(String info){
        try {
            String[] part = info.split(" ");
            String command = part[0];
            this.leftValue = Double.parseDouble(part[1]);
            this.rightValue = Double.parseDouble(part[2]);

            setCalcOperation(command);

            CalculateBase calculator = null;
            switch (this.operation){
                case ADD:
                    calculator = new Adder(this.leftValue, this.rightValue);
                    break;
                case SUBTRACT:
                    calculator = new Subtractor(this.leftValue, this.rightValue);
                    break;
                case DIVISION:
                    calculator = new Divider(this.leftValue, this.rightValue);
                    break;
                case MULTIPLICATION:
                    calculator = new Multiplier(this.leftValue, this.rightValue);
                    break;
                default:
                    System.out.println("This operation not supported..");
            }
            calculator.calculate();
            this.result = calculator.getResult();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    private void setCalcOperation(String calcOperation) {

        if(calcOperation.equalsIgnoreCase(MathOperation.ADD.toString())){
            this.operation = MathOperation.ADD;
        }else if(calcOperation.equalsIgnoreCase(MathOperation.SUBTRACT.toString())){
            this.operation = MathOperation.SUBTRACT;
        }else if(calcOperation.equalsIgnoreCase(MathOperation.DIVISION.toString())){
            this.operation = MathOperation.DIVISION;
        }else if(calcOperation.equalsIgnoreCase(MathOperation.MULTIPLICATION.toString())){
            this.operation = MathOperation.MULTIPLICATION;
        }

    }

    public String toString(){
        StringBuilder sb = new StringBuilder(20);
        String symbol = " ";
        switch (this.operation){
            case ADD:
                symbol = " + ";
                break;
            case SUBTRACT:
                symbol = " - ";
                break;
            case DIVISION:
                symbol = " / ";
                break;
            case MULTIPLICATION:
                symbol = " * ";
                break;
        }
        sb.append(this.leftValue);
        sb.append(symbol);
        sb.append(this.rightValue);
        sb.append("=");
        sb.append(this.result);
        return sb.toString();
    }
}
