package chapter_5.test;

import chapter_5.GameHelper;
import chapter_5.SampleDotCom;

public class SampleDotComTestDrive {
    public static void main(String[] args) {
        //记录猜测次数
        int numOfGuess = 0;
        //获取玩家输入
        GameHelper helper = new GameHelper();
        //创建 dot com 对象
        SampleDotCom dot = new SampleDotCom();
        //创建带有 dot com 位置的数组
        int randomNum = (int) (Math.random() * 5 + 1);
        int[] location = {randomNum, randomNum + 1, randomNum + 2};
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
