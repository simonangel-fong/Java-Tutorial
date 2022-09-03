package javatutorial.summary.Sample_Class.AbstractClass;

// abstract class, superclass
public abstract class Animal {

    // attribute
    protected int age;      // protected: subclass can access

    // construct method
    public Animal() {
        this.age = 0;
    }

    // concrete method
    public void sound() {
        System.out.println("Animal sound...");
    }

    // abstract method
    public abstract void setAge(int age);

}
