package com.advancedjavaconcepts.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerMain {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("java"));
        customers.add(new Customer("python"));
        customers.add(new Customer("javascript"));
        Collections.sort(customers);
        System.out.println(customers.toString());
    }
}
