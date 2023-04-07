package DeleteElementFromArray;
import java.util.Arrays;
import java.util.Scanner;


public class DeleteElementFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(arr));
        System.out.println("Nhập phần tử muốn xóa: ");
        int delete = sc.nextInt();
        Boolean check = false;

        for (int i = 0; i < arr.length; i++){
            if(arr[i] == delete){
                check = true;
                for(; i < arr.length - 1; i++){
                    arr[i] = arr[i + 1];
                }
                arr[arr.length - 1] = 0;
            }
        }

        if (check){
            System.out.println(Arrays.toString(arr));
        } else {
            System.out.println("Không có phần tử đó trong mảng");
        }
    }
}
