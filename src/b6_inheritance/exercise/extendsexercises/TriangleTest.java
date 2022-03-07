package b6_inheritance.exercise.extendsexercises;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        System.out.println(t.toString());
        Triangle t2 = new Triangle(1,3,2.5,"blue",false);
        System.out.println(t2.toString());
        Triangle t3 = new Triangle(1,3,7,"blue",false);
        System.out.println(t3.toString());
    }
}
