package com.yash;

import java.util.ArrayList;
import java.util.Date;

public class Invoice {
    private int billNo;
    private Date billDate;
    private Customer customer;
    private ArrayList<Product> products;


    public int getBillNo() {
        return billNo;
    }

    public void setBillNo(int billNo) {
        this.billNo = billNo;
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public Invoice(int billNo, Date billDate, Customer customer, ArrayList<Product> products) {
        this.billNo = billNo;
        this.billDate = billDate;
        this.customer = customer;
        this.products = products;
    }

    public Invoice() {
        this.products = new ArrayList<>();
    }

    public static void display() {

    }
}
