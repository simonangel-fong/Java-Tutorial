
# Lesson 17 Inheritance


## Polymorphism多态

The word polymorphism means having many forms. 
In simple words, we can define polymorphism as **<u>the ability</u> of a message to be displayed in more than one form**. 






- When implementing interfaces and inheriting a class are required simultaneously, inheritance of a class should be placed ahead of the implementation of interfaces, since, in Java, multiple inheritances are not allowed but multiple implementations are legal.
当同时需要实现接口和继承父类时， `extends`置于`implements`之前，因为继承只能继承单个父类，用在实现接口之前，不会产生错误。
`class className extends superclass implements interface1, interface2{}`

- Instance cannot be created in an abstract class.

- Abstract class can have both abstract methods and concrete methods.

- A concrete class cannot have abstract methods.

- A Subclass should have all methods defined in its abstract superclass. In comparison, A subclass does not need to have all methods in its superclass that is concrete.
抽象类的子类必须定义父类声明的所有方法；非抽象类的子类无需定义父类声明的方法；

- The instance of a subclass can call a method, with the same method name, defined in the superclass directly, if this method is not overrided in the superclass.如果方法在子类中没有重写时，子类的实例可以直接调用父类的方法。

