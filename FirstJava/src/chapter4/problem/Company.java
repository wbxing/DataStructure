package chapter4.problem;

/**
 * 设计一个类Company，该类实现接口ClassName中的方法getClassName()，功能是获取该类的类名称。
 */
public class Company implements ClassName {
    private String className = "Company";

    public String getClassName() {
        return this.className;
    }
}
