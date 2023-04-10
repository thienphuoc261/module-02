package AddElementToArray;
import java.util.Arrays;
import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 7};
        System.out.println(Arrays.toString(arr));
        System.out.println("Nhập phần tử muốn thêm vào mảng: ");
        int addElement = sc.nextInt();
        System.out.println("Nhập vị trí muốn thêm phần tử");
        int index = sc.nextInt();

        if(index >= 0 && index < arr.length) {
            for (int i = arr.length - 1; i >= index; i--) {
                arr[i] = arr[i - 1];
            }
        } else {
            System.out.println("Không có vị trí này trong mảng!");
        }

        arr[index] = addElement;
        System.out.println(Arrays.toString(arr));
    }
}
