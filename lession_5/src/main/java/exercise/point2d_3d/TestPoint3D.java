package exercise.point2d_3d;

public class TestPoint3D {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);
        point3D = new Point3D(3.4f);
        System.out.println(point3D);
        point3D = new Point3D(1.2f, 1.3f, 1.4f);
        System.out.println(point3D);
        point3D.setXYZ(5.2f, 3.3f, 4.1f);
        System.out.println(point3D);
    }

}
