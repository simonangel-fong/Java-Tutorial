package javatutorial.summary.Sample_Class.Inheritance.ConcreteClass;

public class XampleConcreteClass {

    public static void main(String[] args) {
        Car car = new Car();
        car.honk();     //A car honks...
        car.setBrand("BMW");
        System.out.println("Car's brand: " + car.brand);    //Car's brand: BMW
    }
}
