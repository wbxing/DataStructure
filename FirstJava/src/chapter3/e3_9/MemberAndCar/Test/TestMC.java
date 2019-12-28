package chapter3.e3_9.MemberAndCar.Test;

import chapter3.e3_9.MemberAndCar.Car;
import chapter3.e3_9.MemberAndCar.Member;

public class TestMC {
    public static void main(String[] args) {
        Member m = new Member(1, "zhang");
        Member chd = new Member(2, "li");
        Car c = new Car("Audi A6L");
        Car cc = new Car("Ferrari 430");

        m.setCar(c);
        c.setMbr(m);
        m.setChild(chd);
        chd.setCar(cc);
        cc.setMbr(chd);

        System.out.println(m.getCar().getInfo());
        System.out.println(c.getMbr().getInfo());
        System.out.println(m.getChild().getInfo());
        System.out.println(m.getChild().getCar().getInfo());
    }
}

