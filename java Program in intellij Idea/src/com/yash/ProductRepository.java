package com.yash;

import java.util.ArrayList;

public class ProductRepository {
    private ArrayList<Product> products = new ArrayList<>();

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void add(Product product ) {
        products.add(product);
    }

    public void add(int id,String name, String category,double price/*,boolean available*/) {
        products.add(new Product(id,name,category,price/*,available)*/));
    }

   /* public boolean removeById(int id) {
        // TODO
    }

    public boolean removeByName(String name) {
        // TODO
    }

    public boolean removeByCategory(String category) {
        // TODO
    }

    public void SortById() {
        // TODO
    }

    public void sortByName() {
        // TODO
    }*/
}
