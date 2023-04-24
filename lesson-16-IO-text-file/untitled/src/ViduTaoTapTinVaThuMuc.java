import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class ViduTaoTapTinVaThuMuc {
    File file;

    public static void xoaFile(File fx){
        if(fx.isFile()){
            System.out.println("Da xoa: " + fx.getAbsolutePath());
            fx.delete();
        } else if(fx.isDirectory()){
            File[] mangCon = fx.listFiles();
            for(File f: mangCon){
                xoaFile(f);
            }
            fx.delete();
        }
    }
    public ViduTaoTapTinVaThuMuc(String tenFile) {
        this.file = new File(tenFile);
    }
    public boolean checkExecute(){
        return this.file.canExecute();
    }

    public boolean checkCanRead(){
        return this.file.canRead();
    }

    public boolean checkCanWrite(){
        return this.file.canWrite();
    }

    public void outputAbsolutePath(){
        System.out.println(this.file.getAbsolutePath());
    }

    public void outputNamePath(){
        System.out.println(this.file.getName());
    }

    public void checkDirectory(){
        if(this.file.isDirectory()){
            System.out.println("Đây là thư mục");
        } else if (this.file.isFile()) {
            System.out.println("Đây là tập tin");
        }
}
        public void outputSubFileList(){
            if(this.file.isDirectory()){
                System.out.println("Các tập tin con/ thư mục con là: ");
                File[] mangCon = this.file.listFiles();
                for(File file: mangCon){
                    System.out.println(file.getAbsolutePath());
                }
            } else if (this.file.isFile()) {
                System.out.println("Đây là tập tin không có dữ liệu con bên trong.");
            }
        }

        public void outputDirectoryTree(){
            this.outputDetailDirectoryTree(this.file, 1);
        }

        public void outputDetailDirectoryTree(File f, int bac) {
            for (int i = 0; i < bac; i++) {
                System.out.println("|");
            }
                System.out.println(f.getName());
                if (f.canRead() && f.isDirectory()) {
                    File[] mangCon = f.listFiles();
                    for (File fx : mangCon) {
                        outputDetailDirectoryTree(fx, bac + 1);
                    }
                }
            }

    public static void main(String[] args) {
//        File folder1 = new File("C:\\Users\\ADMIN\\Desktop\\Codegym\\module-02-java\\lesson-16-IO-text-file\\untitled");
//        System.out.println(folder1.exists());
//
//        File d1 = new File("C:\\Users\\ADMIN\\Desktop\\Codegym\\module-02-java\\lesson-16-IO-text-file\\untitled\\src\\Directory_1");
//        d1.mkdir();
//
//        File d2 = new File("C:\\Users\\ADMIN\\Desktop\\Codegym\\module-02-java\\lesson-16-IO-text-file\\untitled\\src\\Directory_1\\Directory_2\\Directory_3\\Directory_4");
//        d2.mkdirs();
//
//        File file1 = new File("C:\\Users\\ADMIN\\Desktop\\Codegym\\module-02-java\\lesson-16-IO-text-file\\untitled\\src\\Directory_1\\Directory_2\\Directory_3\\Directory_4\\Ex1.txt");
//        try {
//            file1.createNewFile();
//        } catch(Exception e){
//            e.printStackTrace();
//        }
//        Scanner sc = new Scanner(System.in);
//        int luaChon = 0;
//        System.out.println("Nhập tên file: ");
//        String tenFile = sc.next();
//        ViduTaoTapTinVaThuMuc vdf = new ViduTaoTapTinVaThuMuc(tenFile);
//        do{
//            System.out.println("Menu--------------");
//            System.out.println("1.Kiểm tra file có thể thực thi");
//            System.out.println("2.Kiểm tra file có thể đọc");
//            System.out.println("3.Kiểm tra file có thể ghi");
//            System.out.println("4.In đường dẫn: ");
//            System.out.println("5.In tên file: ");
//            System.out.println("6. Kiểm tra file là thư mục: ");
//            System.out.println("7. In ra danh sách các file con: ");
//            System.out.println("8. In ra cây thư mục: ");
//            System.out.println("0. Thoát ra khỏi chương trình.");
//            luaChon = sc.nextInt();
//            switch (luaChon){
//                case 1:
//                    System.out.println(vdf.checkExecute());
//                    break;
//                case 2:
//                    System.out.println(vdf.checkCanRead());
//                    break;
//                case 3:
//                    System.out.println(vdf.checkCanWrite());
//                    break;
//                case 4:
//                    vdf.outputAbsolutePath();
//                    break;
//                case 5:
//                    vdf.outputNamePath();
//                    break;
//                case 6:
//                    vdf.checkDirectory();
//                    break;
//                case 7:
//                    vdf.outputSubFileList();
//                    break;
//                case 8:
//                    vdf.outputDirectoryTree();
//            }
//        }while (luaChon != 0);
//        File f0 = new File("C:\\Users\\ADMIN\\Desktop\\Codegym\\module-02-java\\lesson-16-IO-text-file\\untitled\\src\\Directory_1\\Directory_2\\Directory_3\\Directory_4\\Ex1.txt");


//        f0.mkdir();
//        f0_1.mkdir();
//        try {
//            f.createNewFile();
//        } catch (Exception e){
//            e.printStackTrace();
//        }
//
//        f0_1.deleteOnExit();
//        f.deleteOnExit();
//        ViduTaoTapTinVaThuMuc.xoaFile(f0);

//        Path p0 = f0.toPath();
//        Path p0_1 = f0_1.toPath();
//        Path p_ex = f.toPath();
//        try {
//            Files.deleteIfExists(p0);
//            Files.deleteIfExists(p0_1);
//            Files.deleteIfExists(p_ex);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }
}
