package OutputShape;
import java.util.Scanner;

public class OutputShape {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Draw triangle");
        System.out.println("Enter a side of triangle:");
        int sideOfTriangle = input.nextInt();
        String triangle = "";
        for (int i = 1; i <= sideOfTriangle; i++){
            triangle += "*";
            System.out.println(triangle);
        }
        System.out.println("Draw square");
        System.out.println("Enter a side of square");
        int side = input.nextInt();
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Draw rectengle");

        System.out.println("Enter width of rectengle");
        int width = input.nextInt();
        System.out.println("Enter height of rentengle");
        int height = input.nextInt();

        for (int i = 0; i < width; i++){
            System.out.println();
            for (int j = 0; j < height; j++){
                System.out.print("*");
            }
        }
    }
}
