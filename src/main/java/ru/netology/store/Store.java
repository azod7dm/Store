package ru.netology.store;

import ru.netology.product.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Store {
    private final List<Product> products;

    public Store() {
        this.products = new ArrayList<>();
        // Инициализация списка товаров
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> filterProducts(String keyword) {
        return products.stream()
                .filter(p -> p.getName().contains(keyword))
                .collect(Collectors.toList());
    }

    public List<Product> getProducts() {
        return products;
    }
}

