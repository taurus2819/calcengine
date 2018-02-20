package com.divanet.calcengine.calculations;

public class CalculateHelper {
    MathOperation operation;
    double leftValue;
    double rightValue;
    double result;

    public CalculateHelper(){}

    public void process(String info){
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
        }
        calculator.calculate();
        this.result = calculator.getResult();
    }

    private void setCalcOperation(String calcOperation) {

        if(calcOperation.equalsIgnoreCase(MathOperation.ADD.toString())){
            this.operation = MathOperation.ADD;
        }else if(calcOperation.equalsIgnoreCase(MathOperation.SUBTRACT.toString())){
            this.operation = MathOperation.SUBTRACT;
        }

    }

    public String toString(){
        StringBuilder sb = new StringBuilder(20);
        switch (this.operation){
            case ADD:
                sb.append(this.leftValue);
                sb.append("+");
                sb.append(this.rightValue);
                sb.append("=");
                sb.append(this.result);
                break;
            case SUBTRACT:
                sb.append(this.leftValue);
                sb.append("-");
                sb.append(this.rightValue);
                sb.append("=");
                sb.append(this.result);
                break;
        }
        return sb.toString();
    }
}
