package com.company.exceptions;

public class NoSuchPersonException extends RuntimeException{

    public NoSuchPersonException() {
    }

    public NoSuchPersonException(String message) {
        super(message);
    }


}
