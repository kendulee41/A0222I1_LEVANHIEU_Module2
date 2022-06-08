package _6_inheritance.excercise.e3;

public class TestMovablePoint {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
        movablePoint.setXY(4,7);
        movablePoint.setSpeed(5,2);
        System.out.println(movablePoint.toString());
        System.out.println(movablePoint.move().toString());
    }
}
