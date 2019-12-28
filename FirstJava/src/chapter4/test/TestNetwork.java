package chapter4.test;

import chapter4.e4_6.Application.Proxy.Network;
import chapter4.e4_6.Application.Proxy.Proxy;
import chapter4.e4_6.Application.Proxy.Real;

public class TestNetwork {
    public static void main(String[] args) {
        Network net = null;
        net = new Proxy(new Real());
        net.browse();
    }
}
