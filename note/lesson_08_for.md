# loop 循环

## for

- Syntax:

```java

for (var i = 0; i < 10; i += 2) {

    // some codes
}

```

### example: for loop with a step of 2

```java

public class example08 {
    static int instanceCounter;

    public example08() {
        System.out.println("In the Constructor");
        instanceCounter++;
        System.out.println("Value of instanceCounter:" + instanceCounter);

    }

    public static void main(String[] args) {
        System.out.println("In the Main");

        example08 example;
        for (var i = 0; i < 10; i += 2) {
            example = new example08();
        }
        System.out.println("Number of instance: " + example08.instanceCounter);

    }
}

```

![实例效果](/note/pic/lesson08/lesson08_01.png)

> 代码说明:
> 步长: `i+=2`

---

## while

- Syntax:

```java

while (conditional statment) {
    // some codes
}

```

等效:

```java
    // for loop
    for (var i = 0; i < 10; i += 2) {
    example = new example08();
    }

    // while loop
    int i = 0;
    while (i < 10) {
        example = new example08();
        i += 2;
    }

```

---

## do ... while

- Syntax:

```java

do {
    // some codes
}while (conditional statment)

```

- 先执行 do 的代码, 再判断条件，
- 如果条件为 true，则进入循环，否则退出循环；
- 判断的条件与 while loop 相同，无需改变；
- 重点: **代码至少执行一次**

等效：

```java
    // for loop
    for (var i = 0; i < 10; i += 2) {
    example = new example08();
    }

    // while loop
    int i = 0;
    while (i < 10) {
        example = new example08();
        i += 2;
    }

    // do while loop: execute at least one time
    int i = 0;
    do {
        example = new example08();
        i += 2;
    } while (i < 10);

```
