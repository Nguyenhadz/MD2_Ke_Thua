package classTriangle;

public class Triangle extends Shape{
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;
    public Triangle() {}
    public Triangle(double side1, double side2, double side3, String color, boolean filled) {
        super(color,filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getSide1() {
        return side1;
    }
    public void setSide1(double side1) {
        this.side1 = side1;
    }
    public double getSide2() {
        return side2;
    }
    public void setSide2(double side2) {
        this.side2 = side2;
    }
    public double getSide3() {
        return side3;
    }
    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getPerimeter() {
        return side1+side2+side3;
    }
    public double getArea() {
        double abc = (side1+side2+side3)/2;
        return Math.sqrt(abc*(abc-side1)*(abc-side2)*(abc-side3));
    }
    public String toString() {
        return "Triangle: Side01: " +side1
                +", Side02: "+side2
                +", Side03: "+side3
                +", Perimeter: "+getPerimeter()
                +", Area: "+getArea()
                +", Color: "+getColor()
                +", "+ (isFilled() ? "Filled" : "Not Filled");
    }

}
