package chapter8.e8_4;

public class GenericInterfaceImpl1<S> implements GenericInterface<S> {

    @Override
    public void print(S s) {
        System.out.println(s);
    }
}
