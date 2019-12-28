package chapter8.e8_5;

public enum ColorImpl1 implements IMessage {
    RED ("red"), GREEN ("green"), BLUE ("blue");
    private String title;

    private ColorImpl1(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return this.title;
    }

    @Override
    public String getTitle() {
        return this.title;
    }
}
