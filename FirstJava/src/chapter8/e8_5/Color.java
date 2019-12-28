package chapter8.e8_5;

public enum Color {
    RED ("red"), GREEN ("green"), BLUE ("blue");
    private String title;

    private Color(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return this.title;
    }

}
