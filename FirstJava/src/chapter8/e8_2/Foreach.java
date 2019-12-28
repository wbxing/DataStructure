package chapter8.e8_2;

public class Foreach {
    public static void main(String[] args) {
        int[] data = new int[] {1, 2, 3, 4, 5};

        for (int i = 0; i<data.length; ++i) {
            System.out.println(data[i]);
        }

        for (int d : data) {
            System.out.println(d);
        }
    }
}
