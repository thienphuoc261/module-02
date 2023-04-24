package copyFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class ViDuFile {

    public static void copyAll(File f1, File f2){
        try {
            Files.copy(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(f1.isDirectory()){
            File[] mangCon = f1.listFiles();
            for (File file: mangCon) {
                File newFile = new File(f2.getAbsoluteFile()+ "/" + file.getName());
                copyAll(file, newFile);
            }
        }
    }
    public static void main(String[] args) {
        File f0 = new File("C:\\Users\\ADMIN\\Desktop\\Codegym\\module-02-java\\lesson-16-IO-text-file\\untitled\\src\\Directory_1\\Directory_2\\Directory_3\\Directory_4\\123.txt");
        File f0_copy = new File("C:\\Users\\ADMIN\\Desktop\\New folder\\123.txt");

        try {
            Files.copy(f0.toPath(), f0_copy.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        ViDuFile.copyAll(f0,f0_copy);
    }
}
