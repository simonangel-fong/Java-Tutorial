package javatutorial.summary.kw_static;
@SuppressWarnings("unused")
public class exampleStaticMethod01 {

    static int instanceNumber;

    // static block
    static {
        // 执行block时, 输出
        System.out.println("\nInside the static block");
        // block的代码
        instanceNumber++;
        System.out.println("Static variable in static block: " + instanceNumber);
    }

    // constructor
    public exampleStaticMethod01() {
        // 执行constructor时, 输出
        System.out.println("\nInside the constructor");
        // constructor 的代码
        instanceNumber++;
        System.out.println("Static variable in constructor: " + instanceNumber);
    }

    // another static method

    public static void anotherStaticMethod() {
        /* 
        * if missing the keyword 'static', it will raise exception:
        * Cannot make a static reference to the non-static method
        */
        // output when execute in static method
        System.out.println("\nInside another static method");
        // static 的代码
        instanceNumber++;
        System.out.println("Static variable in another static method: " + instanceNumber);
    }

    public static void main(String[] args) {
        // 执行main时, 输出
        System.out.println("\nInside main method");
        // main code
        exampleStaticMethod01 staticMethod01 = new exampleStaticMethod01();
        
        // callback another static method
        anotherStaticMethod();      //static method, such as main method, can call static method only
        System.out.println("\nAt last, static variable: " + exampleStaticMethod01.instanceNumber + "\n");
    }
}
