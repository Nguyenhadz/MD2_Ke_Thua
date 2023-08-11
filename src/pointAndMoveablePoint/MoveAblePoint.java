package pointAndMoveablePoint;

public class MoveAblePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
    public MoveAblePoint() {}
    public MoveAblePoint(float xSpeed, float ySpeed, float x, float y) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed() {
        return new float[] {this.xSpeed, this.ySpeed};
    }
    public void setSpeed(float x, float y, float xSpeed, float ySpeed) {
        super.setX(x);
        super.setY(y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public void move() {
        setX(getX()+xSpeed);
        setY(getY()+ySpeed);
    }
    public String toString() {
        return "Move: ( "+ getX()+ ", "+getY()+"); Speed= ( "+xSpeed+", "+ySpeed+")";
    }
}
