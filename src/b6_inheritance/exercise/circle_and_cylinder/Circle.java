package b6_inheritance.exercise.circle_and_cylinder;

public class Circle {
    public static final double PI = 3.14;
    private double radius;
    private String color;
    public Circle(){this.radius = 1.0;this.color = "red";}
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return Math.pow(this.radius,2)*PI;
    }
    @Override
    public String toString() {
        return "A Circle with darius : "+
                this.radius+
                " and area :"+
                this.getArea();
    }
}
