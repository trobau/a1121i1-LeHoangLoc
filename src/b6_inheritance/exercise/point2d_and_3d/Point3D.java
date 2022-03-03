package b6_inheritance.exercise.point2d_and_3d;

public class Point3D extends Point2D{
    private float z;
    public Point3D(){super();this.z = 0.0f;}
    public Point3D(float x, float y, float z){
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z) {
        super.setXY(x,y);
        this.z = z;
    }
    public float[] getXYZ() {
        float[] array = {this.getX(),this.getY(),this.getZ()};
        return array;
    }
    @Override
    public String toString() {
        float[] arr = this.getXYZ();
        return "("+arr[0]+","+arr[1]+","+arr[2]+")";
    }
}
