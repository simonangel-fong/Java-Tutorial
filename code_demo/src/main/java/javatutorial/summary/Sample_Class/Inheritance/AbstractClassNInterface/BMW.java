package javatutorial.summary.Sample_Class.Inheritance.AbstractClassNInterface;

/*
 *
*/

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
