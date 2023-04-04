package CurrencyConversion;
import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rate = 23500;
        System.out.println("Nhập số tiền: ");
        double usd = sc.nextDouble();
        double vnd = usd * rate;
        System.out.println("VNĐ: " + vnd);
    }
}
