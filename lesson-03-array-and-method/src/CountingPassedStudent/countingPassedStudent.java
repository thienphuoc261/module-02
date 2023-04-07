package CountingPassedStudent;
import java.util.Scanner;

public class countingPassedStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] score = new double[10];

        for(int index = 0; index < 10; index++){
            System.out.println("Nhập điểm của sinh viên thứ " + (index + 1) + " : ");
            score[index] = sc.nextDouble();
        }

        int count = 0;
        for(int index = 0; index < 10; index++){
            if(score[index] >= 5){
                count++;
            }
        }
        System.out.println("Số lượng sinh viên đã thi đạt là: " + count);
    }
}
