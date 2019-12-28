package chapter6.test;

import chapter6.e6_5.DealException;

public class TestDealException {
    public static void main(String[] args) {
        try {
            System.out.println(DealException.div(10, 0));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
