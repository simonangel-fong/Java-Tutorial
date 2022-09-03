package javatutorial.summary.kw_static;
/**
 * Java program to demonstrate the use of static blocks
 */
public class exampleStaticBlock {
    // static variable 静态变量
    static int j = 10;
    static int n;

    // static block
    static {
        // 执行block时, 输出
        System.out.println("Static block initialized.");
        n = j * 8; // block的代码
    }

    public static void main(String[] args) {
        // 执行main时, 输出
        System.out.println("Inside main method");
        System.out.println("Value of j : " + j); // 显示静态变量j
        System.out.println("Value of n : " + n); // 显示静态变量n
    }

}