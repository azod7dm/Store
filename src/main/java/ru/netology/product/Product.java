package ru.netology.product;

public class Product {
    private final int id;
    private final String name;
    private final double price;
    private final String category;
    private int rating;

    public Product(int id, String name, double price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.rating = 0; // По умолчанию рейтинг равен 0
    }

    // Геттеры для атрибутов
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}

