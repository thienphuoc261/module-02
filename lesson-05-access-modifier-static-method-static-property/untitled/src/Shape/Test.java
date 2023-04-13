package Shape;

public class Test {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("Nâu" , true);
        System.out.println(shape);

        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle("Pink" , true, 261);
        System.out.println(circle);

        Rectengle rectangle = new Rectengle();
        System.out.println(rectangle);
        rectangle = new Rectengle(2.3, 5.8);
        System.out.println(rectangle);
        rectangle = new Rectengle("blue", false, 2.3, 5.8);
        System.out.println(rectangle);

        Square square = new Square();
        System.out.println(square);
        square = new Square(2.3);
        System.out.println(square);
        square = new Square("red", true, 58);
        System.out.println(square);
    }
}
