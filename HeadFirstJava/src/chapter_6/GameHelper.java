package chapter_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 辅助类
 * 获取玩家输入
 * 设置DotCom的位置
 */
class GameHelper {
    private static final String alphabet = "abcdefg";
    private int gridLength = 7;
    private int gridSize = gridLength * gridLength;
    private int [] grid = new int[gridSize];
    private int comCount = 0;

    String getUserInput (String prompt) {
        String inputLine = null;
        System.out.print(prompt + " ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) {
                return null;
            }
        } catch (IOException e) {
            System.out.println("IOException" + e);
        }
        return inputLine.toLowerCase();
    }
    ArrayList<String> placeDotCom (int comSize) {
        ArrayList<String> alphaCells = new ArrayList<>();
        //保存字符串
        //String [] alphacoords = new String[comSize];
        //临时字符串
        String temp;
        //现有字符串
        int [] coords = new int[comSize];
        //目前测试的字符串
        int attempts = 0;
        //目前的起点
        int location;
        //是否找到合适的位置
        boolean success = false;

        comCount++;
        //水平增量
        int incr = 1;
        if ((comCount % 2 == 1)) {
        //单行号
            //垂直增量
            incr = gridLength;
        }
        while (!success & attempts++ < 200) {
            //随机起点
            location = (int) (Math.random() * gridSize);
            //System.out.print(" try " + location);
            int x = 0;
            //假定成功
            success = true;
            //查找未使用的点
            while (success && x < comSize) {
                //未被使用
                if (grid[location] == 0) {
                    //储存位置
                    coords[x++] = location;
                    //尝试下一个点
                    location += incr;
                    //超出下边缘
                    if (location >= gridSize) {
                        success = false;
                    }
                    //超出右边缘
                    if (x>0 && (location % gridLength == 0)) {
                        success = false;
                    }
                } else {
                    //找到已经使用的位置
                    //System.out.print(" used " + location);
                    success = false;
                }
            }
        }
        //将位置转化为字符串形式
        int x = 0;
        int row;
        int column;
        //System.out.println("\n");
        while (x < comSize) {
            //标识格子已用
            grid[coords[x]] = 1;
            //得到行的值
            row = (coords[x] / gridLength);
            //得到列的值
            column = coords[x] % gridLength;
            //转化成字符串
            temp = String.valueOf(alphabet.charAt(column));
            alphaCells.add(temp.concat(Integer.toString(row)));
            x++;
            //System.out.print(" coord " + x + " = " + alphaCells.get(x-1));
        }
        //System.out.println("\n");
        return alphaCells;
    }
}
