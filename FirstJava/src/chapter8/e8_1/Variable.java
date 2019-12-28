package chapter8.e8_1;

public class Variable {
    public static void main(String[] args) {
        System.out.println(add(new int[] {1, 2, 3}));
        System.out.println(add(new int[] {10, 20}));
        System.out.println(addPlus(1, 2, 3));
        System.out.println(addPlus(10, 20));
        System.out.println(addPlus());


    }

    public static int add(int[] num) {
        int sum = 0;
        for (int n : num) {
            sum += n;
        }
        return sum;
    }

    public static int addPlus(int ... num) {
        int sum = 0;
        for (int n : num) {
            sum += n;
        }
        return sum;
    }
}
