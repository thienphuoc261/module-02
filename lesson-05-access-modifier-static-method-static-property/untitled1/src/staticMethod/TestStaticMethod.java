package staticMethod;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student s1 = new Student(111, "Khang");
        Student s2 = new Student(222, "Tứn");
        Student s3 = new Student(333, "Nam");

        Student.change();
        System.out.println(Student.college);
        s1.display();
        s2.display();
        s3.display();
    }
}
