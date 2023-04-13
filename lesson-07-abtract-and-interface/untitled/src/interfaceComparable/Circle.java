package interfaceComparable;

public class Circle {
    double radius;
    String color;
    boolean filled;

    public Circle(double radius){}

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
}
