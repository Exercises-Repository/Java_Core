package exercise.circle_cylinder;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(2.1);
        System.out.println(circle);
        circle = new Circle(2.1, "Yellow");
        System.out.println(circle);
    }
}
