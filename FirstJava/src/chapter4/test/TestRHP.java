package chapter4.test;

import chapter4.e4_5.Template.Action;
import chapter4.e4_5.Template.Human;
import chapter4.e4_5.Template.Pig;
import chapter4.e4_5.Template.Robot;

public class TestRHP {
    public static void main(String[] args) {
        fun(new Human());
        fun(new Robot());
        fun(new Pig());
    }

    public static void fun(Action action) {
        action.command(action.EAT);
        action.command(action.SLEEP);
        action.command(action.WORK);
    }
}
