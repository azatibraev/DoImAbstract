package com.company.shape;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle (double width, double height) {
        super(4);
        this.width = width;
        this.height = height;
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

    @Override
    void getArea() {
        double areaofRectangle = (width * height);
        System.out.println("Area of Rectangle: " + areaofRectangle);
    }

    @Override
    void getPerimeter() {
        double areaofPerimeter = 2 * (width * height);
        System.out.println("Perimeter of Rectangle: " + areaofPerimeter);
    }


    @Override
        public String toString() {
            return "Rectangle:" + '\n' +
                    "width: " + width + '\n' +
                    "height: " + height +'\n' + super.toString();
        }
    }