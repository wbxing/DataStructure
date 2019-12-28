package chapter10.test;

import chapter10.e10_7.Book;
import chapter10.e10_7.binary_tree.BinaryTree;

import java.util.Arrays;

public class TestBinaryTree {
    public static void main(String[] args) throws Exception {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.add(new Book("Java", 89.9));
        binaryTree.add(new Book("Java Web", 69.9));
        binaryTree.add(new Book("Oracle", 99.9));
        binaryTree.add(new Book("Android", 79.9));

        Object[] obj = binaryTree.toArray();
        System.out.println(Arrays.toString(obj));
    }
}
