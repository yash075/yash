package com.Product.yash;

public class Product {
    private int id;
    private String name;
    private String unit;
    private boolean available;
    private double rate;
    private double discount;

    public Product(int id, String name, String unit, boolean available, double rate, double discount) {
        this.id = id;
        this.name = name;
        this.unit = unit;
        this.available = available;
        this.rate = rate;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
