package b6_inheritance.practive.geometryobjectsystem;

public class Rectangle extends Shape{
    private double width;
    private double length;
    public Rectangle(){
        this.width = 1.0;
        this.length = 1.0;
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color,filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea() {
        return this.width*this.length;
    }
    public double getPerimeter() {
        return (this.length+this.width)*2;
    }

    public double getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "A Rectangle with width : "+
                this.getWidth()+
                " and Length : "+
                this.getLength()+
                ", which is a subclass of "+
                super.toString();
}
}