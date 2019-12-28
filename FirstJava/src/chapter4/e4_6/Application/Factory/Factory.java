package chapter4.e4_6.Application.Factory;

public class Factory {
    /**
     * 取得特定类型的接口对象
     * @param className 要取得的对象标记
     * @return 相应的接口对象
     */
    public static Fruit getInstance(String className) {
        if ("apple".equals(className)) {
            return new Apple();
        } else if ("orange".equals(className)) {
            return new Orange();
        } else {
            return null;
        }
    }
}
