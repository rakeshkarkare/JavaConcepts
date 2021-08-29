package com.advancedjavaconcepts.generics;

public class Main {
    public static void main(String[] args) {

//        GenericList<Integer> list = new GenericList<>();
//        list.add(1);
//        int number = list.get(0);
//        System.out.println(number);

        User user1 = new User(10);
        User user2 = new User(20);
        if (user1.compareTo(user2) < 0)
            System.out.println("User 1 <  User 2");
        else if (user1.compareTo(user2) == 0)
            System.out.println("User 1 == User 2");
        else
            System.out.println("User 1 > User 2");

        Object max = Utils.max(new User(10), new User(20));
        System.out.println(max);

        Utils.print(1, 10);

    }
}
