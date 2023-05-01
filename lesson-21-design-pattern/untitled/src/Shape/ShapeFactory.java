package Shape;

public class ShapeFactory {
    public static Shape getShape(String shapeType){
        switch (shapeType){
            case "Circle":
                return new Circle();
            case "Square":
                return new Square();
            case "Rectangle":
                return new Rectengle();
            default:
                System.out.println("Cút!!!");
        }
        return null;
    }
}
