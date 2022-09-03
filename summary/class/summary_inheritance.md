[目录](/summary/java_note.md)

[TOC]

# Inheritance继承


## Subclass and superclass

- subclass (child)子类 - the class that inherits from another class
- superclass (parent)父类 - the class being inherited from


## Polymorphism多态

**Inheritance** lets us inherit attributes and methods from another class. 

**Polymorphism** uses those methods to perform different tasks. This allows us to perform a single action in different ways.

- **Polymorphism多态/Override重写**: 在**继承关系**中子类和父类同名方法的关系; 返回值和形参都不能改变。
- **Overload重载**: 在**同一个类**里面，不同参数的同名方法之间关系; 返回类型可以相同也可以不同。

||Polymorphism/Override|Overload|
|---|---|---|
|Context|Between superclass and its subclass|In the same class|
|Method name|Same|Same|
|Parameter|Identical|Different|
|Return|Identical|Flexible|


## Why And When To Use "Inheritance" and "Polymorphism"?

It is useful for code reusability: reuse attributes and methods of an existing class when you create a new class.
重用现有类的属性和方法。

- 多态的好处：可以使程序有良好的扩展，并可以对所有类的对象进行通用处理。

- 当子类没有重写父类的非抽象方法时，子类的实例也可以直接使用父类的方法。


## 修饰符限制

- 不能使用`final`修饰父类.

- 当一个类不想被继承，则使用`final`修饰符

***

# Superclass父类:声明

- **Signature**: 
    - 不能使用`final`修饰父类

- **Attribute** 和 **Method**:
    - 属性的声明与普通属性相同
    - Access modifier:
        - `protected`: 可以被同一包的类和子类访问，但不能被不同类访问
    - Non-access modifier:
        - `final`: 属性不能被子类修改
        - 如果父类不是abstract，则不能使用`abstract`


# Subclass子类: 继承

- **Signature**: 
    - keyword: `extends`
    - 只能继承一个父类;

- **Attribute** 和 **Method**:
    - 如果子类没有重写，则子类的实例将直接使用父类属性和方法;

## Object: 实例化

- 直接作为子类的数据类型


```java

// superclass
public class Vehicle {
    protected String brand;

    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}


// subclass
public class Car extends Vehicle {

    // constructor
    public Car() {
        super.brand = "unknow";     //super refer to superclass
    }

    // override superclass method
    @Override
    public void honk() {
        System.out.println("A car honks...");
    }

    // subclass method
    public void setBrand(String brand) {
        super.brand = brand;
    }
}


public static void main(String[] args) {
    Car car = new Car();
    car.honk();     //A car honks...
    car.setBrand("BMW");
    System.out.println("Car's brand: " + car.brand);    //Car's brand: BMW
}

```





