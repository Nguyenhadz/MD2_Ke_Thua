package classTriangle;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("red", true);
        System.out.println(shape);
        System.out.println();
        Triangle triangle = new Triangle();
        System.out.println(triangle);
        triangle = new Triangle(3,4,5,"while", false);
        System.out.println(triangle);
    }
}
