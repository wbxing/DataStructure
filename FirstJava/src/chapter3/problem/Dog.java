package chapter3.problem;

/**
 * 设计一个Dog类
 * 有名字、颜色、年龄等属性
 * 定义构造方法来初始化类的这些属性
 * 定义方法输出Dog信息。
 * 编写应用程序使用Dog类。
 */
public class Dog {
    private String name ;
    private String color ;
    private int age ;

    public Dog() {}

    public Dog(String name, String color, int age) {
        super();
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "狗的名字：" + this.name + "，狗的颜色：" + this.color + "，狗的年龄：" + this.age ;
    }
}
