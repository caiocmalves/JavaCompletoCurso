package entities;

import entities.enums.Color;

public class circle extends Shape{

    private double radius;

    public circle() {
        super();
    }

    public circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    
}
