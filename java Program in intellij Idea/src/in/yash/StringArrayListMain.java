package in.yash;

import java.util.ArrayList;

public class StringArrayListMain {

    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();

        // Append an element
        cities.add("patan");
        cities.add("Rajkot");
        cities.add("Mahesana");

        // Get an element at index
        System.out.println(cities.get(0));
        System.out.println(cities.get(1));
        System.out.println(cities.get(2));

        // Length / Size of collection
        System.out.println(cities.size());

        // Add / insert at index
        cities.add(0,"Vijapur");

        // Traverse
        for (String city : cities) {
            System.out.println(city);
        }

        // Search an element - Contains() returns boolean
        String search = "Mahesana";
        if(cities.contains(search))
            System.out.println("Found");
        else
            System.out.println("Not Found");

        // Search an element - indexOf() returns index of Searched element, returns -1 otherwise
        int r = cities.indexOf(search);
        System.out.println(r);
        System.out.println(cities.indexOf("Surat"));

        // Set / Replace an element
        cities.set(1,"Ahemdabad");
        cities.set(2,"Surat");

        // Remove the element
        cities.remove("Ahemdabad");
        cities.remove(0);

        // Traverse
        for (String city : cities) {
            System.out.println(city);
        }

        // Searching Data in SearchingData class Operator in this code
        SearchingData obj = new SearchingData();

        //use the hashcodeSearchingData Method in SearchingData class
        System.out.print("Enter the City: ");
        if(obj.hashcodeSearchingData(cities, new java.util.Scanner(System.in).next() ))
            System.out.println("this city is found in hashcode method");
        else
            System.out.println("this city is not found in hashcode method");

        // Searching Data in equalsSearchingData method in SearchingData class
        System.out.print("Enter the city: ");
        if(obj.equalsSearchingData(cities,new java.util.Scanner(System.in).next()))
            System.out.println("this city is found in equals method");
        else
            System.out.println("this city is not found in equals method");
    }
}
