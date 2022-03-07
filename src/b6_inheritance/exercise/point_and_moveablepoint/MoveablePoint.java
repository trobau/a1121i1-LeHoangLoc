package b6_inheritance.exercise.point_and_moveablepoint;

public class MoveablePoint extends Point{
    private float xSpeed;
    private float ySpeed;
    public MoveablePoint(){
        super();
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }
    public MoveablePoint(float xSpeed, float ySpeed,float x,float y){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[] array = {this.getxSpeed(),this.getySpeed()};
        return array;
    }


    public MoveablePoint move(){
        this.setX(this.getX()+this.getxSpeed());
        this.setY(this.getY()+this.getySpeed());
        return this;
    }
    @Override
    public String toString() {
        return "("+this.getX()+","+this.getY()+")"+",Speed = ("+this.getxSpeed()+","+this.getySpeed()+")";
    }

}
