package chapter4.e4_3;

public class ReverseArray extends Array {
    public ReverseArray(int len) {
        super(len);
    }
    public int [] getData() {
        int center = super.getData().length / 2;
        int head = 0;
        int tail = super.getData().length - 1;
        for (int i = 0; i < center; ++i) {
            int temp = super.getData()[tail];
            super.getData()[tail] = super.getData()[head];
            super.getData()[head] = temp;
            tail --;
            head ++;
        }
        return super.getData();
    }
}
