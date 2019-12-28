package chapter4.e4_3;

public class Array {
    private int [] data;
    private int foot = 0;

    public Array(int len) {
        if (len > 0) {
            this.data = new int[len];
        } else {
            this.data = new int[1];
        }
    }

    public boolean add(int num) {
        if (foot < this.data.length) {
            data[foot++] = num;
            return true;
        }
        return false;
    }

    public int[] getData() {
        return data;
    }
}
