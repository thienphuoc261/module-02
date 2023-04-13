package interfaceComparatorWithShape;

public class Square extends Shape implements Resizable{
    private double side;

    public Square (){}

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }


    public void setSize(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide();
    }

    @Override
    public void resize(double percent) {
        setSide(getSide() + percent * getSide() / 100);
    }
}
