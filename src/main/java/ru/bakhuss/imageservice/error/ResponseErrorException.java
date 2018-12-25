package ru.bakhuss.imageservice.error;

public class ResponseErrorException extends RuntimeException {
    public ResponseErrorException(String error) {
        super(error);
    }
}
