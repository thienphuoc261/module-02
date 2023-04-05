package Output20PrimeNumber;
import java.util.Scanner;


public class Display20PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố cần in ra: ");
        int num = sc.nextInt();
        int count = 0;

        for (int i = 2; i <= 100; i++){
            Boolean check = true;
            if (count < num){
                for (int j = 2; j <= Math.sqrt(i); j++){
                    if (i % j == 0){
                        check = false;
                    }
                    }if (check){
                    count++;
                    System.out.println(i);
                }
            }
        }

    }
}
