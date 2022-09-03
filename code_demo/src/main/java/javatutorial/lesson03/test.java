package javatutorial.lesson03;

public class test {

    public static void main(String[] arg) {
        Person p = new Person();  // 该处使用没有参数的构造函数
        
        System.out.println(p.returnPersonName("Paul"));
    }
}
