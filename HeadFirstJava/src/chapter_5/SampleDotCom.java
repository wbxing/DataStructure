package chapter_5;

/**
 * 游戏类
 */

public class SampleDotCom {
    private int [] locationCells = new int[7];
    private int numOfHits = 0;

    /**
     * 游戏结果
     * @param stringGuess 玩家猜测，字符串形式读入
     * @return 游戏结果
     */
    public String checkYourself (String stringGuess) {
    //取得玩家猜测，返回结果
        //字符串转换为 int
        int guess = Integer.parseInt(stringGuess);
        //游戏结果
        String result = "miss";
        //遍历所有格子
        for (int cell : locationCells){
            if (guess == cell){
                result = "hit";
                numOfHits ++;
                break;
            }
        }
        //判断是否击沉
        if (numOfHits == locationCells.length){
            result = "kill";
        }
        System.out.println(result);
        return result;
    }

    public void setLocationCells(int[] loc) {
        this.locationCells = loc;
    }
}
