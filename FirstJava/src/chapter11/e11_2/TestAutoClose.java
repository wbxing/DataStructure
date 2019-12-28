package chapter11.e11_2;

// 资源自动关闭

class Net implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("** 网络资源自动关闭，释放资源 **");
    }

    public void info() throws Exception {
        System.out.println("** 欢迎访问");
    }
}


public class TestAutoClose {
    public static void main(String[] args) {
        try (Net net = new Net()){
            net.info();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
