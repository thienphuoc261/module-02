package interfaceComparatorWithShape;

public class Circle extends Shape implements Resizable {
    private double radius;
    public Circle(){}

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        setRadius(getRadius() + percent * getRadius() / 100);
    }

    public Circle(String color, boolean filled) {
        super(color, filled);
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }
}
