package chapter_4.problem;

public class Puzzle4b {
    private int ivar;

    public void setIvar(int var) {
        this.ivar = var;
    }

    public int doStuff(int factor) {
        if (ivar > 100) {
            return ivar * factor;
        } else {
            return ivar * (5 - factor);
        }
    }
}
