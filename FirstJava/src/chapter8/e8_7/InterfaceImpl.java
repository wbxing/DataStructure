package chapter8.e8_7;

public class InterfaceImpl implements InterfacePlus {
    @Override
    public void print() {
        System.out.println("覆写接口中的抽象方法");
    }
}
