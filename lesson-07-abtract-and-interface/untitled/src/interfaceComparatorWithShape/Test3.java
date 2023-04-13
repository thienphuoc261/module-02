package interfaceComparatorWithShape;

import java.util.Arrays;
import java.util.Comparator;

public class Test3 {
    public static void main(String[] args) {
        Circle[] circle = new Circle[3];
        circle[0] = new Circle(26.1);
        circle[1] = new Circle();
        circle[2] = new Circle("Nâu", true, 5.8);
        System.out.println("Pre-sort: ");
        for(Circle circle1 : circle){
            System.out.println(circle1);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circle, circleComparator);
        System.out.println("After-sort");
        for(Circle circle1 : circle){
            System.out.println(circle1);
        }

        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0] = new Rectangle(2, 5);
        rectangles[1] = new Rectangle();
        rectangles[2] = new Rectangle("Nâu", true, 26, 58);
        System.out.println("Pre-sort");
        for(Rectangle rectangle1: rectangles){
            System.out.println(rectangle1);
        }

        Comparator rectangleComparator = new RectangleComparator();
        Arrays.sort(rectangles, rectangleComparator);
        System.out.println("After-sort");
        for(Rectangle rectangle1: rectangles){
            System.out.println(rectangle1);
        }

        Square[] squares = new Square[3];
        squares[0] = new Square(4);
        squares[1] = new Square();
        squares[2] = new Square("Nâu", true, 58);
        System.out.println("Pre-sorted:");
        for (Square square1 : squares) {
            System.out.println(square1);
        }
        Comparator squareComparator = new SquareComparator();
        Arrays.sort(squares, squareComparator);
        System.out.println("After-sorted:");
        for (Square square1 : squares) {
            System.out.println(square1);
        }
    }
}
