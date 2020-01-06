# CustomerManagement
客户信息管理软件

[Customer](./src/com/cm/bean/Customer.java)

Customer为实体对象，用来封装客户信息

[CustomerView](./src/com/cm/view/CustomerView.java)

CustomerView为主模块，负责菜单的显示和处理用户操作

[CustomerList](./src/com/cm/service/CustomerList.java)

CustomerList为Customer对象的管理模块，内部用数组管理一组Customer对象，并提供相应的添加、修改、删除和遍历方法，供CustomerView调用

[CMUtility](./src/com/cm/util/CMUtility.java)

CMUtility是工具类，提供从键盘输入的一系列操作
