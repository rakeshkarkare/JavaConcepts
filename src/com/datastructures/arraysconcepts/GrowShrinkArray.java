package com.datastructures.arraysconcepts;


public class GrowShrinkArray {

    public static void main(String[] args) {
        Array arr = new Array(3);

        arr.insert(10);
        arr.insert(20);
        arr.insert(30);
        arr.insert(40);

        System.out.println(arr.indexOf(10));
        arr.removeAt(3);

        arr.print();

    }
}
