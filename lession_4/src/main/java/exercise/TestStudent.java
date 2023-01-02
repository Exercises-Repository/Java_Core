package exercise;

public class TestStudent {
    /*
    Test lớp Student
     */
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Phiên");
        student.setClasses("C08");
        System.out.println(student.toString());
    }
}
