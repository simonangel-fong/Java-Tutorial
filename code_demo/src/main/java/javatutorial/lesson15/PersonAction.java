package javatutorial.lesson15;

public class PersonAction {

    public void getStatus(String status){
        System.out.println("   Inside PersonAction getStatus method");
        PersonStatus personStatus = PersonStatus.string2Status(status);
        System.out.println("   Person status: " + personStatus);
    }
}
