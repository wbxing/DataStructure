package chapter_9.problem;

public class Duck {
    int pounds = 6;
    float floatAbility = 2.1F;
    String name = "Generic";
    long[] feathers = {1, 2, 3, 4 ,5 ,6, 7};
    boolean canFly = true;
    int maxSpeed = 25;

    public Duck() {
        System.out.println("Type 1 duck");
    }

    public Duck(boolean canFly) {
        this.canFly = canFly;
        System.out.println("Type 2 duck");
    }

    public Duck(String name, long[] feathers) {
        this.name = name;
        this.feathers = feathers;
        System.out.println("Type 3 duck");
    }

    public Duck(int pounds, float floatAbility) {
        this.pounds = pounds;
        this.floatAbility = floatAbility;
        System.out.println("Type 4 duck");
    }

    public Duck(float floatAbility, int maxSpeed) {
        this.floatAbility = floatAbility;
        this.maxSpeed = maxSpeed;
        System.out.println("Type 5 duck");
    }
}
