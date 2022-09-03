package javatutorial.summary.Sample_Class.Inheritance.ConcreteClass;

// subclass inheritated from a concrete superclass
public class Car extends Vehicle {

    // constructor
    public Car() {
        super.brand = "unknow";     //super refer to superclass
    }

    // override superclass method
    @Override
    public void honk() {
        System.out.println("A car honks...");
    }

    // subclass method
    public void setBrand(String brand) {
        super.brand = brand;
    }
}
