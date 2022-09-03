package javatutorial.lesson15;

public class exampleLesson15_02 {

    public static void main(String[] args) {
        System.out.println("\nInside main method");

        String[] statusArray = { "STUDYING", "READING", "RELAXING" };
        PersonAction personAction = new PersonAction();

        for (String status : statusArray) {
            System.out.println("\nInside for loop");
            System.out.println("  Value of status: " + status);
            if (isValid(status)) {
                System.out.println(" isValid = true");
                personAction.getStatus(status);
            } else {
                System.err.println("isValid = false");
            }
        }
    }

    // private说明只能在类内调用
    // static，因为是被static的main调用
    // boolean，因为需要判断是否valid
    private static boolean isValid(String status) {
        System.out.println("  Inside isValid method");

        try {
            // 对于enum类，可以使用valueof()方法将字符串转为enum中的值
            // 如果不存在，则抛出IllegalArgumentException异常
            PersonStatus.valueOf(status);
            return true;
        } catch (IllegalArgumentException e) {
            System.out.println("  Inside catch exception");
            System.err.println("  Exception: " + e);
            return false;
        } catch (RuntimeException e) {
            e.printStackTrace();
            return false;
        } finally {
            System.err.println("  End of the isValid method, finally!");
        }
    }
}
