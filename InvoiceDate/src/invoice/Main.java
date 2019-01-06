package invoice;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        display();
        display();

    }
    public static void display(){
        int no=1;
        double total=0;
        ArrayList<Product> product=new ArrayList<>();
        product.add(new Product("pen",1,30,10));
        product.add(new Product("Hi-Li",5,50,10));
        Customer cust=new Customer("sc","45 sdghbhjvbhjsa");
        Date ms=new Date();
        Invoice inv = new Invoice(001,ms,cust,product);
        System.out.println(" ----------------------------------------");
        System.out.println("|Bill No: "+inv.getBillNo()
                +"\t\t\t\t |\n|Bill Date: "
                +inv.getBillDate()+" |\n|customer Name: "+cust.getName()
                +"\t\t\t |\n|customer address: "
                +cust.getAddress()+"\t |\n ----------------------------------------");
        System.out.println("\n Product     Qty    Price");
        for(Product i:product){
            System.out.println("\n"+no+" "+i.getName()+"\n             "+i.getQuantity()+"      "+i.getRate());
            no++;
            total=total+i.getRate();
        }
        System.out.println("--------------------------------");
        System.out.println("\nTotal:              "+total);
    }
}
