package Point;

public class TestPoint {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(2,6);
        System.out.println(point2D);

        MovablePoint movablePoint = new MovablePoint();
        movablePoint.setxSpeed(26);
        movablePoint.setySpeed(58);
        movablePoint.move();
        System.out.println(movablePoint);
    }
}
