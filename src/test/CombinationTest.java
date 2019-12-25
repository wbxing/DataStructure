import data.structure.recursion.Combination;

public class CombinationTest {
    public static void main(String[] args) {
        char[] persons = {'A','B','C','D','E'};
        int teamNumber = 3;
        Combination cb = new Combination(persons);
        cb.combination(teamNumber,0);
    }
}
