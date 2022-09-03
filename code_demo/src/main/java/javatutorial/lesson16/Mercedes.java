package javatutorial.lesson16;

public class Mercedes implements Car{
    public static String COUNTRY = "Germany";

    private String owner;

    public Mercedes(String owner) {
        this.owner = owner;
    }

    @Override
    public void drive() {
        System.out.println(owner + "is driving a Mercedes car.");
    }
    
    public String getOwner() {
        return owner;
    }
}
