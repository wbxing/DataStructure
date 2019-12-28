package chapter_6.sample.test;

import chapter_6.sample.SampleDotCom_6;
import chapter_6.sample.GameHelper_6;

import java.util.ArrayList;

public class DotComTestDrive {
    public static void main(String[] args) {
        //记录猜测次数
        int numOfGuess = 0;
        //获取玩家输入
        GameHelper_6 helper = new GameHelper_6();
        //创建 dot com 对象
        SampleDotCom_6 dot = new SampleDotCom_6();
        //创建带有 dot com 位置的数组
        int randomNum = (int) (Math.random() * 5 + 1);
        ArrayList<String> location = new ArrayList<>();
        location.add(String.valueOf(randomNum));
        location.add(String.valueOf(randomNum + 1));
        location.add(String.valueOf(randomNum + 2));
        dot.setLocationCells(location);
        //判断是否结束
        boolean isAlive = true;

        while (isAlive) {
            String guess = helper.getUserInput("Enter a number");
            String result = dot.checkYourself(guess);

            numOfGuess++;
            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuess + " guesses");
            }
        }
    }
}

