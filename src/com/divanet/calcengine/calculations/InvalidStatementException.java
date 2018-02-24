package com.divanet.calcengine.calculations;

public class InvalidStatementException extends Exception {

    public InvalidStatementException(String statement, String expression){
        super(statement + " : " + expression);
    }

    public InvalidStatementException(String operation, String statement, Throwable cause){
        super(operation, cause);
    }


}
