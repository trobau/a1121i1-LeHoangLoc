package b6_inheritance.exercise.circle_and_cylinder;

public class Cylinder extends Circle{
    private double height;
    public Cylinder(){super();this.height= 1.0;}
    public Cylinder(double height, double radius, String color){
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() { return height *super.getArea();}
    @Override
    public String toString() {
        return super.toString()+" A Cylinder of Circle with height :"+
                this.getHeight()+
                " and Volume : "+this.getVolume();
    }
}
