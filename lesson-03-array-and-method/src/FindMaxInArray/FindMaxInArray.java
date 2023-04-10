package FindMaxInArray;
import java.util.Scanner;
import java.util.Arrays;

public class FindMaxInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhập phần tử của mảng: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        int max = arr[0];
//        int index = 1;
        for(int i = 0; i < n; i++){
            if (arr[i] > max){
                max = arr[i];
//                index = i + 1;
            }
        }
        System.out.println("Phần tử lớn nhất của mảng là: " + max);
    }
}
