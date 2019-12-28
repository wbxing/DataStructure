package chapter4.e4_6;

public class ClassD implements InterfaceD {
    public void funD() {
        System.out.println("InterfaceD中的抽象方法");
    }
    //可以选择性的继承
    class ExtendClass extends AbstractClassD {
        public void classFunD() {
            System.out.println("AbstractClassD中的抽象方法");
        }
    }
}
