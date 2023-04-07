package MergeArray;
import java.util.Scanner;
import java.util.Arrays;

public class mergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử mảng 1: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Nhập các phần tử mảng 1:");
        for(int i = 0; i < n1; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr1));

        System.out.println("Nhập số phần tử mảng 2: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Nhập các phần tử mảng 2:");
        for(int i = 0; i < n2; i++){
            arr2[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr2));

        int[] arr = new int[n1 + n2];
        int index = 0;
        for(int i = 0; i < arr1.length; i++){
            arr[index] = arr1[i];
            index++;
        }
        for(int i = 0; i < arr2.length; i++){
            arr[index] = arr2[i];
            index++;
        }
        System.out.println("Mảng mới sau khi gộp: ");
        System.out.println(Arrays.toString(arr));
    }
}
