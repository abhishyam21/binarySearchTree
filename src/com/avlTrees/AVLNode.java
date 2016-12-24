package com.avlTrees;

/**
 * Created by Rachana Rao on 4/2/2016.
 */
public class AVLNode {
    private int data;
    private int height;
    private AVLNode right, left;

    public AVLNode() {
        this.data = 0;
        this.height = 0;
        this.right = null;
        this.left = null;
    }

    public AVLNode(int data) {
        this.data = data;
        this.height = 0;
        this.right = null;
        this.left = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public AVLNode getRight() {
        return right;
    }

    public void setRight(AVLNode right) {
        this.right = right;
    }

    public AVLNode getLeft() {
        return left;
    }

    public void setLeft(AVLNode left) {
        this.left = left;
    }
}
