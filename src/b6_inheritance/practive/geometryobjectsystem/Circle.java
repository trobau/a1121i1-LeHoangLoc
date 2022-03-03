package b6_inheritance.practive.geometryobjectsystem;

public class Circle extends Shape{
    private double radius;
    public Circle(){this.radius = 1.0;}
    public Circle(double radius){this.radius = radius;}
    public Circle(double radius,String color,boolean filled){
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {return PI*Math.pow(this.radius,2);}
    public double getPerimeter() {return PI*2*this.radius;}
    @Override
    public String toString() {
        return "A Circle with radius : " + this.getRadius()+
                ", which is a subclass of "+
                super.toString();
    }
}
