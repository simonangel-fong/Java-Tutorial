package javatutorial.lesson07;

class example4lesson07 {
    /*
     * example for illustrate conditional statement
     */

    int i = 4;
    int j = 5;

    public void instanceMethod() {
        System.out.println("\nInside instance method");
        if (i > j) {
            System.out.println("i > j");
        } else if (i < j) {
            System.out.println("i < j");
        } else {
            System.out.println("i = j");
        }
    }

    public static void main(String[] args) {
        System.out.println("\nInside main method");
        // 注意,由于instanceMethod不是static method，所以需要创建新实例
        example4lesson07 example_obj = new example4lesson07();
        example_obj.instanceMethod();
    }
}