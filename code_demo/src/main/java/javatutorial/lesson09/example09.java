package javatutorial.lesson09;

public class example09 {
    private int counter;

    public example09(int number) {
        System.out.println("Inside constructor");
        this.counter = number;
        System.out.println("Counter in constructor: " + this.counter);

    }

    public int returnCounter() {
        return counter;
    }

    public static void main(String[] args) {
        System.out.println("Inside main");

        // 左边使用[]声明新变量是一个class数组的类型
        // 右边new和[]声明一个新class数组；
        // arraysize为4，不能省略，因为是class类型
        example09[] examples = new example09[4];

        // 使用for设置数组
        for (int i = 0; i < examples.length; i++) {
            System.out.println("Inside for loop");
            if (i != 3) {
                examples[i] = new example09(i);
            }
        }

        // for each的数组循环
        for (example09 item : examples) {
            System.out.println("Inside for each loop");
            System.out.println("Counter: " + item.returnCounter());
        }
    }
}
