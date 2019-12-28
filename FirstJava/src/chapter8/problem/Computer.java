package chapter8.problem;

/**
 * 定义一个品牌电脑的枚举类，
 * 里面只有固定的几个电脑品牌，
 * 例如：Lenovo、HP、Dell、Apple、Acer。
 */
public enum Computer {
    LENOVO("联想"),
    HP("惠普"),
    DELL("戴尔"),
    APPLE("苹果"),
    ACER("宏基");
    private String title;

    private Computer(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return this.title;
    }
}