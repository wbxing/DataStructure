package chapter4.e4_7;

import java.util.Objects;

public class ObjectDemo implements InterfaceObject {
    private String string;
    private int num;

    public ObjectDemo() {
    }

    public ObjectDemo(String string, int num) {
        this.string = string;
        this.num = num;
    }

    public void fun() {
        System.out.println("Hello World");
    }
    @Override
    public String toString() {
        return "ObjectDemo{" +
                "string='" + string + '\'' +
                ", num=" + num +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!(o instanceof ObjectDemo)) {
            return false;
        }
        ObjectDemo that = (ObjectDemo) o;
        return num == that.num &&
                Objects.equals(string, that.string);
    }

    public String getString() {
        return string;
    }

    public int getNum() {
        return num;
    }

    public void setString(String string) {
        this.string = string;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
