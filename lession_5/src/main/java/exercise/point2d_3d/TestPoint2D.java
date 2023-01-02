package exercise.point2d_3d;

public class TestPoint2D {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);
        point2D = new Point2D(3.4f,3.2f);
        System.out.println(point2D);
        point2D.setXY(1.2f,1.4f);
        System.out.println(point2D);
    }


}
