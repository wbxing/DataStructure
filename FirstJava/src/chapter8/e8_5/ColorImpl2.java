package chapter8.e8_5;

public enum ColorImpl2 implements IMessage {
    RED ("red") {
        public String getTitle() {
            return this + "-red";
        }
    },
    GREEN ("green") {
        public String getTitle() {
            return this + "-green";
        }
    },
    BLUE ("blue") {
        public String getTitle() {
            return this + "-blue";
        }
    };

    private String title;

    private ColorImpl2(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return this.title;
    }
}
