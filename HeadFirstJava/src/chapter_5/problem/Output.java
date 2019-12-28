package chapter_5.problem;

/**
 * 输出 13 15 x = 6
 */
public class Output {
    public static void main(String[] args) {
        Output o = new Output();
        o.go();
    }

    private void go () {
        int y = 7;
        for (int x = 1; x < 8; x++) {
            y++;
            if (x > 4) {
                System.out.print(++y + " ");
            }
            if (y > 14) {
                System.out.println("x = " + x);
                break;
            }
        }
    }
}
