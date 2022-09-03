package javatutorial.summary.kw_static;

public class exampleStaticClass01 {

    static int testVariable;

    static {
        // execute when computing a static variable
        System.out.println("\nStatic block");
        testVariable++;
        System.out.println("Variable in static block: " + testVariable);
    }

    // constructor
    exampleStaticClass01() {
        // execute when creating an instance of outer class
        System.out.println("\nOuter class's constructor");
        testVariable++;
        System.out.println("Variable in outer constructor: " + testVariable);
    }

    public void outerMethod() {
        System.out.println("\nOuter Method");
        testVariable++;
        System.out.println("Variable in outer method: " + testVariable);
    }

    // nested class
    static class nestedStaticClass {
        nestedStaticClass() {
            // execute when creating an instance of inner class
            System.out.println("\nInner class's constructor");
            testVariable++;
            System.out.println("Variable in inner constructor: " + testVariable);
        }

        public void innerMethod() {
            System.out.println("\nInner Method");
            testVariable++;
            System.out.println("Variable in inner method: " + testVariable);
        }
    }

    public static void main(String[] args) {
        System.out.println("\nMain method");
        // create instance of nested class without creating instance of outer class
        exampleStaticClass01.nestedStaticClass nestedObject = new exampleStaticClass01.nestedStaticClass();
        // callback inner method
        nestedObject.innerMethod();
        System.out.println("\nAt last, Variable: " + testVariable + "\n");
    }
}
