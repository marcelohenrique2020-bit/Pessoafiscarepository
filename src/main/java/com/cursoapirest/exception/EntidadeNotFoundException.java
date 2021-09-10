package com.cursoapirest.exception;

public class EntidadeNotFoundException extends RuntimeException {
    private final long serialversionUID = 1L;

    public EntidadeNotFoundException(String msg) { super(msg);}

}
