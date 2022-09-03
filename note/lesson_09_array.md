# Array 数组

- Syntax:
  `dataType[] arrayVar = new dataType[arraySize];`


- 使用中括号标识: `[]`;

- 声明一个数组对象:

```java

int[] myInts = new int[];       //注意, 右边不使用括号，如果使用括号则指明创建一个对象，而非数列
Person[] persons = new Person[4];       //4代表新的Person对象数列persons的长度为4

```

- 新的数组对象可以调用数组的属性和方法; `persons.length`

- 设置数组对象:
- 如果索引没有被设置任何实例，则默认为`null`;
- **如果尝试访问未设定任何值的索引，则会抛出异常**；

```java
Person[] persons = new Person[4];
persons[0]=new Person();        //声明索引0处是一个新Person实例
// 此时由于persons[1]尚未设置任何值，则默认为null
//

```

- 引用指定数组：`arrayVar[index]`

## for 循环

- Syntax:

```java

for(type element: array){
    // some codes
}

```

### example: for / for each loop with array

```java

public class example09 {
    private int counter;

    public example09(int number) {
        System.out.println("Inside constructor");
        this.counter = number;
        System.out.println("Counter in constructor: " + this.counter);

    }

    public int returnCounter() {
        return counter;
    }

    public static void main(String[] args) {
        System.out.println("Inside main");

        // 左边使用[]声明新变量是一个class数组的类型
        // 右边new和[]声明一个新class数组；
        // arraysize为4，不能省略，因为是class类型
        example09[] examples = new example09[4];

        // 使用for设置数组
        for (var i = 0; i < examples.length; i++) {
            System.out.println("Inside for loop");
            examples[i] = new example09(i);
        }

        // for each的数组循环
        for (example09 item : examples) {
            System.out.println("Inside for each loop");
            System.out.println("Counter: " + item.returnCounter());
        }
    }
}
```

![实例图片](/note/pic/lesson09/lesson09_01.png)

> 注意:
> 如果数组所以没有赋值时，会报错`Exception in thread "main" java.lang.NullPointerException: Cannot invoke "lesson09.example09.returnCounter()" because "item" is null`
>
> ```java
>        for (var i = 0; i < examples.length; i++) {
>            System.out.println("Inside for loop");
>           if (i != 3) {       //即索引等于3时没有赋值
>              examples[i] = new example09(i);
>         }
>    }
>
> ```
