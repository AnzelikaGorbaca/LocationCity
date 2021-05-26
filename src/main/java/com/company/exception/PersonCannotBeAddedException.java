package com.company.exception;

public class PersonCannotBeAddedException extends RuntimeException{

    public PersonCannotBeAddedException() {
    }

    public PersonCannotBeAddedException(String message) {
        super(message);
    }
}
