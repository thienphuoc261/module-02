package SumColumnArray;

import java.util.Scanner;

public class sumColumnArray {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        Scanner sc = new Scanner(System.in);

        for(int column = 0; column < matrix[0].length; column++){
            int sum = 0;
            for(int row = 0; row < matrix.length; row++){
                sum += matrix[row][column];
            }
            System.out.println("Sum of column " + column + " is " + sum);
        }
    }
}
