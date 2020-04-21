package com.company.patterns.flyweight;

public class Rectangle extends Shape {
    private String label;

    public Rectangle() {
        label = "Rectangle";
    }

    @Override
    public void draw(int length, int breadth, String fillStyle) {
        System.out.println("Drawing a " + label + " with length " + length + " and breadth " + breadth + " Fill Style " + fillStyle);
    }
}
