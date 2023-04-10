package rectengle;
import java.util.Scanner;

public class Rectengle {
    private double width;
    private double height;

    public Rectengle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return width*height;
    }

    public double getPerimeter(){
        return (width + height)* 2;
    }

    public String display(){
        return "width: " + width + "; height: " + height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width: ");
        double width = sc.nextDouble();
        System.out.println("Enter the height: ");
        double height = sc.nextDouble();
        Rectengle rectengle = new Rectengle(width, height);
        System.out.println("Your rectengle: " + rectengle.display());
        System.out.println("Perimeter: " + rectengle.getPerimeter());
        System.out.println("Area: " + rectengle.getArea());
    }
}
