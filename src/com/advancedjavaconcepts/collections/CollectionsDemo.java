package com.advancedjavaconcepts.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {

   public static void show(){
       Collection<String> collection = new ArrayList<>();
       Collections.addAll(collection, "java", "python","javascript");
       collection.remove("java");
       System.out.println(collection.contains("python"));
       System.out.println(collection);
       System.out.println(collection.size());
       System.out.println(collection.isEmpty());

       for (String item : collection) {
           System.out.println(item);
       }
       Object[] objectArray = collection.toArray();
       String[] stringArray = collection.toArray(new String[0]);

       Collection<String> other = new ArrayList<>();
       other.addAll(collection);

       System.out.println(collection == other);
       System.out.println(collection.equals(other));

   }
}
