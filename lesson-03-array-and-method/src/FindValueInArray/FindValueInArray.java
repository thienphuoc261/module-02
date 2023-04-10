package FindValueInArray;
import java.util.Scanner;

public class FindValueInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] students = {"Bành", "Huy", "Thành", "Chung", "Trung", "Phát", "Phước"};
        boolean isExist = false;
            System.out.println("Nhập tên học viên: ");
            String inputName = sc.next();

            for (int i = 0; i < students.length; i++) {
                if (students[i].equals(inputName)) {
                    System.out.println("Học viên " + inputName + " ở vị trí:" + i);
                    isExist = true;
                    break;
                }
            }
            if (!isExist) {
                System.out.println("Tên học viên không có trong danh sách");
            }
    }
}
