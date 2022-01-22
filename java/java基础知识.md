---
date created: 2022-01-22 23:32
---

# java基础知识

## 目录

- 1.[语法](#1-语法)
  - 1.1 [基本数据类型](#11-基本数据类型)
  - 1.2 [控制流程](#12-控制流程)
- 2.[特性](#2-特性)
  - 2.1 [继承](#21-继承)

## 1 语法

### 1.1 基本数据类型

java中包括八种基本数据类型：

**byte  short  int  long  float  double  char  boolean**

每种基本数据类型都有对应的包装类：

**Byte  Short  Integer  Long  Float  Double  Character  Boolean**

在 Thinking in Java 第4版 中 **void** 也被认为是一种基本数据类型原因可能是 void 有包装类 **Void**

### 1.2 控制流程

控制流程的关键字包括 **if-else、while、do-while、for、return、break、continue、switch** java不支持 **goto** 关键字，但是 **goto** 关键字是保留字。

**if-else**

可以用来判断，**else** 为可选。

```java
if(a > 0){
  a++;
} else{
  a--;
}
```

**while**

**while** 用来控制循环。

```java
while(a > 0){
  a--;
}
```

**do-while**

**do-while** 用来控制循环，与 **while** 的区别在于 **do-while** 是先计算再判断。

```java
do{
  a--;
}while(a > 0);
```

**for**

**for** 用来控制循环，for(初始操作,判断条件,循环操作){执行体}

```flow
st=>start: 开始
r1=>operation: 初始操作
r2=>condition: 判断条件
r3=>operation: 循环操作
r4=>operation: 执行体
ed=>end: 结束
st->r1->r2
r3->r2
r4->r3
r2(yes)->r4
r2(no)->ed
```

## 2 特性

### 2.1 继承

#### 调用子类构造方法时调用过程

父类：

```java
public class Father {
    public Father(){
        System.out.println("hello  Father");
    }
    {
        System.out.println("it's Father");
    }
    static {
        System.out.println("static Father");
    }
}
```

子类：

```java
public class Son extends Father {
    public Son(){
        System.out.println("hello  Son");
    }
    {
        System.out.println("it's Son");
    }
    static {
        System.out.println("static Son");
    }
}
```

调用：

```java
public class Main {
    public static void main(String[] args) {
        Son son1 = new Son();
        System.out.println("------son2-------");
        Son son2 = new Son();
    }
}
```

运行结果：

```
static Father
static Son
it's Father
hello  Father
it's Son
hello  Son
------son2-------
it's Father
hello  Father
it's Son
hello  Son
```

第一次调用构造方法时会先加载 static 域内的代码从父类到子类进行加载。
然后从父类到子类依次加载非 static 域的代码和构造方法。第二次调用构造方法时不会加载 static 域的代码。

```flow
r1=>operation: 父类static
r2=>operation: 父类构造方法
r3=>operation: 子类static
r4=>operation: 子类构造方法
r1->r2->r3->r4
```
