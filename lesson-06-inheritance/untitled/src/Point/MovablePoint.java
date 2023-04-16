package Point;

public class MovablePoint extends Point2D{
    private float xSpeed;
    private float ySpeed;

    public MovablePoint(){}

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        setySpeed(xSpeed);
        setySpeed(ySpeed);
    }

    public float[] getSpeed(){
        float [] arr = {getxSpeed(), getySpeed()};
        return arr;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", speed = (" + xSpeed +
                ", " + ySpeed + ")";
    }

    public MovablePoint move(){
        setXY(super.getX()+ xSpeed, super.getY() + ySpeed);
        return this;
    }
}
