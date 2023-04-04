package ChiSoCanNang;
import java.util.Scanner;
public class ChiSoCanNang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight = sc.nextDouble();
        double height = sc.nextDouble();
        double bmi = weight / (height*height);
        if (bmi < 18.5){
            System.out.println("You are underweight");
        } else if (bmi >= 18.5 && bmi < 25){
            System.out.println("You are normal");
        } else if (bmi >= 25 && bmi < 30){
            System.out.println("You are overweight");
        } else if (bmi >= 30){
            System.out.println("You are obese");
        }
    }
}
