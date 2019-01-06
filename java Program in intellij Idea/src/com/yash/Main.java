package com.yash;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String []args) {
        ArrayList<Invoice> invoices = new ArrayList<>();
        int ch, no, billNo = 1000, productId;
        double productPrice;
        String customerName, customerAddress, productName, productCategory;
        ArrayList<Product> products = new ArrayList<>();
        //Scanner s = new Scanner(System.in);
        //Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("\n\n1.Add the Invoice\n2.Stop the Invoice\nEnter the number:=");
            ch = new Scanner(System.in).nextInt();
            switch (ch) {
                case 1:
                    Invoice invoice = new Invoice();
                    billNo = billNo + 1;
                    invoice.setBillNo(billNo);
                    invoice.setBillDate(new Date());
                    System.out.print("Enter the name:= ");
                    customerName = new Scanner(System.in).next();
                    System.out.print("Enter the Address:= ");
                    customerAddress = new Scanner(System.in).next();
                    invoice.setCustomer(new Customer(customerName, customerAddress));
                    while (true) {
                        System.out.print("\n1.add the Product \n2.Not add the Product \n\tEnter the any Choice:= ");
                        no = new Scanner(System.in).nextInt();
                        switch (no) {
                            case 1:
                                System.out.print("\nEnter the Product Id:= ");
                                productId = new Scanner(System.in).nextInt();

                                System.out.print("\nEnter the Product Name:= ");
                                productName = new Scanner(System.in).next();
                                System.out.print("\nEnter the Product Category:= ");
                                productCategory = new Scanner(System.in).next();
                                System.out.print("\nEnter the Product Price:= ");
                                productPrice = new Scanner(System.in).nextDouble();
                                //System.out.print("Enter the Product Avalible ");
                                invoice.addProduct(new Product(productId, productName, productCategory, productPrice));
                                break;
                            case 2:
                                break;
                            default:
                                System.out.print("\n\n\tEnter the 1 or 2 not the enter the any number...Try Again...");
                        }
                        if (no == 2) {
                            break;
                        }
                    }
                    invoices.add(invoice);
                    break;
                case 2:
                    break;
                default:
                    System.out.print("\n\n\tEnter the 1 or 2 not the enter the any number...Try Again...");
            }
            if (ch == 2) {
                break;
            }
        }
    }
}
