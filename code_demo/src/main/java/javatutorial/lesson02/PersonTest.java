package javatutorial.lesson02; //package后的结构:从src下一级文件夹起到当前.java文件所在文件夹止

// the name of public class must be the same as the file name
public class PersonTest {

    public static void main(String[] args) {
        shouldReturnHelloWorld();
    }

    public static void shouldReturnHelloWorld() {
        Person simon = new Person();
        boolean is_equal = simon.sayHelloWorld() == "Hello world!";
        System.out.println(is_equal);

    }
}
