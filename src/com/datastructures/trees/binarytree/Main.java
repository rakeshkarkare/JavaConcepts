package com.datastructures.trees.binarytree;

public class Main {
    public static void main(String[] args) {
        // Tree (root)
        // Node (value, leftChild, rightChild)
        // insert(value)
        // find(value):boolean

        // var current = root
        // current = current.leftChild;

        Tree tree = new Tree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);
        System.out.println("Done");

    }
}
