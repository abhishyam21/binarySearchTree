package com.avlTrees;

/**
 * Created by Rachana Rao on 4/2/2016.
 */
public class Main {
    public static void main(String[] args) {
        AVLTree avlTree = new AVLTree();
        avlTree.insert(15);
        avlTree.insert(20);
        avlTree.insert(24);
        avlTree.insert(10);
        avlTree.insert(13);
        avlTree.insert(7);
        avlTree.insert(30);
        avlTree.insert(36);
        avlTree.insert(25);


        System.out.println("Level Order Traversal");

        avlTree.inorderTraversal();
    }
}
