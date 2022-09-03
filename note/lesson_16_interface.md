# Lesson 15 Interface 接口

- **Definition**

In Java, an interface is an <u>abstract type</u> that contains <u>a collection of methods and constant variables</u>.
接口是空方法的集合。

In the context of OOD, Objects define their interaction with the outside world through the methods that they expose. Methods form the object's interface with the outside world
对象与外界的互动由方法实现，则方法则构成了对象与世界的接口。
所以接口是一些列相关方法的集合。

## 声明接口

- 关键字: `interface`

- access modifier 访问修饰符:
  - 默认是`public`和`abstract`，通常可以忽略.
  - 不能使用`protected`,`default`,`private`和`final`关键字，否则产生编译错误

### 变量

- 接口中可以含有变量，但是接口中的变量会被隐式的指定为`public static final` 变量, 通常可以忽略。
- 变量不能是`private`
- 变量必须有初始值
- 由于接口一般是方法的集合，所以不建议在接口中定义常量，而应该在 class 或枚举中定义

### 方法 method

- the method in a interface cannot have a body.即不能有大括号
- modifier:
  - 接口中每一个方法也是隐式抽象的,接口中的方法会被隐式的指定为 `public abstract`，通常可以忽略.
  - 可以使用`static`,但需要在接口层面定义方法，即方法需要有 body。
- argument：接口方法可以带有参数
- return: 方法必须定义返回的数据类型
- exception: 接口方法可以定义强制抛出异常`throws Exception`
- production: 在现实中，为确保代码可读性，一般不会在一个接口中定义很多个方法，而是将多个方法分类到不同接口。再利用多接口的实现。

## 接口的实现 implements

- 接口在类中实现

### 声明

- 修饰符: only public, abstract & final are permitted

- 关键字: `implements`
 注意：有`s`。
- A class can implement more than one interface.一个类可以同时实现多个接口。

### 方法

- modifier:
  - 显式定义并只能是`public`
  - 可以使用`default `,`final`,`static`,但需要在接口层面定义方法，即方法需要有 body。
  - 不能使用`private`,`abstract`
- argument:方法中的参数与接口中的参数数量和数据类型一致
- return: 返回的数据类型必须和接口定义的方法一致；
- method: A class that implements the interface must implement all the methods in the interface.
  所有在接口定义的方法名都必须在类中实现
- exception: - 接口方法定义可以抛出异常的，类方法可以抛出异常，也可以不抛出异常； - 接口方法没有定义的，类方法不能抛出异常。

## 实例化: 接口作为一种数据类型

- 在实例化过程中，可以使用接口来声明数据类型，并使用 new 赋值。因此接口可以作为实现类的通用数据类型，令到代码有灵活性。

```java
// 类BMW, Ford是接口Car的实现
Car car;    //声明car类型
if(true){
  car = new BMW("Alex");    //赋值
}else{
  car = new Ford("Alex");   //赋值
}

```

- 在计算中，可以用`interface_name[]`声明一个该类型的数组,只要数组中的对象是该接口的实现类。

```java
Car[] carArray = {bmw01,bmw02}      //只要bmw01，bmw02是Car的实现类即可。
```

- 如果实例声明是接口库类型，则其方法只有是在接口中的方法；在实现的类中新定义方法则不能使用。
  We can’t create an instance(interface can’t be instantiated) of the interface but we can make the reference of it that refers to the Object of its implementing class.

```java
Car bmw01 = new BMW("Alex");    //只能使用car接口中定义的方法
BMW bmw02 = new BMW("Carrol");      //既可以使用car的方法，也可以使用BMW类中自定义的方法。
```

- 可以作为参数.

```java

public void drive(Car car){

}

```

---

## extend 继承

### 声明继承接口

- keyword: `extends`
- multiple inheritances: 多继承
子类只能继承一个父类，但子接口可以继承多个父接口；
```java
public interface Hockey extends Sports, Event
```

***

## 标记接口

- 没有任何方法的接口被称为标记接口。

```java
public interface EventListener
{}
```

- 目的:
  - 建立一个公共的父接口：使用一个标记接口来建立一组接口的父接口
  - 向一个类添加数据类型:  


## advantages and disadvantages of the interface in Java

|             | advantages                                 | disadvantages |
| ----------- | ------------------------------------------ | ------------- |
| inheritance | To achieve multiple inheritances 多重继承. |               |
| coupling    | To achieve loose coupling 松耦合.          |               |
