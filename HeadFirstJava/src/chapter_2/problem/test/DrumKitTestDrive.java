package chapter_2.problem.test;

import chapter_2.problem.DrumKit;

public class DrumKitTestDrive {
    public static void main(String[] args) {

        System.out.println("% java DrumKitTestDrive");

        DrumKit d = new DrumKit();
        d.playSnare();
        d.snare = false;
        d.playTopHat();

        if (d.snare) {
            d.playSnare();
        }
    }


}
