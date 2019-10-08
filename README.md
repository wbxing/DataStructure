# DataStructure

## Java 的一些数据结构

### 数据结构

  数据结构是计算机存储、组织数据的方式，
  指相互之间存在一种或多种特定关系的数据元素的集合。
  通常情况下，精心选择的数据结构可以带来更高的运行或者存储效率。
  数据结构往往同高效的检索算法和索引技术有关。

#### 数据结构的基本功能
  
  - 添加某一数据项
  - 删除某一特定数据项
  - 查找某一特定数据项
  - 迭代访问各个数据项
  
#### 常用数据结构

  - 数组 Array
  - 链表 Linked List
  - 栈 Stack
  - 队列 Queue
  - 树 Tree
  - 哈希表 Hash Table
  - 堆 Heap
  - 图 Graph


### 数组

#### 数组的声明

  - 第一种方式：
  
    > 数据类型 []  数组名称 = new 数据类型[数组长度];
  
    这里 [] 可以放在数组名称的前面，
    也可以放在数组名称的后面，
    我们推荐放在数组名称的前面，
    这样看上去 数据类型 [] 表示的很明显是一个数组类型，
    而放在数组名称后面，则不是那么直观。  
  
  - 第二种方式
  
    > 数据类型 [] 数组名称 = {数组元素1，数组元素2，......};
    
    这种方式声明数组的同时直接给定了数组的元素，
    数组的大小由给定的数组元素个数决定。
               
   ```java
   // 声明数组1,声明一个长度为3，只能存放int类型的数据
   int [] myArray = new int[3];
   // 声明数组2,声明一个数组元素为 1,2,3的int类型数组
   int [] myArray2 = {1,2,3};
   ``` 
    
#### 访问数组元素以及给数组元素赋值
      
  数组是存在下标索引的，
  通过下标可以获取指定位置的元素，
  数组下标是从0开始的，
  也就是说下标0对应的就是数组中第1个元素，
  可以很方便的对数组中的元素进行存取操作。
    
  前面数组的声明第二种方式，
  我们在声明数组的同时，
  也进行了初始化赋值。

   ```java
   // 声明数组,声明一个长度为3，只能存放int类型的数据
   int [] myArray = new int[3];
   // 给myArray第一个元素赋值1
   myArray[0] = 1;
   // 访问myArray的第一个元素
   System.out.println(myArray[0]);
   ```

#### 数组遍历
   
  数组有个 length 属性，
  是记录数组的长度的，
  我们可以利用length属性来遍历数组。
  
```java
// 声明数组2,声明一个数组元素为 1,2,3的int类型数组
int [] myArray2 = {1,2,3};
for(int i = 0 ; i < myArray2.length ; i++){
    System.out.println(myArray2[i]);
}
```


### 链表

#### 普通链表

链表通常由一连串节点组成，
每个节点包含任意的实例数据 (data fields)
和一个或两个用来指向上一个或下一个节点的位置的链接 ("links")

链表 (Linked list) 是一种常见的基础数据结构，
是一种线性表，但是并不会按线性的顺序存储数据，
而是在每一个节点里存到下一个节点的指针 (Pointer) 。

使用链表结构可以克服数组链表需要预先知道数据大小的缺点，
链表结构可以充分利用计算机内存空间，实现灵活的内存动态管理。
但是链表失去了数组随机读取的优点，同时链表由于增加了结点的指针域，空间开销比较大。

#### 单向链表

单链表是链表中结构最简单的。
一个单链表的节点 (Node) 分为两个部分，
第一个部分 (data) 保存或者显示关于节点的信息，
另一个部分存储下一个节点的地址。
最后一个节点存储地址的部分指向空值。

单向链表只可向一个方向遍历，
一般查找一个节点的时候需要从第一个节点开始每次访问下一个节点，
一直访问到需要的位置。
而插入一个节点，对于单向链表，我们只提供在链表头插入，
只需要将当前插入的节点设置为头节点， next 指向原头节点即可。
删除一个节点，我们将该节点的上一个节点的 next 指向该节点的下一个节点。

#### 双端链表

单项链表存在很多缺陷，比如如果想在尾部添加一个节点，
那么必须从头部一直遍历到尾部，找到尾节点，然后在尾节点后面插入一个节点。
这样的操作很麻烦，但是如果在设计链表的时候多个对尾节点的引用，
这样在尾部添加节点就会简单很多，这样就形成了双端链表。

#### 有序链表

前面的链表实现插入数据都是无序的，在有些应用中需要链表中的数据有序，这称为有序链表。

#### 双向链表

在单向链表的基础上，为每一个节点增加指向前一个节点位置的连接，
这样就形成了双向链表，双向链表可以从两个方向进行遍历。


### 栈

栈，又称为堆栈或堆叠，
是一种只能在一端进行插入和删除操作的数据结构。
栈按照先进后出的原则存储数据，先进入的数据被压入栈底，最后的数据在栈顶，
需要读数据的时候从栈顶开始弹出数据（最后一个数据被第一个读出来）。
栈具有记忆作用，对栈的插入与删除操作中，不需要改变栈底指针。

允许进行插入和删除操作的一端称为栈顶(top)，另一端为栈底(bottom)；
栈底固定，而栈顶浮动；
栈中元素个数为零时称为空栈。
由于数据的操作只允许在栈的一端进行，因而按照后进先出的原理运作。
所以栈也被称为后进先出表。

栈有很多应用，常见的有“实现现字符串逆序”、“前序、中序和后序表达式的转换”以及“括号匹配”。

### 队列

队列是一种先进先出的数据结构

#### 单向队列

入队的一端称为队尾 (rear)，
出队的一端称为队头 (front)。

#### 双端队列

双端队列就是一个两端都是结尾或者开头的队列，
队列的每一端都可以进行插入数据项和移除数据。

#### 优先队列

优先队列 (priority queue) 是比栈和队列更专用的数据结构，
在优先队列中，数据项按照关键字进行排序，
关键字最小（或者最大）的数据项往往在队列的最前面，
而数据项在插入的时候都会插入到合适的位置以确保队列的有序。

