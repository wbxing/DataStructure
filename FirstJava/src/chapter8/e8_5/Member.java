package chapter8.e8_5;

public class Member {
    private String name;
    private int age;
    private Sex sex;

    public Member(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Age: " + this.age + ", Sex: " + this.sex;
    }
}
