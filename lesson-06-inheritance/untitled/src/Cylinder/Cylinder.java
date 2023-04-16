package Cylinder;

import Shape.Circle;

public class Cylinder extends Circle {
    private double height = 1;

    public Cylinder(){}

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(String color, boolean filled, double radius, double height) {
        super(color, filled, radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return height * getArea();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height + "m" +
                " and " + super.toString() +
                "} has volume = " + String.format("%.2f", getVolume()) + "m3.";
    }
}
