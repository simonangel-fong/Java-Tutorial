# Keyword: `enum`

- An `enum` is a special "**class**" that represents a group of **constants** (unchangeable variables, like final variables).
  本质是一个特殊类

- To create an enum, use the `enum` keyword _(instead of `class` or `interface`)_.

- The constants in an enum are separated by a comma `,`.

- The constants should be in **uppercase letters**.

- 常量不使用分号结束，因为没有代码需要执行.

- enum constants are `public`, `static` and `final`

- Use enums when you have values that you know **aren't going to change**, like month days, days, colors, deck of cards, etc.

Syntax:

```java
enum className{
    constant_1, constant_2, ..., constant_k
}
```

***

## Access enum constants访问枚举类的常量

- 左边: 声明枚举类
- 右边: 类似`static`,使用句点分隔,直接访问常量

```java

className enumVar = className.constant_1;

```

***

## Enum inside a Class在类内部创建枚举类

```java

public class exampleEnumClass01 {
    enum level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        System.out.println("Inside main method");
        level levelVariable = level.LOW;
        System.out.println("Value of levelVariable: " + levelVariable);
    }
}

```
结果:
![enum_inside_class](/summary/pic/keyword/exmapleEnumClass01.png)

***

## Enum in a Switch Statement

```java

    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        System.out.println("Inside main method");
        Level level = Level.MEDIUM;

        switch (level) {
            case LOW:
                System.out.println("The level is low.");
                break;
            case MEDIUM:
                System.out.println("The level is medium.");
                break;
            case HIGH:
                System.out.println("The level is high.");
                break;
            default:
                System.out.println("Error: switch falls into default.");
        }
    }

```

***

## Loop Through an Enum

```java

    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        System.out.println("Inside main method");
        Level level = Level.MEDIUM;

        for(Level item: Level.values()){
            System.out.println(item);
        }
    }

```

