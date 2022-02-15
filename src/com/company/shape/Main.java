package com.company.shape;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5.5, 7.8);
        Shape triangle = new Triangle(6.8, 7.2, 5.6, 8.6);
        System.out.println(rectangle);
        rectangle.getArea();
        rectangle.getPerimeter();

        System.out.println(triangle);
        triangle.getArea();
        triangle.getPerimeter();

    }
}
