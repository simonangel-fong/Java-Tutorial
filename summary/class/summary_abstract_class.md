[目录](../java_note.md)

[TOC]

# Abstract class抽象类

**Definition**
- A restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
    - 不能实例化unable to initialize
    - 只能通过继承访问
    - 成员变量、成员方法和构造方法的访问方式和普通类一样。
    - 一个类只能继承一个抽象类

## 声明superclass父类

- **Signature**: `abstract`

- **Attribute**: 
    - 属性的声明与普通属性相同
    - **Access modifier**:
        - `protected`: 可以被同一包的类和子类访问，但不能被不同类访问
    - **Non-access modifier**:
        - `final`: 属性不能被子类修改
        - 不能使用`abstract`

- **Method**: 
    - **Construct method**: 可以定义构造函数
    - 可以定义**实体方法concrete method**;
    - 也可以定义**抽象方法abstract method**
        - 使用关键字`abstract`
        - 抽象方法没有方法体method body, 即没有大括号brace,以分号semicolon结束.

```java

// abstract class, superclass
public abstract class Animal {

    // attribute
    // protected: subclass can access
    protected int age;

    // construct method
    public Animal() {
        this.age = 0;
    }

    // concrete method
    public void sound() {
        System.out.println("Animal sound...");
    }

    // abstract method
    public abstract void setAge(int age);

}

```

***

## 继承:concrete subclass

- 继承抽象类与普通的继承类似

- refer superclass引用父类: `super`

- **Signature**: 
    - 关键字`extends`
    - 只能继承一个abstract superclass父类

- **Attribute**: 属性的声明与普通属性相同

- **Method**: 
    - Constructor构造函数: 子类可以自定义构造函数
    - all abstract method declare in superclass must be defined in subclass.
    父类的所有抽象方法必须在非抽象的子类concrete class重写
    - 可以重写使用标签`@override`告诉编译器其修饰的方法是重写的方法。

```java

// subclass inheritating from abstract superclass
public class Dog extends Animal {

    // attribute in subclass
    private String owner;

    // Override method
    @Override
    public void setAge(int age) {
        // 使用super指代父类
        super.age = age;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return this.owner;
    }
}

```

***

## 继承:abstract subclass

- 继承抽象类与普通的继承类似

- `super`: refer superclass引用父类，包括所有父类；

- **Signature** 和 **Attribute**: 与普通属性相同

- **Method**: 
    - Abstract class中可以不声明新的方法;
    - Concrete class必须声明所有父类的Abstract method

```java


// abstract class, superclass
public abstract class Animal {

    // attribute
    protected int age;      // protected: subclass can access

    // construct method
    public Animal() {
        this.age = 0;
    }

    // concrete method
    public void sound() {
        System.out.println("Animal sound...");
    }

    // abstract method
    public abstract void setAge(int age);

}



// abstract subclass inheritating from another abstract class
public abstract class Mammal extends Animal {
    
    // attribute defined in abstract subclass
    protected boolean isGround;

    // abstract method in a abstract subclass
    public abstract void eat();
}



// concrete subclass inheritating from abstract class
public class Cat extends Mammal {

    // construct in a concrete subclass
    Cat() {
        super.age = 5;
    }

    // override superclass method in Mammal
    @Override
    public void eat() {

    }

    // override superclass method in Animal
    @Override
    public void setAge(int age) {
        super.age = age; // super refer to superclass Animal
        super.isGround = true; // super refer to superclass Mammal
    }

    public boolean getIsGround() {
        return super.isGround;
    }

}

```

***

## Instance实例

- 抽象类不能被实例化;

- 抽象类可以作为其子类的数据类型

```java

Animal dog = new Dog();     //抽象类Animal可以是子类Dog()的数据类型

```

