package com.java.exception;

public class DataNotFoundException extends RuntimeException {
    public  DataNotFoundException(String msg) {
        super(msg);
    }
}
