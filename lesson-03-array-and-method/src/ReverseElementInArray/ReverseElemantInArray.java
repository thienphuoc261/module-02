package ReverseElementInArray;
import java.util.Scanner;
import java.util.Arrays;

public class ReverseElemantInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử của mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhập phần tử của mảng");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        for(int i = 0; i < arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
        System.out.println("Đảo ngược các phần tử của mảng: ");
        System.out.println(Arrays.toString(arr));
    }
}