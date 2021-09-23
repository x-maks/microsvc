package ru.maks.equiron.microsvc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.maks.equiron.microsvc.model.DocResponse;
import ru.maks.equiron.microsvc.model.DocumentCrpt;

import javax.validation.Valid;

/**
 * Автор: Максим Колобов
 * Дата: 22.09.2021
 * Время: 1:26
 */
@Validated
@RestController
@RequestMapping("/doc")
public class DocumentController {

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public DocResponse create(@Valid @RequestBody DocumentCrpt document) {

        return new DocResponse(HttpStatus.CREATED);
    }
}
