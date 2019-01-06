package com.contry_state_city.yash;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        HashMap<String,HashMap<String,HashMap<Integer,String>>> c = new HashMap<>();

        c.put("India",new HashMap<>());
        c.put("U.S",new HashMap<>());

        c.get("India").put("Gujarat",new HashMap<>());
        c.get("India").put("Maharashtra",new HashMap<>());
        c.get("U.S").put("California",new HashMap<>());
        c.get("U.S").put("New York",new HashMap<>());

        c.get("India").get("Gujarat").put(384265,"Patan");
        c.get("India").get("Gujarat").put(384315,"Mahesana");
        c.get("India").get("Maharashtra").put(400003,"Mumbai");
        c.get("India").get("Maharashtra").put(422003,"Nashik");
        c.get("U.S").get("California").put(92083,"Vista");
        c.get("U.S").get("California").put(90291,"Venice");
        c.get("U.S").get("New York").put(10504,"Armonk");
        c.get("U.S").get("New York").put(10467,"Bronx");

        for(String country : c.keySet()) {
            System.out.println(country);
            for (String state : c.get(country).keySet()) {
                System.out.println("\t\t"+state);
                for(Integer pincode : c.get(country).get(state).keySet()) {
                    System.out.print("\t\t\t\t"+pincode+"  "+c.get(country).get(state).get(pincode)+"\n");
                }
            }
        }
    }
}
