package com.test;

import com.data.structure.stack.ArrayStack;
import com.data.structure.InfixToSuffix;

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
