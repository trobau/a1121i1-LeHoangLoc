package b5_accessmodifier_staticmethod_staticproperty.practive.staticmethod;

public class Student {
    private int rollno;
    private String name;
    private static String college = "FKSHGFD";
    Student(int r,String n){
        rollno = r;
        name = n;
    }
    static void change(){
        college = "CODEGYM";
    }
    void display(){
        System.out.println(rollno+" "+name+" "+college);
    }
}
