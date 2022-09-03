# Lesson 3: Summary for Keywords

## package

- `package`: 声明当前文件夹是一个 Java 包

- package 路径是`src`后到当前 java 文件的路径,使用句点`.`连接
  ie: `package lesson03;`

## import

- `import`: 引用其他包
- 引用路径与 package 相似
- 路径以`*`结束的，表示引用指定包的所有内容
- 路径以特定的类 class,方法 method,则只引用指定类或函数
  ie: `import lesson02.Name;`

## public

- `public`: 修饰符,声明其后的类,方法,属性可以被其他对象访问 access

## private

- `private`: 修饰符，声明其后的对象只能被当前对象访问，即为当前对象私有。
- 如果需要其他对象访问私有对象，则通过声明另一个公开方法，并返回该私有对象。
  ie:

  ```java
  public class Person{
    private String personName;  //私有属性

    public String name(){       //公有方法
        return personName;
    }
  }

  ```

## `;`semicolon 分号

- `;`:表达当前代码结束并执行. 所以对于声明类,方法,大括号时，不使用分号结束,因为这些都没有需要执行的代码。

- each code statement must end with a semicolon `;`.

## 数据类型声明

- 大写
- 声明变量的数据类型: `var String x='hello world!'`
- 声明方法的数据类型: `public String sayHelloWorld(){}`
- 方法没有放回特定数据类型的，使用`void`

## debug 测试

- 测试当前 Java 文件时，需要定义一个`main`方法
- `main`方法的修饰符是`public static void`

```java
public class PersonTest {

    public static void main(String[] args) {
        shouldReturnHelloWorld();
    }
}
```

## constructor 构造函数

- 构造函数的函数名称与类名一致

- 用于初始化类实例 instance

- 当定义构造函数后，使用 new 关键字+构造函数，创建新实例 instance

- 注意：创建新实例时， 其参数需要要与构造函数的参数一致.

```java
public class Person{
  private Name personName;   //定义一个私有变量

  //构造函数可以有参数；使用修饰符public；
  public Person(Name personName){
    this.personName = personName;   //this.指明personName是class的私有变量，而不是参数，及时他们有相同的变量名


  }
}

```

## comment 注释

- 多行: `/* some comment */`
- 单行: `// some comment`
