package javatutorial.lesson16;

// only public, abstract & final are permitted
public class BMW implements Car, Asset {
    public static String COUNTRY = "Germany";

    private String owner;
    private Boolean isLoan = true;
    private int value = 1000;

    public BMW(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void drive() {
        System.out.println(owner + "is driving a BMW car.");
    }

    @Override
    public Boolean isMortgage() {
        return isLoan;
    }

    @Override
    public int getValue() {
        return value;
    }
}
