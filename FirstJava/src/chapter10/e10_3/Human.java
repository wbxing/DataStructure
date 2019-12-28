package chapter10.e10_3;

public class Human {
    public Human() {
        System.out.println("一个孩子诞生了");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("活了100年");
        throw new Exception("没有意义的异常抛出");
    }
}
