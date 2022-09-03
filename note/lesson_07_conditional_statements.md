
# datatype: boolean布尔值

- boolean数据类型表示**一位**的信息；
- 只有两个取值：`true` 和 `false`；
- 默认值是 `false；
- ie: `boolean one = true`

***

# 运算符

## 逻辑运算符

|操作符|运算|
|---|---|
|`&&`|与|
|`||`|或|
|`！`|非|

- 运算时，先算括号，再遵循从左到右依次运算。

## 关系运算符

|操作符|运算|
|---|---|
|`==`|是否相等|
|`!=`或`<>`|是否相等|
|`>`|大于|
|`>=`|大于或等于|
|`<`|小于|
|`<=`|小于或等于|

***

## conditional statement

- Syntax:
- **if...**
```java

if(boolean statement A){
    // some codes
}

```

- **if...else...**

```java

if(boolean statement A){
    // A codes
}else{
    // not A codes
}

```
- **if...else...if...else**

```java

if(boolean statement A){
    // A codes
}else if(boolean statement B){
    // B codes
}else{
    // not A, B,... codes
}

```
