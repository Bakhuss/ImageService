package ru.bakhuss.imageservice.error;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Класс, перехватывающий исключения
 */
@RestControllerAdvice
public class ExceptionHandlerController {
    private final Logger log = LoggerFactory.getLogger(ExceptionHandlerController.class);

    @ExceptionHandler(RuntimeException.class)
    public ResponseError handlerException(RuntimeException ex) {
        ResponseError error = new ResponseError(ex.getMessage());
        log.error(ex.getMessage(), ex);
        return error;
    }
}
