package com.Product.yash;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class ProductRepository {
    private HashMap<Integer,Product> map = new HashMap<>();
    public HashMap<Integer, Product> getMap() {
        return map;
    }

    public void setMap(HashMap<Integer, Product> map) {
        this.map = map;
    }

    public boolean add(Product prd) {
        if(!map.containsKey(prd.getId())) {
            map.put(prd.getId(),prd);
            return true;
        }
        return false;
    }

    /*public boolean remove(int id) {
        return map.remove(new Integer(id));
    }*/

    public Product get(int id) {
        return get(new Integer(id));
    }

    public Collection<Product> getProducts() {
        return map.values();
    }

    public Set<Integer> getIds() {
        return map.keySet();
    }
}
