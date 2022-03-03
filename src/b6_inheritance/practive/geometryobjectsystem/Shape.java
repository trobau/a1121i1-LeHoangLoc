package b6_inheritance.practive.geometryobjectsystem;

public class Shape {
    public final static double PI = 3.14;
    private String color = "green";
    private boolean filled = true;
    public Shape(){}
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }


    public String toString() {
        String result = "A Shape with color of "+this.color+" and "+(isFilled()? "filled":"not filled");
        return result;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}
