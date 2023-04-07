package FindMaxInArray2Side;
import java.util.Scanner;

public class findMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số hàng của mảng: ");
        int n = sc.nextInt();
        System.out.println("Nhập số cột của mảng: ");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        System.out.println("Nhập phần tử vào mảng: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int max = arr[0][0];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];

                }
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng là: ");
        System.out.println(max);
    }
}
