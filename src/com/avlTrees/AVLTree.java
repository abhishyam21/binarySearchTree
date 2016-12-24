package com.avlTrees;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by Rachana Rao on 4/2/2016.
 */
public class AVLTree {
    Queue<AVLNode> queue = new ArrayDeque<>();
    private AVLNode root;
    private AVLNode temp = new AVLNode(-1);

    public AVLTree() {
        root = null;
    }

    public void insert(int data) {
        root = insert(data, root);
    }

    public int height(AVLNode node) {
        return node == null ? -1 : node.getHeight();
    }

    public int max(int a, int b) {
        return a > b ? a : b;
    }

    public void inorderTraversal() {
        inorderTraversal(root);
    }


    private AVLNode insert(int data, AVLNode root) {
        if (root == null) {
            root = new AVLNode(data);
        } else if (root.getData() > data) {
            root.setLeft(insert(data, root.getLeft()));
            if ((height(root.getLeft()) - height(root.getRight())) == 2) {
                if (data < root.getLeft().getData()) {
                    root = leftRotate(root);
                } else {
                    root = leftRightRotate(root);
                }
            }
        } else if (root.getData() < data) {
            root.setRight(insert(data, root.getRight()));
            if ((height(root.getRight()) - height(root.getLeft())) == 2) {
                if (data > root.getRight().getData()) {
                    root = rightRotate(root);
                } else {
                    root = rightLeftRoatate(root);
                }
            }
        }
        root.setHeight(max(height(root.getLeft()), height(root.getRight())) + 1);
        return root;
    }

    private AVLNode rightLeftRoatate(AVLNode root) {
        root.setRight(leftRotate(root.getRight()));
        return rightRotate(root);
    }

    private AVLNode leftRightRotate(AVLNode root) {
        root.setLeft(rightRotate(root.getLeft()));
        return leftRotate(root);
    }

    private AVLNode rightRotate(AVLNode root) {
        AVLNode Root = root.getRight();
        root.setRight(Root.getLeft());
        Root.setLeft(root);
        root.setHeight(max(height(root.getLeft()), height(root.getRight())) + 1);
        Root.setHeight(max(height(root), height(Root.getRight())) + 1);
        return Root;
    }

    private AVLNode leftRotate(AVLNode root) {
        AVLNode Root = root.getLeft();
        root.setLeft(Root.getRight());
        Root.setRight(root);
        root.setHeight(max(height(root.getLeft()), height(root.getRight())) + 1);
        Root.setHeight(max(height(Root.getLeft()), height(root)) + 1);
        return Root;
    }

    private void inorderTraversal(AVLNode root) {
        if (root == null) {
            return;
        } else {
            queue.add(root);
            queue.add(temp);
            while (!queue.isEmpty()) {
                AVLNode current = queue.peek();
                if (current.equals(temp)) {
                    if (queue.size() > 1)
                        queue.add(temp);
                    queue.remove();
                    System.out.println("");
                } else {
                    System.out.print(current.getData() + "\t");
                    queue.remove();
                    if (current.getLeft() != null) {
                        queue.add(current.getLeft());
                    }
                    if (current.getRight() != null) {
                        queue.add(current.getRight());
                    }
                }
            }
        }
    }
}
