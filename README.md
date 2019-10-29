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

一般提供四种方法：
> insertLeft()\
> insertRight()\
> removeLeft()\
> removeRight()

如果限制只使用 insertLeft() 和 removeLeft()，那么队列就变成了栈；
如果限制只使用 insertLeft() 和 removeRight()，那么就是普通队列。

#### 优先队列

优先队列 (priority queue) 是比栈和队列更专用的数据结构，
在优先队列中，数据项按照关键字进行排序，
关键字最小（或者最大）的数据项往往在队列的最前面，
而数据项在插入的时候都会插入到合适的位置以确保队列的有序。


### 递归

严格来讲递归不算是一种数据结构，而属于一种算法。
递归，就是在运行的过程中调用自己。
递归必须要有三个要素：
1. 边界条件
1. 递归前进段
1. 递归返回段

当边界条件不满足时，递归前进；当边界条件满足时，递归返回。

#### 递归的应用

- 求阶乘

  ```java
  /**
   * 0！=1  1！=1
   * 负数没有阶乘,如果输入负数返回-1
   * @param n 表示求 n 的阶乘
   * @return
   */
  public static int getFactorial(int n){
      if(n >= 0){
          if(n==0){
              System.out.println(n+"!=1");
              return 1;
          }else{
              System.out.println(n);
              int temp = n*getFactorial(n-1);
              System.out.println(n+"!="+temp);
              return temp;
          }
      }
      return -1;
  }
  ```

- 二分查找

  ```java
  public static int search(int[] array,int key,int low,int high){
      int mid = (high-low)/2+low;
      if(key == array[mid]){
          //查找值等于当前值，返回数组下标
          return mid;
      }else if(low > high){
          //找不到查找值，返回-1
          return -1;
      }else{
          if(key < array[mid]){
              //查找值比当前值小
              return search(array,key,low,mid-1);
          }
          if(key > array[mid]){
              //查找值比当前值大
              return search(array,key,mid+1,high);
          }
      }
      return -1;
  }
  ```

- 汉诺塔问题

  ```java
  /**
   * 汉诺塔问题
   * @param dish 盘子个数(也表示名称)
   * @param from 初始塔座
   * @param temp 中介塔座
   * @param to   目标塔座
   */
  public static void move(int dish,String from,String temp,String to){
      if(dish == 1){
          System.out.println("将盘子"+dish+"从塔座"+from+"移动到目标塔座"+to);
      }else{
          //A为初始塔座，B为目标塔座，C为中介塔座
          move(dish-1,from,to,temp);
          System.out.println("将盘子"+dish+"从塔座"+from+"移动到目标塔座"+to);
          //B为初始塔座，C为目标塔座，A为中介塔座
          move(dish-1,temp,from,to);
      }
  }
  ```

- 归并排序

  ```java
  public static int[] mergeSort(int[] c,int start,int last){
      if(last > start){
          //也可以是(start+last)/2，这样写是为了防止数组长度很大造成两者相加超过int范围，导致溢出
          int mid = start + (last - start)/2;
          mergeSort(c,start,mid);//左边数组排序
          mergeSort(c,mid+1,last);//右边数组排序
          merge(c,start,mid,last);//合并左右数组
      }
      return c;
  }
  ```

#### 消除递归

一个算法作为一个递归的方法通常通概念上很容易理解，
但是递归的使用在方法的调用和返回都会有额外的开销，
通常情况下，用递归能实现的，用循环都可以实现，
而且循环的效率会更高，
所以在实际应用中，
把递归的算法转换为非递归的算法是非常有用的。
这种转换通常会使用到栈。

#### 递归和栈

递归和栈有这紧密的联系，
而且大多数编译器都是用栈来实现递归的，
当调用一个方法时，
编译器会把这个方法的所有参数和返回地址都压入栈中，
然后把控制转移给这个方法。
当这个方法返回时，这些值弹栈。
参数消失了，并且控制权重新回到返回地址处。

调用一个方法时所发生的事：
1. 当一个方法被调用时，它的参数和返回地址被压入一个栈中；
1. 这个方法可以通过获取栈顶元素的值来访问它的参数；
1. 当这个方法要返回时，它查看栈以获得返回地址，
然后这个地址以及方法的所有参数退栈，并且销毁。


