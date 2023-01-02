package practice;

public class TestStaticMethod {
    /*
    Test phương thức của lớp student
     */
    public static void main(String[] args) {
        Student.change();

        Student s1 = new Student(111, "Khang");
        Student s2 = new Student(222, "Khánh");
        Student s3 = new Student(333, "Phiên");

        s1.display();
        s2.display();
        s3.display();
    }
}
