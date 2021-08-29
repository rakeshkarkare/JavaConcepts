package com.advancedjavaconcepts.generics;

public class User implements Comparable<User> {

    private int points;

    public User(int points) {
        this.points = points;
    }

    @Override
    public int compareTo(User object) {
        // this < o -> -1
        // this == o -> 0
        // this > o -> 1
        return points - object.points;
    }

    @Override
    public String toString() {
        return "Points=" + points;
    }
}
