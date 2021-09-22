package ru.maks.equiron.microsvc.model;

/**
 * Автор: Максим Колобов
 * Дата: 22.09.2021
 * Время: 4:17
 */
public class Violation {
    private final String fieldName;
    private final String message;

    public Violation(String fieldName, String message) {
        this.fieldName = fieldName;
        this.message = message;
    }

    public String getFieldName() {
        return fieldName;
    }

    public String getMessage() {
        return message;
    }
}
