package ArrayIndexOutOfBoundsException;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public int[] createRandom(){
        Random rd = new Random();
        int[] arr =  new int[100];
        System.out.println("Danh sach phan tu cua mang: ");
        for(int i = 0; i < 100; i++){
            arr[i] = rd.nextInt(100);
            System.out.println(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        int[] arr = arrayExample.createRandom();

        Scanner sc = new Scanner(System.in);
        System.out.println("\nVui long nhap chi so cua mot phan tu bat ky: ");
        int x = sc.nextInt();
        try{
            System.out.println("Giá trị của phần tử có chỉ số " + x + " là " + arr[x]);
        } catch (IndexOutOfBoundsException e){
            System.err.println("Chi so vuot qua gioi han cua mang");
        }
    }
}
