package circleAndCylinder;

public class Cylinder extends Circle{
    private double height = 20.0;
    public Cylinder(){}
    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return getArea()*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "Height= " + height +
                "Radius= " + getRadius() +
                "Color= " + getColor() +
                '}';
    }
}
