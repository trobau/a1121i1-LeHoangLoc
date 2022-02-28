package b5_accessmodifier_staticmethod_staticproperty.practive.staticproperty;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Supercup", "unknow");
        System.out.println(car1.numberOfCars+" "+car1.getName()+" "+car1.getEngine());
        Car car2 = new Car("Sirious", "uoooo");
        System.out.println(car2.numberOfCars+" "+car2.getName()+" "+car2.getEngine());
    }
}
