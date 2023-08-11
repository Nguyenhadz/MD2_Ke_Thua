package point2dAnd3d;

public class TestMain {
    public static void main(String[] args) {
        Point2d point2d = new Point2d();
        System.out.println(point2d);
        Point2d point2d1 = new Point2d(5, 10);
        System.out.println(point2d1);
        System.out.println();
        Point3d point3d = new Point3d();
        System.out.println(point3d);
        point3d = new Point3d(3,4,5);
        System.out.println(point3d);
    }
}
