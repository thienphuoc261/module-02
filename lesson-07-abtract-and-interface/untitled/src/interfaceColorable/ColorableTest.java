package interfaceColorable;

import interfaceComparatorWithShape.Circle;
import interfaceComparatorWithShape.Rectangle;
import interfaceComparatorWithShape.Shape;
import interfaceComparatorWithShape.Square;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle(26, 58);
        shapes[2] = new Square(2000);
        shapes[3] = new Rectangle(1,8);
        for(Shape shapes1: shapes){
            System.out.println(shapes1.getArea());
            if(shapes1 instanceof Colorable){
                ((Colorable) shapes1).howTocolor();
            }
        }
    }
}
