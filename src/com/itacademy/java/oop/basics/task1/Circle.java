package com.itacademy.java.oop.basics.task1;

import java.text.DecimalFormat;

public class Circle extends Shape{

    private double radius;
    DecimalFormat df = new DecimalFormat("###.##");

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{ " +
                "radius = " + radius +
                " area = " + df.format(calculateArea()) +
                " perimeter = " + df.format(calculatePerimeter()) +
                " }";
    }
}
