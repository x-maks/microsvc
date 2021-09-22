package ru.maks.equiron.microsvc.model;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.List;

/**
 * Автор: Максим Колобов
 * Дата: 22.09.2021
 * Время: 1:32
 */
public class DocumentCrpt {
    @NotNull(message = "{seller.isnull}")
    @Pattern(regexp = "^[0-9]{9}$", message = "{seller.wrong}")
    private String seller;

    @NotNull(message = "{customer.isnull}")
    @Pattern(regexp = "^[0-9]{9}$", message = "{customer.wrong}")
    private String customer;

    @Valid
    @NotEmpty(message = "{products.empty}")
    private List<Product> products;

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
