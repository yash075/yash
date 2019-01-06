package com.yash;

import java.util.ArrayList;

public class FirstProductProgramMain {

    public static void main(String []args) {
        ArrayList<Product> products = new ArrayList<>();

        // Add element
        products.add(new Product(1,"Nataraj HB 6","Pencil",5.6));
        products.add(new Product(2,"classmate","notebook",30));
        products.add(new Product(3,"goldex","pen",5));
        products.add(new Product(4,"camel","pencil",6));

        // get element
        products.get(0).printProduct();
        products.get(1).printProduct();
        products.get(2).printProduct();
        products.get(3).printProduct();

        // set element
        products.get(0).setId(11);

    }
}
