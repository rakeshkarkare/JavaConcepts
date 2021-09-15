package com.advancedjavaconcepts.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerMain {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("java", "e3"));
        customers.add(new Customer("python", "e2"));
        customers.add(new Customer("javascript", "e1"));
        Collections.sort(customers, new EmailComparator());
        System.out.println(customers.toString());
    }
}
