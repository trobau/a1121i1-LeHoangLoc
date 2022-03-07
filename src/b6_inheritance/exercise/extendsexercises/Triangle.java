package b6_inheritance.exercise.extendsexercises;

import b6_inheritance.practive.geometryobjectsystem.Shape;

public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;
    public Triangle(){super();}
    public Triangle(double side1, double side2, double side3,String color,boolean filled){
        super(color,filled);
        if (side1+side2>side3&&side1+side3>side2&&side2+side3>side1&&side1>0&&side2>0&&side3>0){
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
            }else{
            System.out.println("illegal");
            System.exit(0);
            }

        }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getArea() {
        double p = getPerimeter()/2;
        return Math.pow(p*(p-side1)*(p-side2)*(p-side3),0.5);
    }
    public double getPerimeter() {
        return side1+side2+side3;
    }
    @Override
    public String toString() {
        return "Triangle with side 1 : "+side1
                +", side 2 : "+side2
                +", side 3 : "+side3
                +" with area = "+getArea()
                +", perimeter = "+getPerimeter()
                +" and color : "+getColor();
    }
}


