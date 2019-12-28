package chapter4.test;

import chapter4.e4_6.Application.Normal.Computer;
import chapter4.e4_6.Application.Normal.Flash;
import chapter4.e4_6.Application.Normal.Print;
import chapter4.e4_6.Application.Normal.MP3;


public class TestUSB {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.plugin(new Flash());
        computer.plugin(new Print());
        computer.plugin(new MP3());
    }
}
