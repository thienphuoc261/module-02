package CheckPrimeNumber;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean check = true;
        if (num < 2) {
            System.out.println(num + " không phải là số nguyên tố");
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(num + " là số nguyên tố");
            } else {
                System.out.println(num + " không phải là số nguyên tố");
            }
        }
    }
}
