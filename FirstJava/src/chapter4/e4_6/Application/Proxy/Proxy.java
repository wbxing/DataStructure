package chapter4.e4_6.Application.Proxy;

public class Proxy implements Network {
    private Network network;

    public Proxy(Network network) {
        this.network = network;
    }

    public void check() {
        System.out.println("检查操作是否合法");
    }

    public void browse() {
        // 调用与具体业务相关的工作
        this.check();
        // 调用真实操作
        this.network.browse();
    }
}
