package javatutorial.lesson15;

/**
 * exampleLesson15
 * throws, thow, new exception()
 */
public class exampleLesson15_01 {

    public static void main(String[] args) {
        System.out.println("\nInside main method");

        CarService carService = new CarService();
        String[] statusList = { "Waiting", "Parking", "Driving", "Repairing", "Retired" };
        for (String status : statusList) {
            try {
                carService.process(status);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}