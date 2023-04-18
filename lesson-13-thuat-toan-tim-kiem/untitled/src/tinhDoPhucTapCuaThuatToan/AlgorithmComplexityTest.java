package tinhDoPhucTapCuaThuatToan;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = sc.next();

        int[] frequentChar = new int[255];
        for(int i = 0; i < inputString.length(); i++){
            int ascii = (int) inputString.charAt(i);
            frequentChar[ascii] += 1;
        }

        int max = 0;
        char charater = (char) 255;
        for(int j = 0; j < 255; j++){
            if(frequentChar[j] > max){
                max = frequentChar[j];
                charater = (char) j;
            }
        }
    }
}
