# array枚举

- Syntax: 枚举声明
  `dataType[] arrayVar = {value0, value1, ..., valuek};`

- `dataType[] arrayVar = {}`: 表示数组长度为 0；
- 可以枚举 null: `dataType[] arrayVar = {value0, null, value1};`

***

# final

-  one of modifier like `public` or `private`

- final 修饰符，用来修饰类、方法和变量，
    - final 修饰的类不能够被继承，
    - 修饰的方法不能被继承类重新定义，
    - 修饰的变量为常量，是不可修改的。

- It declares that the modified variable is locked on the memory level and cannot be assigned any new value.
- Its goal is to protect a variable from reassignment.

```java
final Person[] persons = {person[0],person[3],null, myPerson}

persons[0] = myPerson //报错，由于final锁定persons，所以无法修改索引值。
```

 - 一般用于通用的不应被修改的值
 - 为与一般变量区分，通常使用大写和下划线标识；ie`final String[] CONNECTION_STATUS = {"PENGDING","PROCESSING","FINISHED"}`

***

# enumeration枚举

- 关键字: `enum`
- Java 枚举是一个特殊的类，一般表示一组**常量**
- enum修饰的**类**
- Systax:
```java

enum Color 
{ 
    RED, GREEN, BLUE; 
} 

```


