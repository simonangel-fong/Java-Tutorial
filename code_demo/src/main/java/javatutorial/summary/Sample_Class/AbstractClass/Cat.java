package javatutorial.summary.Sample_Class.AbstractClass;

// concrete subclass inheritating from abstract class
public class Cat extends Mammal {

    // construct in a concrete subclass
    Cat() {
        super.age = 5;
    }

    // override superclass method in Mammal
    @Override
    public void eat() {

    }

    // override superclass method in Animal
    @Override
    public void setAge(int age) {
        super.age = age; // super refer to superclass Animal
        super.isGround = true; // super refer to superclass Mammal
    }

    public boolean getIsGround() {
        return super.isGround;
    }

}
