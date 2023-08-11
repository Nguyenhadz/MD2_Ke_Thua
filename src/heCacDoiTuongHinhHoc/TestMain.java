package heCacDoiTuongHinhHoc;

public class TestMain {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        Circle circle1 = new Circle(3.0);
        System.out.println(circle1);
        Circle circle2 = new Circle(3.0, "red", true);
        System.out.println(circle2);
        System.out.println();
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        Rectangle rectangle1 = new Rectangle(10.0,5.0);
        System.out.println(rectangle1);
        Rectangle rectangle2 = new Rectangle(10.0, 5.0, "blue", false);
        System.out.println(rectangle2);
        System.out.println();
        Square square = new Square();
        System.out.println(square);
        Square square1 = new Square(5.0);
        System.out.println(square1);
        Square square2 = new Square(5.0, "while", false);
        System.out.println(square2);
    }
}
