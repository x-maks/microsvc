package ru.maks.equiron.microsvc.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * Автор: Максим Колобов
 * Дата: 22.09.2021
 * Время: 1:33
 */
public class Product {
    @NotEmpty(message = "{name.empty}")
    private String name;

    @NotNull(message = "{code.isnull}")
    @Pattern(regexp = "^[0-9]{13}$", message = "{code.wrong}")
    private String code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}