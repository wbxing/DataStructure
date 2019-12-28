package chapter_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 获取玩家输入类
 */
public class GameHelper {

    /**
     * 获取玩家输入
     * @param prompt A String
     * @return 读取的输入
     */
    public String getUserInput(String prompt) {
        String inputLine = null;
        System.out.print(prompt + ": ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) {
                return null;
            }
        } catch (IOException e) {
            System.out.println("IOException " + e);
        }
        return inputLine;
    }
}
