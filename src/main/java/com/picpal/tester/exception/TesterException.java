package com.picpal.tester.exception;

public class TesterException extends RuntimeException {
    private int status;
    private String code;
    private String message;


    public TesterException(TesterExceptionCode testerExceptionCode) {
        this.status = testerExceptionCode.getStatus();
        this.code = testerExceptionCode.getCode();
        this.message = testerExceptionCode.getMessage();
    }
}
