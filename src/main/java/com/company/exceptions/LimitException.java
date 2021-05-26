package com.company.exceptions;

public class LimitException extends RuntimeException {
    public LimitException() {
    }

    public LimitException(String message) {
        super(message);
    }
}
