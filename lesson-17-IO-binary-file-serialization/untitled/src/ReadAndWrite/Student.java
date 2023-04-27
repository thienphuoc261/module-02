package ReadAndWrite;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Student implements Serializable {
    private int id;
    private String name;
    private String address;

    public Student(){
    }

    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddres() {
        return address;
    }

    public void setAddres(String addres) {
        this.address = addres;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id =" + id +
                ", name ='" + name + '\'' +
                ", address ='" + address + '\'' +
                '}';
    }

    public static void writeDataToFile(String file, List<Student> students){
        try{
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static List<Student> readDataFromFile(String path){
        List<Student> students = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        } catch(Exception e){
            e.printStackTrace();
        }
        return students;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Au Thien Phuoc","Nha Trang"));
        students.add(new Student(2, "Le Nhat Hoang","Nha Trang"));
        students.add(new Student(3, "Lionel Messi","Argentina"));
        students.add(new Student(4, "N'golo Kante","France"));
        students.add(new Student(5, "Didier Drogba","Côte d'Ivoire"));
        writeDataToFile("src/ReadAndWrite/text.txt",students);

        List<Student> studentList = new ArrayList<>();
        studentList = (List<Student>) readDataFromFile("src/ReadAndWrite/text.txt");
        for (Student student: studentList) {
            System.out.println(student);
        }
    }
}
