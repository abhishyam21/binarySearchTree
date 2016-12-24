package com.TreeTraversal;

import com.insertingNodeToBST.BinarySearchTree;

import java.util.Stack;

/**
 * Created by Rachana Rao on 12/20/2015.
 */
public class PreOrder {
    Stack<BinarySearchTree> stack = new Stack<>();

    public void preOderTraversalWithoutRecursion(BinarySearchTree root) {
        while (true) {
            while (root != null) {
                stack.push(root);
                System.out.print(root.getData() + "\t");
                root = root.getLeftNode();
            }
            if (stack.isEmpty()) {
                break;
            } else {
                BinarySearchTree tempNode = stack.pop();
                root = tempNode.getRightNode();
            }
        }
    }


    public void preOrder(BinarySearchTree root) {
        if (root == null) {
            return;
        } else {
            System.out.print(root.getData() + "\t");
            preOrder(root.getLeftNode());
            preOrder(root.getRightNode());
        }
    }
}
