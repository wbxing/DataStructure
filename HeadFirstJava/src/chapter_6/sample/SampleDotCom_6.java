package chapter_6.sample;

import java.util.ArrayList;

/**
 * 游戏类
 */
public class SampleDotCom_6 {
    private ArrayList<String> locationCells;
    private int numOfHits = 0;


    public void setLocationCells(ArrayList<String> locationCells) {
        this.locationCells = locationCells;
    }
    public String checkYourself(String userInput) {
            int guess = Integer.parseInt(userInput);
            String result = "miss";
            int index = locationCells.indexOf(userInput);
            if (index >= 0) {
                locationCells.remove(index);
                if (locationCells.isEmpty()) {
                    result = "kill";
                } else {
                    result = "hit";
                }
            }

            System.out.println(result);
            return result;
    }
}
