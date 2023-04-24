package readFile;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class readFile {
    public static void main(String[] args) {
        BufferedReader br = null;
        String line;
        try {
            br = new BufferedReader(new FileReader("C:\\Users\\ADMIN\\Desktop\\text\\abc.txt"));
            while ((line = br.readLine()) != null){
                printCountry((List<String>) parseCsvLine(line));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static Object parseCsvLine(String csvLine) {
        List<String> result = new ArrayList<>();
        if(csvLine != null){
            String[] splitData = csvLine.split(",");
            for(int i = 0; i < splitData.length; i++){
                result.add(splitData[i]);
            }
        }
        return result;
    }

    public static void printCountry(List<String> country){
        System.out.println(
                "Country [id = "
                + country.get(0)
                + ", code = " + country.get(1)
                + ", name = " + country.get(2)
                + "]");
    }
}
