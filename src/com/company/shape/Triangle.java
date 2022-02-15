package com.company.shape;

public class Triangle extends Shape{

    private double width;
    private double height;
    private double length;
    private double radius;

    public Triangle(){

    }

    public Triangle(double width, double height,double length, double radius) {
        super(3);
        this.width = width;
        this.height = height;
        this.radius = radius;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    void getArea() {
        double areaOfTriangle =  (2 * (radius * 2));
        System.out.println("Area of triangle: " + areaOfTriangle);
    }

    @Override
    void getPerimeter() {
        double perimeterOfTriangle = ( width + height + length);
        System.out.println("Perimeter of triangle: " + perimeterOfTriangle);
    }

    @Override
    public String toString() {
        return "Triangle: " + '\n' +
                "width: " + width + '\n' +
                "height: " + height + '\n' + super.toString();
    }
}
