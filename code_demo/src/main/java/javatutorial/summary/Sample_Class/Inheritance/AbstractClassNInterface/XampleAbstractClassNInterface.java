package javatutorial.summary.Sample_Class.Inheritance.AbstractClassNInterface;

/*
 * abstract subclass Car <- abstract superclass Vehicle
 * concrete subclass BMW <- abstract superclass Car
 * 
 * class BMW <- interface Carservice, Register
 * 
 */
public class XampleAbstractClassNInterface {

    public static void main(String[] args) {
        BMW bmw = new BMW();
        bmw.honk();             //method in abstract superclass
        bmw.drive();            //method in abstract superclass
        bmw.repair();           //method in interface
        System.out.println("Is BMW registerd? " + bmw.isRegistered(bmw));       //method in interface
    }
}
