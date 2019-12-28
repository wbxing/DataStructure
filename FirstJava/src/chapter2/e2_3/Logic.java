package chapter2.e2_3;

public class Logic {
    public static void main(String[] args) {
        // 分支结构
        double score = 90.0;
        if (score > 60) {
            System.out.println("Passed!");
        }

        // if ... else
        score = 70;
        if (score > 60) {
            System.out.println("及格了！");
        } else {
            System.out.println("小白的成绩！");
        }

        // if ... else if ... else
        score = 91.0;
        if (score < 60) {
            System.out.println("小白的成绩！");
        } else if (score >=60 && score <= 90) {
            System.out.println("中等成绩！");
        } else if (score >90 && score <= 100){
            System.out.println("优秀成绩！");
        } else {
            System.out.println("非法成绩！！！");
        }

        // switch
        int ch = 1;
        switch (ch) {
            case 2: {
                System.out.println("2");
                break;
            }
            case 1: {
                System.out.println("1");
                break;
            }
            case 3: {
                System.out.println("3");
                break;
            }
            default: {
                System.out.println("NULL");
                break;
            }
        }

        // 字符串判断
        String str = "HELLO";
        switch (str) {
            case "HELLO": {
                System.out.println("HELLO");
                break;
            }
            case "hello": {
                System.out.println("hello");
                break;
            }
            case "null": {
                System.out.println("null");
                break;
            }
            default: {
                System.out.println("NULL");
                break;
            }
        }

        // 循环结构
        int sum = 0;
        int current = 1;
        while (current <= 100) {
            sum += current++;
        }
        System.out.println(sum);

        // do ... while
        sum = 0;
        current = 1;
        do {
            sum += current++;
        } while (current <= 100);
        System.out.println(sum);

        // for
        sum = 0;
        for (int i = 1; i <= 100; ++i) {
            sum += i;
        }
        System.out.println(sum);

    }
}
