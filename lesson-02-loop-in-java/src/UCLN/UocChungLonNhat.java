package UCLN;
import java.util.Scanner;
public class UocChungLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Math.abs(sc.nextInt());
        int b = Math.abs(sc.nextInt());
        if (a == 0 || b == 0){
            System.out.println("Không có ước chung lớn nhất");
        }
        while (a != b){
            if (a > b){
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println("Ước chung lớn nhất là " + b);
    }
}
