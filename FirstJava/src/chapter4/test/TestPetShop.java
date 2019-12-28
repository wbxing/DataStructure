package chapter4.test;

import chapter3.e3_13.LinkedList.Link;
import chapter4.e4_8.Cat;
import chapter4.e4_8.PetShop;

public class TestPetShop {
    public static void main(String[] args) {
        PetShop petShop = new PetShop();
        petShop.add(new Cat("cat1", 1));
        petShop.add(new Cat("cat2", 2));
        petShop.add(new Cat("cat3", 3));
        petShop.add(new Cat("cat4", 4));
        petShop.add(new Cat("dog1", 1));
        petShop.add(new Cat("dog2", 2));
        petShop.add(new Cat("dog3", 3));

        Link res =  petShop.search("c");
        Object [] objects = res.toArray();
        for (Object o : objects) {
            System.out.println(o);
        }
    }
}
