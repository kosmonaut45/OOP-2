package com.itacademy.java.oop.basics.task1;

public class ShapeApplication {

    public static void main(String[] args) {

        Square square = new Square(5);
        Circle circle = new Circle(1);

        System.out.println(square.toString());
        System.out.println(circle.toString());
    }
}
