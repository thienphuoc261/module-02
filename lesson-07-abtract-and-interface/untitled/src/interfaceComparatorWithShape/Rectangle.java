package interfaceComparatorWithShape;

public class Rectangle extends Shape implements Resizable{
    private double width;
    private double height;

    public Rectangle(){}

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
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
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getHeight()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void resize(double percent) {
        setWidth(getWidth() + percent * getWidth() / 100);
        setHeight(getHeight() + percent * getHeight() / 100);
    }
}
