import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;

public class ReadFileExample {


    public void readFileText(String filePath) throws IOException {

            try {
                File file = new File(filePath);
                if(!file.exists()) {
                    throw new FileNotFoundException();
                }
                BufferedReader br = new BufferedReader(new FileReader(file));
                String line = "";
                int sum = 0;
                while ((line = br.readLine()) != null){
                    System.out.println(line);
                    sum += Integer.parseInt(line);
                }
                br.close();
                System.out.println("Tổng: " + sum);

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
    }

    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn: ");
        Scanner sc = new Scanner(System.in);
        String path = sc.next();

        ReadFileExample readFileExample = new ReadFileExample();
        try {
            readFileExample.readFileText(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        File f = new File("C:\\Users\\ADMIN\\Desktop\\test\\untitled\\src\\f0\\f1\\f2\\f3\\test1.txt");
//        try {
//            List<String> allText = Files.readAllLines(f.toPath(), StandardCharsets.UTF_8);
//            for(String readText: allText){
//                System.out.println(readText);
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }
}
