package chapter8.e8_5;

public enum Sex {
    MALE("man"), FEMALE("woman");
    private String title;
    private Sex(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return this.title;
    }
}
