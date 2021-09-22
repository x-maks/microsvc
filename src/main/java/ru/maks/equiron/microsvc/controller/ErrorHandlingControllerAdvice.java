package ru.maks.equiron.microsvc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import ru.maks.equiron.microsvc.model.DocResponse;
import ru.maks.equiron.microsvc.model.Violation;

import javax.validation.ConstraintViolationException;
import java.util.stream.Collectors;

/**
 * Автор: Максим Колобов
 * Дата: 22.09.2021
 * Время: 4:07
 */
@ControllerAdvice
class ErrorHandlingControllerAdvice {

    @ExceptionHandler(ConstraintViolationException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    DocResponse onConstraintValidationException(
            ConstraintViolationException e) {
        return new DocResponse(HttpStatus.UNPROCESSABLE_ENTITY, e.getConstraintViolations()
                .stream().map(v -> new Violation(v.getPropertyPath().toString(), v.getMessage())).collect(Collectors.toList()));
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    DocResponse onMethodArgumentNotValidException(
            MethodArgumentNotValidException e) {
        return new DocResponse(HttpStatus.UNPROCESSABLE_ENTITY, e.getBindingResult().getFieldErrors()
                .stream().map(v -> new Violation(v.getField(), v.getDefaultMessage())).collect(Collectors.toList()));
    }

}
