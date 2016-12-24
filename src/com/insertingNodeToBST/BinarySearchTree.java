package com.insertingNodeToBST;

/**
 * Created by Rachana Rao on 12/31/2015.
 */
public class BinarySearchTree {
    int data;
    BinarySearchTree leftNode;
    BinarySearchTree rightNode;

    public BinarySearchTree() {

    }

    public BinarySearchTree(int data) {
        this.data = data;
        this.leftNode = null;
        this.rightNode = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BinarySearchTree getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(BinarySearchTree leftNode) {
        this.leftNode = leftNode;
    }

    public BinarySearchTree getRightNode() {
        return rightNode;
    }

    public void setRightNode(BinarySearchTree rightNode) {
        this.rightNode = rightNode;
    }
}
