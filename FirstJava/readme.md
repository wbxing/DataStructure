# FirstJava
## 第一行代码 Java

### Java 学习资料
- [阿里云大学](https://edu.aliyun.com/)
- 阿里云大学 - [Java学习路线](https://edu.aliyun.com/roadmap/java?spm=5176.13345299.1392477.3.7f01f153PfIXqQ)

### 环境依赖：
- IDE: [Intellij IDEA](https://www.jetbrains.com/idea/)
- JDK: [jdk 1.8](https://www.oracle.com/technetwork/java/javase/downloads/index.html)
- MySQL: [8.0.17](https://www.mysql.com/downloads/)

### 目录结构
- `src/` : code
- `lib/` : library
- `test/`: files


### 主要内容：

#### 全书共计四个部分，共15个章节

- 第一部分 Java 基础知识
  - 第1章 Java 简介
    - e1_1/Hello: 永远的 Hello World
    - problem/ : 课后习题答案
    
  - 第2章 程序基本概念
    - e2_1/TestDemo: 2.1 - 2.4
    - e2_2/你好： 汉语类名
    > JDK支持中文类名以及变量名，但是不推荐使用中文编程           
    - e2_3/Logic ：逻辑分支
    - e2_3/Table : 乘法口诀表
    - e2_3/LoopControl : 循环控制
    - problem/ : 课后习题
    - e2_4/Method : 方法
    
- 第二部分 面向对象
        
  - 第3章 面向对象基本概念
    - e3_1/Book : 定义类；对象比较
    - e3_2/NewBook : 封装和构造方法
    - e3_3/Construction : 构造方法的重载
    - e3_4/Emp : 简单 Java 类
    - e3_5/Array : 数组操作
    - e3_6/StringDemo : 字符串操作方法
    - e3_6/Info : 字符串
    - e3_7/ThisKey : `this` 关键字的使用
    - e3_7/NewEmp : `this` 调用构造
    - e3_8/Message : 引用传递
    - e3_9/MemberAndCar/ : 人和车的映射关系
    - e3_9/Computer : 合成设计模式的简单例子
    - e3_9/EmpAndDept/ : 雇员-部门 映射关系（一对多）
    - e3_9/ProvinceAndCity : 省份-城市 一对多关系映射
    - e3_9/ISP/ : 类型-子类型-商品 双向一对多关系映射
    - e3_10/AdminAndAction/ : 管理员-权限 多对多关系映射
    - e3_11/StaticKey : `static` 关键字
    - e3_12/Outer : 内部类
    - e3_12/Inner2 : 定义在方法外的**内部类**
    - e3_13/SampleLink/ : 简单链表的实现
    - e3_13/LinkedList/ : 链表的实际应用
    - problem/ : 课后习题
    - test/ : 测试类
    
  - 第4章 面向对象高级知识
    - e4_1/Person : 父类
    - e4_1/Student : 子类
    - e4_2/A : 父类，`final` 关键字
    - e4_2/B : 子类，`super()`，覆写
    - e4_2/C : 多重继承子类
    - e4_3/Array : 数组父类
    - e4_3/SortArray : 数组排序类
    - e4_3/ReverseArray : 数组反转类
    - e4_4/Polymorphism : 父类，多态性
    - e4_4/ExtendsPoly ： 子类 1
    - e4_4/NewExtends ： 子类 2
    - e4_5/AbstractClass : 抽象类，内部抽象类
    - e4_5/ExtendsAbstractClass : 抽象类的子类，内部抽象类的子类
    - e4_5/Must : 抽象类必须被继承
    - e4_5/ExtendsStaticInnerAbstractClass : 静态内部抽象类的子类
    - e4_5/Template/ : 模板设计模式 - 实例
    - e4_6/ClassA : 实现`InterfaceA` 和 `InterfaceB`
    - e4_6/ClassB : 继承抽象类并实现接口
    - e4_6/ClassC : 接口的继承
    - e4_6/ClassD : 接口的内部抽象类
    - e4_6/ClassE : `static` 内部接口
    - e4_6/Application/Normal : 接口的实际应用 - 标准
    - e4_6/Application/Factory : 接口的实际应用 - 工厂设计模式
    - e4_6/Application/Proxy : 接口的实际应用 - 代理设计模式
    - e4_7/ObjectDemo : `Object` 类
    - e4_7/InterfaceObject : `Object` 类接收接口对象
    - e4_8/ : 宠物商店
    - e4_9/ : 匿名内部类
    - e4_10/ : 基本数据类型的包装类
    - problem/ : 课后习题
    - test/ : 测试类
    
  - 第5章 包及访问控制权限
    - e5_1/ : 包操作
    - e5_2/ : 访问控制权限: `protected`
    - e5_3/ : 单例设计模式
    - e5_4/ : 多例设计模式
    - problem/ : 课后习题
    - test/ : 测试类
    
  - 第6章 异常的捕获与处理
    - e6_1/ : 简答处理异常
    - e6_2/ : 异常处理流程
    - e6_3/ : `throws` 关键字
    - e6_4/ : `throw` 关键字
    - e6_5/ : 异常处理的标准格式
    - e6_6/ : `RuntimeException`
    - e6_7/ : `assert` 关键字
    - e6_8/ : 自定义异常
    - problem/ : 课后习题
    - test/ : 测试类
    
  - 第7章 Eclipse 的使用
    - e7_1/ : `JUnit` 的使用
    - test/ : 测试类
    
  - 第8章 Java 新特性
    - e8_1/ : 可变参数
    - e8_2/ : `foreach`
    - e8_3/ : 静态导入
    - e8_4/ : 泛型
    - e8_5/ : 枚举
    - e8_6/ : `Annotation`
    - e8_7/ : 接口定义加强
    - e8_8/ : `Lambda` 表达式
    - e8_9/ : 方法引用
    - e8_10/ : 内建函数式接口
    - problem/ : 课后习题
    - test/ : 测试类
    
- 第三部分 Java 高级编程

  - 第9章 多线程
    - e9_1/ : 实现多线程的两种方法
    - e9_2/ : 两中多线程方法的区别
    - e9_3/ : `Callable` 接口实现多线程
    - e9_4/ : 线程相关操作
    - e9_5/ : 线程同步与死锁
    - e9_6/ : 生产者 - 消费者问题
    - e9_7/ : 线程终止
    - problem/ : 课后习题
    - test/ : 测试类
    
  - 第10章 Java 常用类库
    - e10_1/ : `StringBuffer` 类
    - e10_2/ : `Runtime` 类
    - e10_3/ : `System` 类: 对象回收
    - e10_4/ : 对象克隆
    - e10_5/ : 数字操作类
    - e10_6/ : 日期处理类
    - e10_7/ : 比较器
    - e10_8/ : 正则表达式
    - e10_9/ : 反射机制
    - e10_10/ : 国际化
    - problem/ : 课后习题
    - test/ : 测试类

  - 第11章 Java IO 编程
  
    - e11_1/ : 文件操作类 `File`
    - e11_2/ : 字节流与字符流
    - e11_3/ : 转换流
    - e11_4/ : 文件复制
    - e11_5/ : 字符编码
    - e11_6/ : 内存流
    - e11_7/ : 打印流
    - e11_8/ : `System` 类对 IO 的支持
    - e11_9/ : 字符缓冲流
    - e11_10/ : 扫描流
    - e11_11/ : 对象序列化
    - problem/ : 课后习题
    
  - 第12章 Java 网络编程
  
    - e12_1/ : 第一个网络程序
    - e12_2/sample/ : 简单 Echo 网络程序
    - e12_2/update/ : 升级的 Echo 网络程序
    
  - 第13章 Java 类集框架
  
    - e13_1/ : `List` 接口：`ArrayList` 和 `Vector`
    - e13_2/ : `Set` 接口：`HashSet` 和 `TreeSet`
    - e13_3/ : `HashSet` 保存自定义对象
    - e13_4/ : 集合输出
    - e13_5/ : `Map` 接口
    - e13_6/ : 自定义 `Map` 的 key
    - e13_7/ : `Stack` 类
    - e13_8/ : `Properties` 类
    - e13_9/ : `Collections` 类
    - e13_10/ : `Stream` 类
    - e13_11/ : `MapReduce`
    - problem/ : 课后习题
  
  - 第14章 Java 数据库编程
    - e14_1 : 连接数据库，查询
    - e14_2 : `Statement` 接口
    - e14_3 : `PreparedStatement` 接口
    - e14_4 : 批处理与事务处理
    
- 第四部分 设计开发
  - 第15章 DAO 设计模式
    - dbc/ : 数据库连接类
    - vo/ : Value Object
    - dao/ : 数据层
    - factory/ : 工厂类
    - service/ : 业务层
    - test/ : 测试
    
  