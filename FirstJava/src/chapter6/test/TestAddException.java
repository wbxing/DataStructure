package chapter6.test;

import chapter6.e6_8.AddException;

public class TestAddException {
    public static void main(String[] args) {
         int num = (int)(Math.random() * 10 );
         try {
             if (num > 5) {
                 throw new AddException("num 过大！");
             }
         } catch (Exception e) {
             e.printStackTrace();
         }
    }
}