### 树

树（tree）是一种抽象数据类型（ADT），
用来模拟具有树状结构性质的数据集合。
它是由n (n>0) 个有限节点通过连接它们的边组成一个具有层次关系的集合。
把它叫做 “树” 是因为它看起来像一棵倒挂的树，
也就是说它是根朝上，而叶朝下的。

#### 树的组成

- 节点

  - 节点一般代表一些实体。
  - 在java面向对象编程中，节点一般代表对象。

- 边

  - 连接节点的线称为边，边表示节点的关联关系。
  - 一般从一个节点到另一个节点的唯一方法就是沿着一条顺着有边的道路前进。
  - 在Java当中通常表示引用。
  

#### 树的常用术语

- 路径：
顺着节点的边从一个节点走到另一个节点，
所经过的节点的顺序排列就称为“路径”。

- 根节点：
树顶端的节点称为根。
一棵树只有一个根，如果要把一个节点和边的集合称为树，
那么从根到其他任何一个节点都必须有且只有一条路径。

- 父节点：
若一个节点含有子节点，则这个节点称为其子节点的父节点。

- 子节点：
一个节点含有的子树的根节点称为该节点的子节点。

- 兄弟节点：
具有相同父节点的节点互称为兄弟节点。

- 叶节点：
没有子节点的节点称为叶节点，也叫叶子节点。

- 子树：
每个节点都可以作为子树的根，
它和它所有的子节点、子节点的子节点等都包含在子树中。

- 节点的层次：
从根开始定义，根为第一层，根的子节点为第二层，以此类推。

- 深度：
对于任意节点n,n的深度为从根到n的唯一路径长。
根的深度为0。

- 高度：
对于任意节点 n，
n 的高度为从 n 到一片树叶的最长路径长。
所有树叶的高度为 0。

#### 二叉树

树的每个节点最多只能有两个子节点，
并且二叉树的子节点称为 “左子节点” 和 “右子节点”。

#### 二叉搜索树

二叉搜索树要求：
若它的左子树不空，则左子树上所有结点的值均小于它的根结点的值；
若它的右子树不空，则右子树上所有结点的值均大于它的根结点的值；
它的左、右子树也分别为二叉搜索树。

#### 哈夫曼树

哈夫曼树又叫最优二叉树，
其通过某种规则（权值）来构造出一种特殊的二叉树，
在这个二叉树中只有叶子节点才是有效的数据节点，
其他的非叶子节点是为了构造出哈夫曼编码而引入的。

哈夫曼编码是一个通过哈夫曼树进行的一种编码，
一般情况下，以字符：‘0’与‘1’表示。
编码的实现过程很简单：只要实现哈夫曼树，
通过遍历哈夫曼树，
规定向左子树遍历一个节点编码为“0”，
向右遍历一个节点编码为“1”，
结束条件就是遍历到叶子节点。
这样就可以得到对应于叶子节点上数据的哈夫曼编码。


### 2-3-4 树

在二叉树中，每一个节点只有一个数据，最多两个子节点。
如果允许每一个节点有更多的数据项和子节点，那么就产生了多叉树。

2-3-4 树就是一种多叉树，它的每一个节点最多有3个数据项和4个子节点。
这种树的名字中 2, 3, 4 的数字含义是指一个节点可能含有的子节点的个数。
它的非叶子节点有三种情况：

- 有 1 个数据项的节点总有 2 个子节点
- 有 2 个数据项的节点总有 3 个子节点
- 有 3 个数据项的节点总有 4 个子节点

简而言之，非叶节点的子节点数总是比它含有的数据项多1。
也就是说如果子节点个数为L，数据项个数为D，那么：L = D + 1

叶子节点是没有子节点的，但是它却含有 1-3 个数据项。
空节点是不存在的。

树结构中最重要的一点就是节点之间的数据项之间大小的关系。
二叉树中，所有关键字比某一节点下的，都在这个节点的左子树上，否则，在这个节点的右子树上。
2-3-4 树就是建立在在二叉树的基础上，其子树上所有的节点均处于根节点两个关键字之间。

如图所示：

![2-3-4 Tree] [2-3-4_Tree.png]


#### 搜索 2-3-4 树


