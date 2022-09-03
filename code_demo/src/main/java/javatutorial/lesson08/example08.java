package javatutorial.lesson08;

/**
 * example08: example for "for"
 */
@SuppressWarnings("unused")
public class example08 {
    static int instanceCounter;

    public example08() {
        System.out.println("In the Constructor");
        instanceCounter++;
        System.out.println("Value of instanceCounter:" + instanceCounter);

    }

    public static void main(String[] args) {
        System.out.println("In the Main");

        example08 example;

        // // for loop
        // for (var i = 0; i < 10; i += 2) {
        // example = new example08();
        // }

        // // while loop
        // int i = 0;
        // while (i < 10) {
        // example = new example08();
        // i += 2;
        // }

        // do while loop
        int i = 0;
        do {
            example = new example08();
            i += 2;
        } while (i < 10);
        System.out.println("Number of instance: " + example08.instanceCounter);
    }
}
