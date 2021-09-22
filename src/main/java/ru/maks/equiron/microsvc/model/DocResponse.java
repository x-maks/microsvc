package ru.maks.equiron.microsvc.model;

import org.springframework.http.HttpStatus;

import java.util.List;

/**
 * Автор: Максим Колобов
 * Дата: 22.09.2021
 * Время: 2:11
 */
public class DocResponse {
    private final HttpStatus status;
    private List<Violation> errors;

    public DocResponse(HttpStatus status) {
        this.status = status;
    }

    public DocResponse(HttpStatus status, List<Violation> errors) {
        this.status = status;
        this.errors = errors;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public List<Violation> getErrors() {
        return errors;
    }
}

