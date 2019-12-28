package chapter8.e8_4;

public class GenericInterfaceImpl2 implements GenericInterface<String> {

    @Override
    public void print(String s) {
        System.out.println(s);
    }
}
