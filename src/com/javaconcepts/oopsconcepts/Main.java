package com.javaconcepts.oopsconcepts;

public class Main {

    public static void main(String[] args) {

        Point point1 = new Point(1, 2);
        Point point2 = new Point(1, 2);
        System.out.println(point1.equals(new TextBox()));
        System.out.println(point1.equals(point2));
        System.out.println(point1.equals(point1));

    }
}
