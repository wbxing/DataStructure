package chapter_6;

import java.util.ArrayList;

class DotCom {
    //位置
    private ArrayList<String> locationCells;
    //名称
    private String name;

    void setLocationCells(ArrayList<String> locationCells) {
        this.locationCells = locationCells;
    }
    void setName(String name) {
        this.name = name;
    }

    String checkYourself (String userInput) {
        String result = "miss";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            //删除猜中的元素
            locationCells.remove(index);
            //判断是否击沉
            if (locationCells.isEmpty()) {
                result = "kill";
                System.out.println("Ouch! You sunk " + name + " :-(");
            } else {
                result = "hit";
            }
        }
        return result;
    }
}
