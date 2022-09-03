# 续

## switch

- 如果需要 default 位于 switch 块顶部，则需要添加 break; 否则当没有符合任何 case 而需要执行 default 代码时，会执行 default 代码直到下一个 break；

```java

    enum Status {
        PENDING, PROCESSING, PROCESSED
    }

    public static void main(String[] args) {
        Status status = Status.PROCESSED;

        switch (status) {
            default:
                System.out.println("Return default");
                // break;
            case PENDING:
                System.out.println("Return PENDING");   //由于default没有break，会执行本行代码
                break;
            case PROCESSING:
                System.out.println("Return PROCESSING");
                break;
        }
    }

```

![switch](/note/pic/lesson12/lesson12_01.png)



## 常用数据类型

`int`
`string`:相当于一组`char`的集合
`byte`
`char`:使用单引号，如果是双引号，则默认是 string 类型
