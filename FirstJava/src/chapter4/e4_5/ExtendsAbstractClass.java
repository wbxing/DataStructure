package chapter4.e4_5;

public class ExtendsAbstractClass extends AbstractClass {
    private int num;
    public ExtendsAbstractClass() {}
    public ExtendsAbstractClass(int num) {
        this.num = num;
    }


    public void print() {
        System.out.println("num = " + num);
    }
    // 定义内部抽象类的子类，不是必须编写
    class ExtendInnerAbstract extends InnerAbstract {
        public void print() {}
    }
}
