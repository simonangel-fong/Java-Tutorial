package javatutorial.summary.Sample_Class.AbstractClass;

// subclass
public class Dog extends Animal {

    // attribute in subclass
    private String owner;

    // Override method
    @Override
    public void setAge(int age) {
        // 使用super指代父类
        super.age = age;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return this.owner;
    }

}
