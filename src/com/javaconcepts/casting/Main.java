package com.javaconcepts.casting;

public class Main {

    public static void main(String[] args) {
        // implicit casting
        // byte > short > int > long > float > double
        short x = 1;
        int y = x + 2;
        System.out.println(y);

        double z = 1.1;
        double m = z + 2;
        System.out.println(m);

        //explicit casting
        double z1 = 1.1;
        int m1 = (int)z + 2;
        System.out.println(m1);

        String str = "1";
        int o1 = Integer.parseInt(str) + 2;
        System.out.println(o1);
    }
}
