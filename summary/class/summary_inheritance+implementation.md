
# Inheritance & Implementation继承父类+实现接口

- 先继承再实现.`class className extends superclass implements interface1, interface2`

```java

// Abstract superclass
public abstract class Vehicle {

    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}


// Abstract subclass
public abstract class Car extends Vehicle {
    
    abstract void drive();
}


// Interface
public interface CarService {

    void repair();
}


// Interface
public interface Register{

    Boolean isRegistered(Car car);
}


// Concrete subclass
// extends first, then implements
public class BMW extends Car implements CarService, Register {

    // override method in interface CarService
    @Override
    public void repair() {
        System.out.println("Under repair...");
    }

    // override method in interface Register
    @Override
    public Boolean isRegistered(Car car) {
        return true;
    }

    @Override
    void drive() {
        System.out.println("BMW driving...");
    }
}


// main()
public class XampleAbstractClassNInterface {

    public static void main(String[] args) {
        BMW bmw = new BMW();
        bmw.honk();             //method in abstract superclass
        bmw.drive();            //method in abstract superclass
        bmw.repair();           //method in interface
        System.out.println("Is BMW registerd? " + bmw.isRegistered(bmw));       //method in interface
    }
}

```
