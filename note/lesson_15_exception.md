# Lesson 15: Exception

## 名词解释:

- **run time**: the execution of a program 运行期间

## Exception

- definition

处理异常
In computing and computer programming, **exception handling** is the process of responding to the occurrence of exceptions – _anomalous or exceptional conditions requiring special processing_ – during the execution of a program.

In general, an exception **breaks the normal flow of execution** and executes a _pre-registered exception handler_;
异常的影响: 影响执行流畅性
处理: 集中处理

### Exception handling: `try`/`catch`

- Syntax:

```java

try
{
   // 程序代码
}catch(ExceptionName e1)
{
   //Catch 块
}

```

---

### Exception handling: `try`/`catch`/`finally`

- Syntax:

```java

try{
  // 程序代码
}catch(异常类型1 异常的变量名1){
  // 程序代码
}catch(异常类型2 异常的变量名2){
  // 程序代码
}finally{
    // no matter if there is an exception during the execution, the finally codes will always be executed.
    //  通常是close()方法。
}

```

- multiple catches

```java

try{
   // 程序代码
}catch(异常类型1 异常的变量名1){
  // 程序代码
}catch(异常类型2 异常的变量名2){
  // 程序代码
}catch(异常类型3 异常的变量名3){
  // 程序代码
}

```

***

### throw exception: `throw` & `throws`

- Syntax:

```java

public class className
{
  public void deposit(double amount) throws Exception
  {
    // Method implementation
    throw new Exception();
  }
  //Remainder of class definition
}

```

***

## 分类

In Java, exceptions under **`Error`** and **`RuntimeException`** classes are <u>unchecked exceptions</u>, **everything else under `throwable`** is <u>checked</u>.

### Unchecked Exceptions

- the exceptions that are not checked at compile time.
  编译时无需检查。

### Checked Exceptions

- **definition**
  the exceptions that are checked at **compile time**.
  编译时必须检查。

If some code within a <u>method</u> throws a _checked exception_, then the method must either **handle the exception** or it must **specify the exception** using the throws keyword.
如果没有处理异常或使用 throw 关键字，则不会编译。

---

### 实例:throw checked exception

- 三个 java 文件
  枚举类型 CarState
  类 CarService
  主方法 exampleLession15.main()
- 演示目的：

  - 抛出异常存在层次，即 CarState 抛出异常到 CarService,再到 main
  - `new exception()`是**check exception**
  - `throw`是在代码中抛出异常，其后 exception 可以指定异常类型
  - `throws Exception`是声明方法存在没处理的异常
  - 到 main 方法需要使用`try catch`处理，否则无法编译
    `java.lang.Error: Unresolved compilation problem: Unhandled exception type Exception`
  - `e.printStackTrace()`命令可以在 console 输出堆 stack trace, a report that provides information about program subroutines.

- CarState.java

```java

public enum CarState {
    DRIVING, WAITING, PARKING;

    // throws声明该方法中存在没有处理的异常
    public static CarState string2State(String state) throws Exception {
        switch (state) {
            case "Driving":
                return DRIVING;
            case "Waiting":
                return WAITING;
            case "Parking":
                return PARKING;
            default:
                // 声明抛出一个checked exception
                throw new Exception("Unknow state(" + state + ")");
        }
    }
}

```

- CarService.java

```java
public class CarService {

    // throws声明该方法的代码存在一个没有处理catch的异常
    public void process(String input) throws Exception {
        System.out.println("Inside CarService process method");
        CarState carState = CarState.string2State(input);
        System.out.println(carState);
    }
}
```

- exampleLesson15.java

```java

public class exampleLesson15 {

    public static void main(String[] args) {
        System.out.println("\nInside main method");

        CarService carService = new CarService();
        String[] statusList = { "Waiting", "Parking", "Driving", "Repairing", "Retired" };
        for (String status : statusList) {
            try {
                carService.process(status);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

```

- 结果：
  ![screenshot-exception](/note/pic/lesson15/lesson15_01.jpg)

---

### 实例: throw unchecked exception

只需要 throw 指定默认 exception

- 三个 java 文件
  枚举类型 PersonStatus
  类 PersonAction
  主方法 exampleLession15_02.main()
- 演示目的：

  - `RuntimeException`是**unchecked exception**，因此抛出该异常的方法无需使用`throws Exception`来声明;
  - 使用`if (isValid(status)) {}`进行逻辑分支, 在`isValid()`中根据 try/catch 是否抛出异常而返回 boolean;
  - enum 类的`valueOf()`方法用于将字符串转为枚举类的值，如果不存在则抛出`IllegalArgumentException`
  - `switch`中 default 一般抛出异常，用于提醒判断的 conditional statement 存在未考虑的值。

- PersonStatus.java

```java
public enum PersonStatus {
    STUDYING, WORKING, SLEEPING, RELAXING;

    // 由于RuntimeException是unchecked exception，所以不需要throws
    public static PersonStatus string2Status(String status) {
        switch (status) {
            case "STUDYING":
                return STUDYING;
            case "WORKING":
                return WORKING;
            case "SLEEPING":
                return SLEEPING;
            case "RELAXING":
                return RELAXING;
            default:
                // 该处用于兜底，即当status都没有在switch时，触发runtime异常，用于提醒switch参数存在未考虑的值

                throw new RuntimeException("Unknow status: " + status);
        }
    }
}

```

- PersonAction.java

```java
public class PersonAction {

    public void getStatus(String status){
        System.out.println("   Inside PersonAction getStatus method");
        PersonStatus personStatus = PersonStatus.string2Status(status);
        System.out.println("   Person status: " + personStatus);
    }
}
```

- exampleLesson15_02.java

```java

public class exampleLesson15_02 {

    public static void main(String[] args) {
        System.out.println("\nInside main method");

        String[] statusArray = { "STUDYING", "READING", "RELAXING" };
        PersonAction personAction = new PersonAction();

        for (String status : statusArray) {
            System.out.println("\nInside for loop");
            System.out.println("  Value of status: " + status);
            if (isValid(status)) {
                System.out.println(" isValid = true");
                personAction.getStatus(status);
            } else {
                System.err.println("isValid = false");
            }
        }
    }

    // private说明只能在类内调用
    // static，因为是被static的main调用
    // boolean，因为需要判断是否valid
    private static boolean isValid(String status) {
        System.out.println("  Inside isValid method");

        try {
            // 对于enum类，可以使用valueof()方法将字符串转为enum中的值
            // 如果不存在，则抛出IllegalArgumentException异常
            PersonStatus.valueOf(status);
            return true;
        } catch (IllegalArgumentException e) {
            System.out.println("  Inside catch exception");
            System.err.println("  Exception: " + e);
            return false;
        }
    }
}

```

![unchecked-exception](/note/pic/lesson15/lesson15_02.jpg)
