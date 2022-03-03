package b6_inheritance.exercise.point2d_and_3d;

public class Point2D {
    private float x;
    private float y;
    public Point2D(){
        this.x = 0.0f;
        this.y = 0.0f;
    }
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        float array[] = {this.getX(),this.getY()};
        return array;
    }
    @Override
    public String toString() {
        return "("+this.getX()+","+this.getY()+")";
    }
}
