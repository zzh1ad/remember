# java基础知识

## 基本数据类型

java中包括八种基本数据类型：

**byte  short  int  long  float  double  char  boolean**

每种基本数据类型都有对应的包装类：

**Byte  Short  Integer  Long  Float  Double  Character  Boolean**

在 Thinking in Java 第4版 中 **void** 也被认为是一种基本数据类型原因可能是 void 有包装类 **Void**

## 继承

### 调用子类构造方法时调用过程

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
然后从父类到子类依次加载非 static 域的代码和构造方法。
