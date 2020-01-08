# CustomerManagement
客户信息管理软件

[Customer](./src/com/cm/bean/Customer.java)

`Customer` 为实体对象，用来封装客户信息

[CustomerView](./src/com/cm/view/CustomerView.java)

`CustomerView` 为主模块，负责菜单的显示和处理用户操作

实例化时会默认给 `CustomerList` 添加一条记录

[CustomerList](./src/com/cm/service/CustomerList.java)

`CustomerList` 为 `Customer` 对象的管理模块，内部用数组管理一组 `Customer` 对象，并提供相应的添加、修改、删除和遍历方法，供 `CustomerView` 调用

[CMUtility](./src/com/cm/util/CMUtility.java)

`CMUtility` 是工具类，提供从键盘输入的一系列操作
