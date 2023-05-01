package Shape;

import java.util.Scanner;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập loại hình: ");
        String shapeType = sc.next();

        Shape shape = ShapeFactory.getShape(shapeType);
        shape.draw();
    }
}
