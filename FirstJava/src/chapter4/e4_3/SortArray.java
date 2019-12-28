package chapter4.e4_3;

import java.util.Arrays;

public class SortArray extends Array {
    public SortArray(int len) {
        super(len);
    }

    public int [] getData() {
        Arrays.sort(super.getData());
        return super.getData();
    }
}