### 红黑树

#### 红黑树的特征

#### 红黑树的自我修正

#### 红黑树插入

#### 红黑树的删除

#### 2-3-4树和红黑树


### 排序

#### 希尔排序 

#### 快速排序



[2-3-4_tree.png]:data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAA4oAAAFSCAYAAAC0fyGTAAAAAXNSR0IArs4c6QAAAARnQU1BAACxjwv8YQUAAAAJcEhZcwAADsMAAA7DAcdvqGQAAF4rSURBVHhe7d0HvBTV+f/xY8GKIWBvqKiAgl0CKIoFETuCgkpiAwULRsW/AdEfNkSNYo+CAtGIFXuMiqBiUMQaLBggYhRNBBUCsSSamP/9Hua5zh1m9+7eu2V29vN+vebu7pnZ2bm7c2bmmdNW+l8NBwAAAABAYOXgEQAAAAAAj0ARAAAAAFAHgSIAAAAAoA4CRQAAAABAHQSKAAAAAIA6CBQBAAAAAHUQKAIAAAAA6iBQBAAAAADUQaAIAAAAAKiDQBEAAAAAUAeBIgAAAACgDgJFAAAAAEAdBIoAAAAAgDoIFAEAAAAAdRAoAgAAAADqIFAEAAAAANRBoAgAAAAAqINAEQAAAABQB4EiAAAAAKAOAkUAAAAAQB0EigAAAACAOggUAQAAAAB1rPS/GsFzAECOli1b5j788EM3f/78Oo9LlixxX331lfv666/9ZM8BJNNqq63m1l577TpT06ZN3SabbOJatWrlttpqKz/ZcwCoFgSKAJCDP/3pT+6VV16pnebMmRPMAVAtmjRp4jp16uQ6duxY+7jZZpsFcwEgXQgUASDGwoUL3eOPP+6eeOIJN23aNF+CGLbmmmv6EgYrZbDn66+/fmzpRFqttNJK/pFTSTpVw+/73Xff1dYACE8fffTRCjUGFixYELzrR8r33bt3d4cddpg7+OCDg1QAqHwEigAQ0IWgBYdTp04NUpfbZpttfAmCTbvttlswp7oRKKYbv29dqlquGgUzZ86sffzHP/4RzHWuWbNmPmA89NBDXa9evXwJJABUKgJFAFXv6aefduPGjXOTJk0KUpbTBZ+mQw45xLdXwooIJNKN37d+b775pr+5pOmNN94IUpcHjSeffLKf2rdvH6QCQOUgUARQlb755hsfHGqaNWtWkOpcnz593OGHH+6nddZZJ0hFJgQS6cbvm5+5c+fWBo2qsm5UJVUBY+/evYMUAEg+AkUAVefqq692V111lVu8eLF/veWWW7r+/fv7aeONN/ZpyA2BRLrx+zbcq6++6saPH++n77//3qftvPPO7le/+pU75phj/GsASDICRQBV47bbbnNXXnml76RC1AGF7vL37dvXv0b+CCTSjd+38ZYuXeqDxTvuuMPNnj3bp3Xp0sUHjGrLCABJRaAIIPWefPJJN2zYMPfOO+/413vuuae/SFP7QzQOgUS68fsW1m9+8xtfm+Hjjz/2r3v06OGuueYa165dO/8aAJKEQBFAqg0fPtxdccUV/vkOO+zgA8R+/fr512g8Aol04/ctjnD191VXXdXdcsst7tRTTw3mAkAyECgCSCVV8TrjjDPcCy+84F9fcskl7v/+7//8cxQOgUS68fsWzxdffOHOP/98N2HCBP/6+OOPdzfffDOdaAFIDAJFAKmjnkxPP/10P5B269at/d36bt26BXNRSAQS6cbvW3xqv6ibWv/617/84P06XqlKKgCU28rBIwBUPF1oqefSAQMG+CDxxBNPdG+99RZBIoDEUodaf/rTn9z+++/v5s+f7w466CB34YUXBnMBoHwIFAGkwnPPPed22WUXf3debX7GjBnjq3SttdZawRIAkExt2rRxU6ZMcSNGjPCvR44c6fbdd9/aXlIBoByoegqg4qlTiKFDh/rne++9t6+61b59e/8axUXVxHTj9y29Z5991p155pl+8P4mTZr4YTXUfhEASo0SRQAV7dJLL60NEtWj6bRp0wgSAVSsAw44wFeZP+mkk/xA/SeccIKvIQEApUagCKBiaegLq6o1duxYP5g+AFQ6VZlXNXr11iyDBg1yN9xwg38OAKVC1VMAFWnIkCFu9OjR/vmdd95J1awyoWpiuvH7lt+vf/1rP4yGjBo1qrYGBQAUG4EigIqj8RAvu+wy//y+++5zffv29c9RegQS6cbvmww33XSTO+uss/zzG2+80Q0ePNg/B4BiIlAEUFFUxXTgwIH++cMPP+yOPPJI/xzlQSCRbvy+yaF2iqqCKpMmTXK9e/f2zwGgWGijCKBi/OEPf6gNEnVXnSARQLXQsU+1KeS4445zr7zyin8OAMVCiSKAivD222/7oS+WLl3q2+toSAyUHyVO6cbvmzwDBgxw48aNc1tuuaXv5blly5bBHAAoLAJFABVhr732ctOnT/d30idOnBikotwIJNKN3zeZDj74YPfUU0+5ww47zD3++ONBKgAUFlVPASTeRRdd5IPEtm3bugkTJgSpAFCdNHTGhhtu6J544gl37bXXBqkAUFiUKAJItKlTp7pu3br5588884zr3r27f45koMQp3fh9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79twr776qg8QNX3//fc+beedd/YB4jHHHONfA0CSESgCqEoaNkO9o2qaNWtWkOpcnz593OGHH+4n2gvVj0Ai3fh986POs5544gk/TZs2LUh17uCDD/a1F3r37h2kAEDyESgCqHpPP/20DxgnTZoUpCynNoyaDjnkELfJJpsEqQgjkEg3ft/6vfnmm7XB4RtvvBGkOtesWTMfHGpq3759kAoAlYNAEQACH374oXv88cf9Bd/UqVOD1OW22WYb16lTp9ppt912C+ZUNwKJdOP3rWvJkiXulVdecTNnzqx9/Mc//hHMXR4c6uaS2h726tXLNWnSJJgDAJWHQBEAYixcuLA2aFQVsmXLlgVzlltzzTX94NhbbbWVf7Rp/fXXd2uvvXadqWnTpsG70odAIt2q4ff97rvv3Ndff73CpE6v5s+f728gadLzBQsWBO/6kfK9OsZScKjaBwCQFgSKAJADDYStEgSb5syZE8wBUC1UQqgaBR07dqx93GyzzYK5AJAuBIoA0AAqYbRShvCjqqZ99dVXtaUS//znP33HOQCSaZVVVvEB4LrrrutL/60WgNolW60BqzmgRwCoFgSKAFAkL7zwgjvnnHPcT3/6U3fdddf5rvHT6KSTTnJbbLGFu/jii4MUpNHAgQPd5ptv7i688MIgJR0+//xzN3z4cPfoo4/6x1/+8pfBHACobgSKAFBgChBvuOEG99e//tWNGDHC9ezZM5iTPurIY5dddnFvvfWWD4iRXurd84gjjohtp5cGr732mhs5cqT7y1/+4gPGY489NpgDANVp5eARANBICppUgqgStq5du7rnn38+1UGiXH/99W6fffYhSKwCu+66q9thhx3cnXfeGaSkS4cOHXyp4lVXXeVuvvlmt++++7opU6YEcwGg+hAoAkAjWYCokjVVwVTp2tlnn5364En/t4IGqupVD1U/HTNmTPAqndRz6UsvveROOOEEd9ppp7m+ffu6t99+O5gLANWDQBEAGkiB0m9/+1sfIKpXVJUgVkOAaFTFVu0u09r2EitS1VN10PTcc88FKel14oknunnz5vkxU/faay83ePBg9/e//z2YCwDpR6AIAA2gIElV01Si9sgjj/ggccsttwzmVge1w1SpC6pLNZQqhp1//vm+vfEaa6zh8/ill17q/vvf/wZzASC96MwGAPJQTR3VZKMS1COPPJJO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
