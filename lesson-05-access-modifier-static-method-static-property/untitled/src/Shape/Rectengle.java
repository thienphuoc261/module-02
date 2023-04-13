package Shape;

public class Rectengle extends Shape{
    private double width;
    private double length;

    public Rectengle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectengle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Rectengle(){
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return width * length;
    }

    public double getPerimeter(){
        return (width + length) * 2;
    }

    @Override
    public String toString() {
        return "A Rectangle with width = " + getWidth() + " and length = " + getLength() + ", which is a subclass of " + super.toString();
    }
}
