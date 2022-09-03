package javatutorial.summary.kw_static;
@SuppressWarnings("unused")
public class exampleStaticMethod02 {

    static int instanceNumber=anotherStaticMethod();

    // static block
    static {
        // 执行block时, 输出
        System.out.println("\nInside the static block");
        // block的代码
        instanceNumber++;
        System.out.println("Static variable in static block: " + instanceNumber);
    }

    // constructor
    public exampleStaticMethod02() {
        // 执行constructor时, 输出
        System.out.println("\nInside the constructor");
        // constructor 的代码
        instanceNumber++;
        System.out.println("Static variable in constructor: " + instanceNumber);
    }

    // another static method

    public static int anotherStaticMethod() {
        // output when execute in static method
        System.out.println("\nInside another static method");
        System.out.println("Static variable in another static method: " + instanceNumber);
        return 20;
    }

    public static void main(String[] args) {
        // 执行main时, 输出
        System.out.println("\nInside main method");
        // main code
        exampleStaticMethod02 staticMethod01 = new exampleStaticMethod02();
        
        System.out.println("\nAt last, static variable: " + exampleStaticMethod02.instanceNumber + "\n");
    }
}
