package InterestRate;
import java.util.Scanner;

public class CountingRate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền muốn gửi: ");
        double money = sc.nextDouble();
        double rate = 8;
        System.out.println("Nhập số tháng muốn gửi: ");
        double month = sc.nextDouble();
        double interestRate = money * ((rate/100)/12) * month;
        System.out.println("Số tiền lãi là: " + interestRate);

    }
}
