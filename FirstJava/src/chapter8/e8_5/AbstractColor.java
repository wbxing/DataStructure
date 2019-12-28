package chapter8.e8_5;

public enum AbstractColor {
    RED("red") {
        public String getTitle () {
            return this + "-red";
        }
    },

    GREEN("green") {
        public String getTitle () {
            return this + "-green";
        }
    },

    BLUE("blue") {
        public String getTitle () {
            return this + "-blue";
        }
    };

    private String title;

    private AbstractColor(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return this.title;
    }

    // 定义抽象方法，枚举时覆写
    public abstract String getTitle();
}
