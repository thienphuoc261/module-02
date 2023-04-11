package accessModifier;

public class Circle {
    private double radius;
    private String color;

    public Circle(){
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    public static class TestCircle {
        public static void main(String[] args) {
            Circle c = new Circle(5.8);
            System.out.println(c.getRadius());
            System.out.println(c.getArea());
        }
    }
}
