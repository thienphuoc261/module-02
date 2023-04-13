package point2DAnd3D;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Point2D point2d = new Point2D();
        System.out.println(point2d);
        point2d = new Point2D(26,58);
        System.out.println(point2d);
        point2d.setXY(261,58);
        System.out.println(Arrays.toString(point2d.getXY()));

        Point3D point3d = new Point3D();
        System.out.println(point3d);
        point3d.setXYZ(5,8,2000);
        System.out.println(Arrays.toString(point3d.getXYZ()));
    }
}
