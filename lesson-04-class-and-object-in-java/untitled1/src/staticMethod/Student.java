package staticMethod;

public class Student {
    private int rollno;
    private String name;
    static String college = "BBDIT";

    public Student(int r, String n){
        this.rollno = r;
        this.name = n;
    }

    static void change(){
        college = "CODEGYM";
    }

    void display(){
        System.out.println(rollno + " " + " " + college);
    }
}
