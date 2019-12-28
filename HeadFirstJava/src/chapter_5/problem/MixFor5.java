package chapter_5.problem;

public class MixFor5 {
    public static void main(String[] args) {
        int x = 0;
        int y = 30;
        for (int outer = 0; outer < 3; outer++){
            for (int inner = 4; inner > 1; inner--){
                /* *
                 * x += 3;    //output: 54 6
                 * x += 6;    //output: 60 10
                 * x += 2;    //output: 45 6
                 * x++;    //output: 36 6
                 * x--;    //output: 18 6
                 */
                x += 0;    //output: 6 14
                y -= 2;
                if (x == 6){
                    break;
                }
                x += 3;
            }
            y -= 2;
        }
        System.out.println(x + " " + y);
    }
}
