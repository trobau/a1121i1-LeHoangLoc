package b5_accessmodifier_staticmethod_staticproperty.exercises.accessmodifier;
public class Circle {
    final static Double PI = 3.14;
    private String color = "RED";
    private double radius = 1.0;
    Circle(){}
    Circle(Double r){
        radius = r;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return 2*PI*radius;
    }
}
