# 续

## final

- 通常`final`定义的变量是私有的`private`，静止的`static`变量，一般放在类的开头。
- 如需访问，可以定义一个公开的`public`方法。
- 如果`final`定义的是一个数组`[]`类型，则上述方法可以使用`Array.copyof()`复制私有变量(需要`import java.util.Arrays`)。

```java

public class exampleLesson11 {
    // 定义一个private， static, final的数组
    // private确保变量不会被实例直接引用或修改，保障变量安全
    // static确保类的实例都可以访问
    // final确保即使是被访问也不会被修改
    // String[]类型由程序目的决定
    // 由于变量不会被修改，相当于定义了一个公有的常量，所以使用大写标识变量名
    private static final String[] MY_STATUS_VALUE = { "WORKING", "SLEEPING", "RELAXING" };

    // 定义一个Public方法，访问private变量
    // 使用Array.copyof()方法，复制final变量，保证安全。
    // 使用该方法需要import util.Arrays
    // 方法有两个参数，original，和length
    public String[] getStatusValue() {
        System.out.println("\nInside getStatusValue method");

        return Arrays.copyOf(MY_STATUS_VALUE, MY_STATUS_VALUE.length);
    }

    public static void main(String[] args) {
        System.out.println("\nInside Main method");

        // private 变量可以被类的main直接引用
        String[] statusValue = exampleLesson11.MY_STATUS_VALUE;
        System.out.println("\nThe first element of statusValue: " + statusValue[0]);

        exampleLesson11 sample = new exampleLesson11();
        String[] valueReturn = sample.getStatusValue();
        for (String item : valueReturn) {
            System.out.println("\nInside for loop method");
            System.out.println("Value of items: " + item);
        }
    }
}

```

## `==`与`.equals()`

- 对 int 类型，可以使用`==`比较其值是否相等
- 对 string 类型，则需要使用`equals()`方法比较.
- 注意，当使用 string.equals()时，确保 string 不为 null， 否则报错。
  ie
  `"ABC".equals(null)`;
  报错：`null.equals("ABC")`

---

# Switch

- Syntax:

```java
switch(expression) {
  case x:
    // code block
    break;
  case y:
    // code block
    break;
  default:
    /*
    * throw error
    */
}
```

- 如果缺少`break`，则会按顺序执行代码,英语属于`falls through`；
- 在实战中`switch`会配合`enum`使用。但如果`enum`类被修改但`switch`尚未同步时，会触发`default`代码，会令到程序不能达到目的。因此`default`一般会用于抛出异常，用来提醒`switch`需要同步,减少 bug。
