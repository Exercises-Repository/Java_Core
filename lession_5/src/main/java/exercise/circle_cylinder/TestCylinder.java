package exercise.circle_cylinder;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(12.3);
        System.out.println(cylinder);
        cylinder = new Cylinder(2.1, 2.2);
        System.out.println(cylinder);
    }
}
