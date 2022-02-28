package b5_accessmodifier_staticmethod_staticproperty.practive.staticmethod;


public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(111,"Hoa");
        Student s2 = new Student(222,"Hoang");
        Student s3 = new Student(333,"Hang");
        s1.display();
        s2.display();
        s3.display();
    }
}
