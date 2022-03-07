package b6_inheritance.exercise.point_and_moveablepoint;

public class TestMoveablePoint {
    public static void main(String[] args) {
        MoveablePoint a = new MoveablePoint(2,3,1,1);
        System.out.println(a.toString());

        System.out.println(a.move().toString());
    }
}
