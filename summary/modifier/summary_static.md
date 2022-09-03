# Keyword: `static`

- `static` keyword is mainly used for **memory management**.

- It can be used with **variables**, **methods**, **blocks** and **nested classes**.
  对象: 变量, 方法, 代码块, 类

- Basically, static is used for a **constant variable** or a **method** that is _same for every instance of a class_.

- The **main method** of a class is generally labeled static.
  类中的 main 方法通常是 static 的
  `public static void main(String[] arg) {}`

- When a member of the class is declared as static, it can be accessed **before the objects of its class are created**, and without any object reference.
  被 static 修饰的类成员能在类实例化前被访问。

In Java programming language, static keyword is a **non-access modifier** and can be used for the following:

- [Static Block](#static-block静态代码块)
- [Static Variable](#static-variable静态变量)
- [Static Method](#static-method)
- [Static Class](#static-class)

---

## Static Block 静态代码块

If you need to **do the computation in order to initialize your static variables**, you can declare a static block that gets executed exactly once, when the class is first loaded.

- 类中的代码块用于初始化静态变量，注意是**静态变量**。
- 即使类没有实例化，代码块都会先执行

### Example: static block 初始化静态变量

```java

/**
 * Java program to demonstrate the use of static blocks
 */
package summary.kw_static;

public class exmapleStaticBlock {
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

```

![exampleStaticBlock](/summary/pic/keyword/exmapleStaticBlock01.png)

> 代码说明:
>
> 1.  static block 代码最先被执行: `Static block initialized.`
> 2.  static block 用于计算 static 变量: `Inside main method`
> 3.  main 方法后于 static block 代码执行.

---

## Static Variable 静态变量

- Static variables are, essentially, **global variables**.
  全句变量
- Basically, all the instances of the class share the same static variable.
  类的实例共享同一静态变量.即实例都可以**修改,读取**变量。
- Static variables can be created at **class-level** only.
  只在类级别创建。

### Example: 显示实例的个数

```java

public class exampleStaticVariable {
    // java变量需要先声明在引用，如果变量在block之后，会报错
    static int instanceNumber;

    public exampleStaticVariable() {
        // 执行constructor时, 输出
        System.out.println("Inside the constructor");
        // constructor 的代码
        instanceNumber++;
        System.out.println("Number of static variable in constructor: " + instanceNumber);
    }

    // static block
    static {
        // 执行block时, 输出
        System.out.println("Inside the static block");
        // block的代码
        instanceNumber++;
        System.out.println("Number of static variable in static block: " + instanceNumber);
    }

    public static void main(String[] args) {
        // 执行main时, 输出
        System.out.println("Inside main method");
        // main code
        exampleStaticVariable staticVariable01 = new exampleStaticVariable();
        exampleStaticVariable staticVariable02 = new exampleStaticVariable();
        exampleStaticVariable staticVariable03 = new exampleStaticVariable();
        System.out.println("the number of instance: " + exampleStaticVariable.instanceNumber);
    }
}

```

![exampleStaticVariable](/summary/pic/keyword/exampleStaticVariable01.png)

> 代码说明:
>
> 1.  static block
>
> - static block 代码最先被执行: `Static block initialized.`；
> - 即使没有被实例化，static block 代码也会执行，且只执行一次；
>
> 2.  main method
>
> - main 函数后于 static block；
>
> 3.  constructor
>
> - 每次调用 new, 会触发 constructor 函数，所以每次都++；
>
> 4.  result
>
> - 结果是 4，static block 1 次 + constructor 3 次；

***

## Static Method

- Methods declared as static can have the following restrictions:

  - They can directly call **other static methods only**.只能调用静态方法
  - They can access **static data** directly.直接调用静态变量

- The most common example of a static method is the `main()` method.

### Example: callback static method

```java

public class exampleStaticMethod {

    static int instanceNumber;

    // static block
    static {
        // 执行block时, 输出
        System.out.println("\nInside the static block");
        // block的代码
        instanceNumber++;
        System.out.println("Static variable in static block: " + instanceNumber);
    }

    // constructor
    public exampleStaticMethod() {
        // 执行constructor时, 输出
        System.out.println("\nInside the constructor");
        // constructor 的代码
        instanceNumber++;
        System.out.println("Static variable in constructor: " + instanceNumber);
    }

    // another static method

    public static void anotherStaticMethod() {
        /*
        * if missing the keyword 'static', it will raise exception:
        * Cannot make a static reference to the non-static method
        */
        // output when execute in static method
        System.out.println("\nInside another static method");
        // static 的代码
        instanceNumber++;
        System.out.println("Static variable in another static method: " + instanceNumber);
    }

    public static void main(String[] args) {
        // 执行main时, 输出
        System.out.println("\nInside main method");
        // main code
        exampleStaticMethod staticMethod01 = new exampleStaticMethod();

        // callback another static method
        anotherStaticMethod();      //static method, such as main method, can call static method only
        System.out.println("\nAt last, static variable: " + exampleStaticMethod.instanceNumber + "\n");
    }
}

```

![static-method](/summary/pic/keyword/exampleStaticMethod01.png)

> 代码说明:
>- static block: 优先执行；
>- main method: 后于static block；
>- constructor：调用new时触发constructor
>- static method: 当调用方法时触发
>- 结果：3; static block 1 次; constructor 1次; static method 1次

***

### Example: 调用static method赋值static变量


```java

package summary.kw_static;

public class exampleStaticMethod02 {

    static int instanceNumber=anotherStaticMethod();

    // static block
    static {
        // 执行block时, 输出
        System.out.println("\nInside the static block");
        // block的代码
        instanceNumber++;
        System.out.println("Static variable in static block: " + instanceNumber);
    }

    // constructor
    public exampleStaticMethod02() {
        // 执行constructor时, 输出
        System.out.println("\nInside the constructor");
        // constructor 的代码
        instanceNumber++;
        System.out.println("Static variable in constructor: " + instanceNumber);
    }

    // another static method

    public static int anotherStaticMethod() {
        // output when execute in static method
        System.out.println("\nInside another static method");
        System.out.println("Static variable in another static method: " + instanceNumber);
        return 20;
    }

    public static void main(String[] args) {
        // 执行main时, 输出
        System.out.println("\nInside main method");
        // main code
        exampleStaticMethod02 staticMethod01 = new exampleStaticMethod02();
        
        System.out.println("\nAt last, static variable: " + exampleStaticMethod02.instanceNumber + "\n");
    }
}

```

![static-method](/summary/pic/keyword/exampleStaticMethod02.png)

> 代码说明:
>- 由于static变量是使用static方法赋值的，而block执行需要在声明static变量之后，所以static method赋值需要在block之后；
>- static block: 在static变量被赋值后执行；
>- main method: 后于static block；
>- constructor：调用new时触发constructor
>- 结果22; 
>   - static method时, static variable为0；
>   - 执行完static method时, static variable为20;
>   - static block时, static variable为21;
>   - constructor时, static variable为22;

***

## Static Class

- A class can be made static only if it is a **nested class**嵌套类.
- Nested static class doesn’t need a reference of Outer class. 
不需要创建外部类来访问，可以直接访问
- In this case, a static class cannot access non-static members of the Outer class.不能访问外部类的非静态成员

### Example: create nested class

```java

public class exampleStaticClass {

    static int testVariable;

    static {
        // execute when computing a static variable
        System.out.println("\nStatic block");
        testVariable++;
        System.out.println("Variable in static block: " + testVariable);
    }

    // constructor
    exampleStaticClass() {
        // execute when creating an instance of outer class
        System.out.println("\nOuter class's constructor");
        testVariable++;
        System.out.println("Variable in outer constructor: " + testVariable);
    }

    public void outerMethod() {
        System.out.println("\nOuter Method");
        testVariable++;
        System.out.println("Variable in outer method: " + testVariable);
    }

    // nested class
    static class nestedStaticClass {
        nestedStaticClass() {
            // execute when creating an instance of inner class
            System.out.println("\nInner class's constructor");
            testVariable++;
            System.out.println("Variable in inner constructor: " + testVariable);
        }

        public void innerMethod() {
            System.out.println("\nInner Method");
            testVariable++;
            System.out.println("Variable in inner method: " + testVariable);
        }
    }

    public static void main(String[] args) {
        System.out.println("\nMain method");
        // create instance of nested class without creating instance of outer class
        exampleStaticClass.nestedStaticClass nestedObject = new exampleStaticClass.nestedStaticClass();
        // callback inner method
        nestedObject.innerMethod();
        System.out.println("\nAt last, Variable: " + testVariable + "\n");
    }
}

```

![static-class](/summary/pic/keyword/exmapleStaticClass01.png)

> 代码说明:
>- static block: 优先执行；
>- main method: 后于static block；
>- constructor：创建新的嵌套类实例
>- nested method: 调用嵌套类的方法
>- 注意: innerMethod可以直接访问了外部的变量testVariable
