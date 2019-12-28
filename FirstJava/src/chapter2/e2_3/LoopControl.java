package chapter2.e2_3;

public class LoopControl {
    public static void main(String[] args) {
        for (int i = 0; i < 10; ++i) {
            if (i == 3) {
                continue;
            }
            System.out.print(i + "\t");
        }

        System.out.println();
        for (int i = 0; i < 10; ++i) {
            if (i == 3) {
                break;
            }
            System.out.print(i + "\t");
        }
    }
}
