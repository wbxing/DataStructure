package chapter8.e8_6;

public class Annotation<T>  {
    private T title;

    // 准确的覆写
    @Override
    public String toString() {
        return super.toString();
    }

    // 声明过期操作
    @Deprecated
    public void fun() {
        System.out.println("Deprecated");
    }

    public T getTitle() {
        return title;
    }

    public void setTitle(T title) {
        this.title = title;
    }
}
