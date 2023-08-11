package pointAndMoveablePoint;

public class Main {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);
        point = new Point(5,5);
        System.out.println(point);
        System.out.println();
        MoveAblePoint moveAblePoint = new MoveAblePoint();
        System.out.println(moveAblePoint);
        moveAblePoint = new MoveAblePoint(2,3,5,5);
        System.out.println(moveAblePoint);
    }
}
