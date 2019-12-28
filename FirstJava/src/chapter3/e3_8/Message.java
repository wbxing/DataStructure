package chapter3.e3_8;

public class Message {
    private int num = 10;
    private String info = "null";

    public Message() {}

    public Message(String info) {
        this.info = info;
    }

    public Message(int num) {
        this.num = num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}
