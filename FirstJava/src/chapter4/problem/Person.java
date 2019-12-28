package chapter4.problem;

/**
 * Person中包含4个保护型的数据成员name、address、sex、age
 * 分别为字符串，字符串，字符及整型。
 * 表示：姓名、地址、性别和年龄。
 * 一个四参构造方法，
 * 一个无参构造方法，
 * 一个输出方法用于显示四种属性。
 */
public class Person {
    private String name;
    private String address;
    private char sex;
    private int age;

    public Person() {
    }

    public Person(String name, String address, char sex, int age) {
        this.name = name;
        this.address = address;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
