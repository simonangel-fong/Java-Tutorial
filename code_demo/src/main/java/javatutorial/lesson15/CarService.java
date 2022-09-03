package javatutorial.lesson15;

// @SuppressWarnings("unused")
public class CarService {

    // throws声明该方法的代码存在一个没有处理catch的异常
    public void process(String input) throws Exception {
        System.out.println("\nInside CarService process method");
        CarState carState = CarState.string2State(input);
        System.out.println(carState);
    }
}
