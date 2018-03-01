package com.divanet.calcengine.util;

import com.divanet.calcengine.calculations.InvalidStatementException;
import com.divanet.calcengine.calculations.MathProcessing;

import java.util.ArrayList;
import java.util.List;

public class DynamicHelper {
    private MathProcessing[] handlers;
    private List<String> handlerKeywords = new ArrayList<>();

    public DynamicHelper(MathProcessing[] handlers){
        this.handlers = handlers;
        collectHandleKeywords();
    }

    private void collectHandleKeywords() {
        for (MathProcessing handle : handlers){
            handlerKeywords.add(handle.getKeyword());
        }
    }

    public String processCalcOperations(String operation) throws InvalidStatementException {
        String[] parts = operation.split(MathProcessing.SPACE);
        if(parts.length != 3){
            throw new InvalidStatementException("Incorrect number of fields", operation);
        }

        String keyword = parts[0];
        StringBuilder sb = new StringBuilder(20);
        for (MathProcessing handle : handlers) {
            if (handlerKeywords.contains(keyword)) {
                if(handle.getKeyword().equalsIgnoreCase(keyword)) {
                    double leftVal = 0;
                    double rightVal = 0;
                    try {
                        leftVal = Double.parseDouble(parts[1]);
                        rightVal = Double.parseDouble(parts[2]);
                    } catch (NumberFormatException e) {
                        throw new InvalidStatementException("Invalid type", operation, e);
                    }
                    sb.append(leftVal);
                    sb.append(handle.getSymbol());
                    sb.append(rightVal);
                    sb.append("=");
                    sb.append(handle.calculation(leftVal, rightVal));
                    break;
                }
            }else{
                throw new InvalidStatementException("Invalid keyword", keyword);
            }
            continue;
        }
        handlers = null;
        return sb.toString();
    }
}
