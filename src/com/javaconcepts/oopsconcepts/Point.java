package com.javaconcepts.oopsconcepts;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        // Downcasted to override equal functionality in point class
        if (this == obj)
            return true;

        if (!(obj instanceof Point))
            return false;

        Point other = (Point)obj;
        return other.x == x && other.y == y;
    }
}
