package chapter_10.problem;

import static java.lang.System.out;
import java.util.*;

public class FullMoons {
    static int DAY_IM = 1000 * 60 * 60 * 24;

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2004, 0, 20, 15, 40);
        long day1 = c.getTimeInMillis();
        for (int i = 0; i < 60; i++) {
            day1 += (DAY_IM * 29.52);
            c.setTimeInMillis(day1);
            out.println(String.format("full moon on %tc", c));
        }
    }
}
