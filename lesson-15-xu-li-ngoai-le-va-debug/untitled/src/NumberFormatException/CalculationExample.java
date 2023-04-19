package NumberFormatException;

import java.util.Scanner;

public class CalculationExample {
    public void calcutlate(int x, int y){
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("x + y = " + a);
            System.out.println("x - y = " + b);
            System.out.println("x * y = " + c);
            System.out.println("x / y = " + d);
        }catch(Exception e){
            System.err.println("Xảy ra ngoại lệ: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap x: ");
        int x = sc.nextInt();
        System.out.println("Nhap y: ");
        int y = sc.nextInt();
        CalculationExample calc = new CalculationExample();
        calc.calcutlate(x, y);
    }
}
