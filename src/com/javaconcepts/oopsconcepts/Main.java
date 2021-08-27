package com.javaconcepts.oopsconcepts;

import com.javaconcepts.oopsconcepts.inheritance.UIControl;

public class Main {

    public static void main(String[] args) {

        Point point1 = new Point(1, 2);
        Point point2 = new Point(1, 2);
        System.out.println(point1.equals(new TextBox()));
        System.out.println(point1.equals(point2));
        System.out.println(point1.equals(point1));
        System.out.println(point1.hashCode());
        System.out.println(point2.hashCode());

        UIControl[] controls = { new TextBox(), new CheckBox()};
        for (UIControl control : controls)
            control.render();

    }
}
