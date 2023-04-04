package giaiphuongtrinhbacnhat;
import java.util.Scanner;

public class giaiphuongtrinhbacnhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        }    else if (a != 0) {
            double x = -b / a;
            System.out.println("x = " + x);
        }
    }
}
