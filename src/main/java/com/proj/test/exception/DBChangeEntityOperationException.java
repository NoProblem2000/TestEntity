package com.proj.test.exception;

public class DBChangeEntityOperationException extends RuntimeException {
    public DBChangeEntityOperationException(String message) {
        super(message);
    }
}
