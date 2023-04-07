package FindMinInArrayUsingMethod;
import java.util.Scanner;
import java.util.Arrays;

public class FindMinInArrayUsingMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử của mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhập phần tử của mảng: ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        int index = FindMinInArray(arr);
        System.out.println("Phẩn tử nhỏ nhất của mảng là: " + arr[index]);
    }

    public static int FindMinInArray(int[]arr){
        int index = 0;
        for(int i = 0; i < arr.length;i ++){
            if(arr[i] < arr[index]){
                index = i;
            }
        }
        return index;
    }
}
