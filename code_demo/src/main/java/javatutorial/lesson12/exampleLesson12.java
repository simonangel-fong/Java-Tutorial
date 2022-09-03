package javatutorial.lesson12;

public class exampleLesson12 {
    /*
     * example for switch
     */

    enum Status {
        PENDING, PROCESSING, PROCESSED
    }

    public static void main(String[] args) {
        Status status = Status.PROCESSED;

        switch (status) {
            default:
                System.out.println("Return default");
                // break;
            case PENDING:
                System.out.println("Return PENDING");
                break;
            case PROCESSING:
                System.out.println("Return PROCESSING");
                break;
        }
    }
}
