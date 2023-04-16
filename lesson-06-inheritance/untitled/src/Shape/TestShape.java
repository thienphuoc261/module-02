package Shape;

public class TestShape {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        shape.setFilled(false);
        shape.setColor("brown");
        System.out.println(shape);

        Circle circle = new Circle(26);
        System.out.println(circle);
        System.out.println("Area:: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
        circle.setRadius(58);
        System.out.println("Area:: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle.setLength(5);
        rectangle.setWidth(8);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        Square square = new Square();
        System.out.println(square);

        Triangle triangle = new Triangle(26,58,20);
        System.out.println(triangle.getArea());

    }
}
