package b5_accessmodifier_staticmethod_staticproperty.exercises.xaydunglopchighitrongJava;

public class TestStudent {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Hoa");
        s.setClasses("A12");
        System.out.println("Name: "+s.getName()+" classes : "+s.getClasses());
    }
}
