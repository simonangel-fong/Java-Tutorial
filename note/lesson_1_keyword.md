
# Lesson 1 Keywords关键字

ref: https://www.w3schools.com/JAVA/java_ref_keywords.asp
15 Java keywords

### package包

- The `package` keyword creates a package.
- 包主要用来对类和接口进行分类
- 为确保包名唯一
- 缺少时，会抛出`java.lang.ClassNotFoundException`异常

- recommend: 
  - 1. to anounce package at the beginning of program; 置顶
  - 2. structure: from the left to the right, the meaning of package name is getting more and more parcific.从左到右,越来越具体
  - 3. default wording用词: use lower case and singular words; 小写,单数
  - 4. using **words related to the business**, rather than some technical terms

***

### import

import 语句就是用来提供一个合理的路径，使得编译器可以找到某个类。
to import some exist code into the program.

1. declare after package name
2. `*`代表引入所有

***

### class类
announce the unit of code声明某个单位的代码

命名方式:
1. `class class_name{ some code }`
2. class_name: starting with capital letter and always relating to the business. ie:`class Car{}`
3. keep class as small as possible to improve reusability and readability. 最小以提高重复使用性和可读性

***

### method方法

a class consist methods, the code defining how to achieve certain things.

methods are usually called "functions".

recommend:
1. use **verbs** as the name of methods, as methods define actions executed on classes and verbs can describ the purpose of the methods.使用动词
2. `methos_name(parameter){ some code }`
3. using lower case letter
4. `parameter`: use as few parameter as possible, to improve reusability and readability

***

### variable变量

the value of variable can be changed值可变

***

### public

modifier修饰词: defining any class from any package, 

Usage:
```java
public class Car{       
    public drive(speed){

    }
}
```

***

### void

- In a method, a value is usually assigned as the return of a method. In some cases, the method does not return any value. Thus, the word void declare that the method will not return a value. 

- void = any data type相当于任何数据类型

Usage:
```java

public class Car{
    public void dirve(Speed){     //表明drive方法不会返回任何值

    }
}

```

***

### @Test

will be covered in later

***

### CamelCase骆驼命名法

underscore: 下划线命名法，其他语言

Java: 

***

### 标点

#### .句号

- 用于连接类与属性或方法. ie:`car.drive()`或`car.color`

***

#### ;分号

- the end of a statement表示一行代码结束
```java
public void shouldDrive(){
    car.drive(100);     //分号表示该行代码结束
}

```

***

### class & object

- class: define some general actions
- object: when the program is running a certain of object will be created and run as sets of values in computer memory.

***

### object oriented language面向对象的语言

***

### constructor构造函数

a special method that creates an object from a class when the class is called.

when the object is already exist, constructor method cannot be called any more. 仅在初始化类是调用

it usually executed when `new` is called.与关键字new有关

***

### variable declaration变量声明

declaring a variable beforehand. 先声明再调用

### object allocation对象分配

```java

Car myCar = new car(10, 120)       //等号左边是声明变量,右边是创建一个对象，使用等号将对象分配给变量myCar

```

