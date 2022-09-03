package javatutorial.lesson16;

public class exampleLesson16 {

    public static void main(String[] args) {
        System.out.println("\nInside main method\n");
        BMW bmw01 = new BMW("Alex");
        BMW bmw02 = new BMW("Carrol");
        Mercedes mercedes01 = new Mercedes("Adam");

        Car[] carArray = { bmw01, bmw02, mercedes01 };
        for (Car car : carArray) {
            car.drive();
        }

        BMW bmwInquiry = bmw01;
        BMW[] bmwArray = { bmw01, bmw02 };
        System.out.println("\nIn dollar, what is the value of " + bmwInquiry.getOwner() + "'s car?");
        for (BMW bmw : bmwArray) {
            if (bmw.getOwner() == bmwInquiry.getOwner()) {
                System.out.println(bmw.getValue());
            }
        }

        System.out.println('\n' + bmwInquiry.getOwner() + "'s Car is on mortgage? \n" + bmwInquiry.isMortgage());
    }
}
