package chapter8.e8_8;

public interface Interface {
    //int add(int x, int y);

    int add(int ... args);

    static int sum(int ... args) {
        int sum = 0;
        for (int i : args) {
            sum += i;
        }
        return sum;
    }
}
