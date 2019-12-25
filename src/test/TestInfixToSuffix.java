import data.structure.stack.ArrayStack;
import data.structure.stack.InfixToSuffix;

import java.util.Scanner;

public class TestInfixToSuffix {
    public static void main(String[] args) {
//        String input = "A*(B+C)-D/(E+F)";
        String input;
        System.out.println("Enter infix:");
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
        InfixToSuffix in = new InfixToSuffix(input);
        ArrayStack my = in.doTrans();
        my.display();

    }
}
