package quadraticEquation;
import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant(){
        return Math.pow(b, 2) - 4*a*c;
    }

    public double getRoot1 (){
        double delta = getDiscriminant();
        if(delta < 0){
            return 0;
        }
        return (-b + Math.pow(delta, 0.5)) / (2 * a);
    }

    public double getRoot2 (){
        double delta = getDiscriminant();
        if(delta < 0){
            return 0;
        }
        return (-b - Math.pow(delta, 0.5)) / (2 * a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a,b,c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();

        if(delta >= 0) {
            double root1 = quadraticEquation.getRoot1();
            double root2 = quadraticEquation.getRoot2();
            if (delta == 0) {
                System.out.println("Phương trình có nghiệm kép: " + root1);
            } else {
                System.out.println("Phương trình có 2 nghiệm phân biệt: " + root1 + " và " + root2);
            }
        } else{
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
