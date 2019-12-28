package chapter_7;

public class Overloads {

    String uniqueID;
    public void addNums(int a, int b) {
        System.out.println("int");
        System.out.println(a + b);
    }
    public void addNums(double a, double b) {
        System.out.println("double");
        System.out.println(a + b);
    }

    public void setUniqueID(String uniqueID) {
        this.uniqueID = uniqueID;
    }
    public void setUniqueID(int ssNumber) {
        String numString = "" + ssNumber;
        setUniqueID(numString);
    }
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        double c = 1.;
        double d = 1.;
        Overloads obj = new Overloads();
        obj.addNums(a, b);
        obj.addNums(c, d);
    }
}
