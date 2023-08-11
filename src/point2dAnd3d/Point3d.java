package point2dAnd3d;

public class Point3d extends Point2d{
    private float z = 0.0f;
    public Point3d(){}
    public Point3d(float x, float y, float z) {
        super(x,y);
        this.z = z;
    }
    public float getZ() {
        return z;
    }
    public void setZ(float z) {
        this.z = z;
    }
    public float[] getXYZ() {
        return new float[] {getX(),getY(), this.z};
    }
    public void setXYZ(float x, float y, float z) {
        super.setX(x);
        super.setY(y);
        this.z = z;
    }
    public String toString() {
        return "Point3d= (" + getX() + ", "+getY()+ ", "+this.z+");" ;
    }

}
