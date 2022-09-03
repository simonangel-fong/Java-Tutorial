
# main method

- The `main()` method is the method that is used to start a program initially.

- modifier修饰符
    - `public`: It should be accessible outside of the class. Thus it requires a modifier of `public`.
    可被类外部访问
    - `static`: It should run without dependency on an instance of the class. Thus it requires a modifier of `static`.
    不需要实例化即可调用 
    - `void`: It should not return anything.如果设置为非void，则会被定义为非程序入口，而被当做一个名叫main的普通方法。

- method name: `main()`
    方法名：约定为main

- Argument datatye: `String[]`
    参数: 约定字符串数组,所以可以接收有多个字符串

- for any program, there should only one main method.
- 对于某些包，可能不需要设置main()

# argument

String... argument: 等价于String[] argument

