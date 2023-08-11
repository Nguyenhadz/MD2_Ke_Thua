package circleAndCylinder;

public class testMain {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        Circle circle1 = new Circle(2.0, "while");
        System.out.println(circle1);
        System.out.println();
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        Cylinder cylinder1 = new Cylinder(15.0, 4.0, "blue");
        System.out.println(cylinder1);
    }
}
