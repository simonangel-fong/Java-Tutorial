package javatutorial.summary.kw_static;
@SuppressWarnings("unused")
public class exampleEnumClass01 {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        System.out.println("Inside main method");
        Level level = Level.MEDIUM;

        // switch (level) {
        //     case LOW:
        //         System.out.println("The level is low.");
        //         break;
        //     case MEDIUM:
        //         System.out.println("The level is medium.");
        //         break;
        //     case HIGH:
        //         System.out.println("The level is high.");
        //         break;
        //     default:
        //         System.out.println("Error: switch falls into default.");
        // }

        for(Level item: Level.values()){
            System.out.println(item);
        }
    }
}
