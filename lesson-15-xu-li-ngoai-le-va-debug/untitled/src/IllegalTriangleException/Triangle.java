package IllegalTriangleException;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap canh a: ");
        int a = sc.nextInt();
        System.out.println("Nhap canh b: ");
        int b = sc.nextInt();
        System.out.println("Nhap canh c: ");
        int c = sc.nextInt();

        try {
            if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a){
                throw new RuntimeException("Tam giac la tac giam");
            }
            System.out.println("Do la tam giac");
        } catch (RuntimeException e){
            System.err.println(e.getMessage());
        }
    }
}
