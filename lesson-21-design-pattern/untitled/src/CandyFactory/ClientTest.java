package CandyFactory;

import java.util.Scanner;

public class ClientTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập loại kẹo: ");
        String typeCandy = sc.next();

        Candy candy = CandyFactory.getCandy(typeCandy);
        System.out.println("Kẹo: " + candy.getCandyName());
    }
}
