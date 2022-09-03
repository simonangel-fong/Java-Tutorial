package javatutorial.lesson16;

/**
 * for lesson 16 interface
 * interface Car
 */
// 访问修饰符隐式定义为public abstact.通常可忽略
interface Car {

    // 接口可以定义变量
    // 变量修饰符隐式定为only public, static & final are permitted.通常可忽略
    // 变量必须有初始值
    // 由于接口一般是方法的集合，所以不建议在接口中定义常量，而应该在class或枚举中定义
    int MAX_SPEED = 180 ;


    // only public, private, abstract, default, static and strictfp are permitted
    // 通常可忽略
    void drive();
    
    String getOwner();

    // static void repair(){
    //     System.out.println("hello");
    // }
    
}
