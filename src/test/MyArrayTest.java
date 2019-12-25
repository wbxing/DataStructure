import data.structure.array.MyArray;

public class MyArrayTest {
    public static void main(String[] args) {
        // 定义数组
        MyArray myArray = new MyArray(4);

        // 添加元素
        myArray.add(1);
        myArray.add(2);
        myArray.add(3);
        myArray.add(4);

        // 显示所有元素
        myArray.display();

        // 查找下标为 0 的元素
        int num = myArray.get(0);
        System.out.println(num);

        // 删除值为 4 的元素
        myArray.delete(4);

        // 将 3 修改为 33
        myArray.modify(3, 33);
        myArray.display();
    }
}
