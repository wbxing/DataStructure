package chapter5.e5_4;

public class Sex {
    private String sex;
    private static final Sex MALE = new Sex("man");
    private static final Sex FEMALE = new Sex("woman");

    private Sex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Sex{" +
                "title='" + this.sex + '\'' +
                '}';
    }

    public static Sex getInstance(String ch) {
        switch (ch) {
            case "man":
                return MALE;
            case "woman":
                return FEMALE;
            default:
                return null;
        }
    }
}
