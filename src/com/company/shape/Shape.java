package com.company.shape;

public abstract class Shape {

    private  double numSides;

    public Shape() {
    }

    public Shape(double numSides) {
        this.numSides = numSides;
    }

    public double getNumSides() {
        return numSides;
    }

    abstract void getArea();

    abstract void getPerimeter();

    @Override
    public String toString() {
        return "Shape:" + '\n'+
                "numSides: " + numSides + '\n';
    }
}