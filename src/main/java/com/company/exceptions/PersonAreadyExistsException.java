package com.company.exceptions;

public class PersonAreadyExistsException extends RuntimeException{

    public PersonAreadyExistsException() {
    }

    public PersonAreadyExistsException(String message) {
        super(message);
    }
}
