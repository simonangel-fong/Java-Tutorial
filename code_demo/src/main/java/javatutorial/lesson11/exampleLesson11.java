package javatutorial.lesson11;
import java.util.Arrays;


/**
 * exampleLesson11
 */
public class exampleLesson11 {
    // 定义一个private， static, final的数组
    // private确保变量不会被实例直接引用或修改，保障变量安全
    // static确保类的实例都可以访问
    // final确保即使是被访问也不会被修改
    // String[]类型由程序目的决定
    // 由于变量不会被修改，相当于定义了一个公有的常量，所以使用大写标识变量名
    private static final String[] MY_STATUS_VALUE = { "WORKING", "SLEEPING", "RELAXING" };

    // 定义一个Public方法，访问private变量
    // 使用Array.copyof()方法，复制final变量，保证安全。
    // 使用该方法需要import util.Arrays
    // 方法有两个参数，original，和length
    public String[] getStatusValue() {
        System.out.println("\nInside getStatusValue method");

        return Arrays.copyOf(MY_STATUS_VALUE, MY_STATUS_VALUE.length);
    }

    public static void main(String[] args) {
        System.out.println("\nInside Main method");

        // private 变量可以被类的main直接引用
        String[] statusValue = exampleLesson11.MY_STATUS_VALUE;
        System.out.println("\nThe first element of statusValue: " + statusValue[0]);

        exampleLesson11 sample = new exampleLesson11();
        String[] valueReturn = sample.getStatusValue();
        for (String item : valueReturn) {
            System.out.println("\nInside for loop method");
            System.out.println("Value of items: " + item);
        }
    }
}
