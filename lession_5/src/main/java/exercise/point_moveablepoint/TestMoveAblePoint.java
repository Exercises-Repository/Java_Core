package exercise.point_moveablepoint;

public class TestMoveAblePoint {
    public static void main(String[] args) {
        MoveAblePoint moveAblePoint = new MoveAblePoint();
        System.out.println(moveAblePoint);
        moveAblePoint = new MoveAblePoint(3.5f, 1.2f);
        System.out.println(moveAblePoint);
        moveAblePoint = new MoveAblePoint(3.1f, 3.2f, 3.6f, 5.6f);
        System.out.println(moveAblePoint);
    }
}
