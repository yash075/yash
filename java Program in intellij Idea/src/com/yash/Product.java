package com.yash;

import java.util.Objects;

public class Product {
    private int id;
    private String name;
    private String category;
    private double price;
   // private boolean available;

    // Constructor
    public Product(int id, String name, String category, double price/*, boolean available*/) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    //    this.available = available;
    }

    // Getter and Setter Method
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /*public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
*/
    public void printProduct() {
        System.out.print("\nid : "+this.id);
        System.out.print("\nname : "+this.name);
        System.out.print("\ncategory : "+this.category);
        System.out.print("\nprice : "+this.price);
       // System.out.print("\nAvailable : "+this.available);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return getId() == product.getId() &&
                Double.compare(product.getPrice(), getPrice()) == 0 &&
                Objects.equals(getName(), product.getName()) &&
                Objects.equals(getCategory(), product.getCategory());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getCategory(), getPrice());
    }
}
