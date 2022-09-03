package javatutorial.summary.kw_static;
@SuppressWarnings("unused")
public class exampleStaticVariable {
    static int instanceNumber;

    public exampleStaticVariable() {
        // 执行constructor时, 输出
        System.out.println("Inside the constructor");
        // constructor 的代码
        instanceNumber++;
        System.out.println("Number of static variable in constructor: " + instanceNumber);
    }

    // static block
    static {
        // 执行block时, 输出
        System.out.println("Inside the static block");
        // block的代码
        instanceNumber++;
        System.out.println("Number of static variable in static block: " + instanceNumber);
    }

    public static void main(String[] args) {
        // 执行main时, 输出
        System.out.println("Inside main method");
        // main code
        exampleStaticVariable staticVariable01 = new exampleStaticVariable();
        exampleStaticVariable staticVariable02 = new exampleStaticVariable();
        exampleStaticVariable staticVariable03 = new exampleStaticVariable();
        System.out.println("the number of instance: " + exampleStaticVariable.instanceNumber);
    }
}
