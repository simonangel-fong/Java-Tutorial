package javatutorial.summary.Sample_Class.AbstractClass;

public class XampleAbstractClass01 {

    public static void main(String[] args) {
        Animal dog = new Dog();

        System.out.println("Dog's age is " + dog.age + ".");

        Animal cat = new Cat();
        System.out.println("Cat's age is " + cat.age);
    }
}
