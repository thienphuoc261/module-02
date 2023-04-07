package TemparatureConverting;
import java.util.Scanner;

public class TemparatureConverting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c, f;
        int choice;

        do{
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Nhập độ F: ");
                    f = sc.nextDouble();
                    System.out.println("Độ C: " + FtoC(f));
                    break;
                case 2:
                    System.out.println("Độ C: ");
                    c = sc.nextDouble();
                    System.out.println("Độ F: " + CtoF(c));
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }
    public static double CtoF(double c) {
        double f = (9/5) * c + 32;
        return f;
    }

    public static double FtoC(double f) {
        double c = (5/9) * (f - 32);
        return c;
    }
}