package com.TreeTraversal;

import com.insertingNodeToBST.BinarySearchTree;

import java.util.Stack;

/**
 * Created by Rachana Rao on 12/20/2015.
 */
public class PostOrder {

    Stack<BinarySearchTree> stack = new Stack<>();

    public void postOderTraversalWithoutRecursion(BinarySearchTree root) {

        BinarySearchTree current = null;
        BinarySearchTree prev = null;

        while (true) {
            while (root != null) {
                stack.push(root);
                root = root.getLeftNode();
            }
            if (stack.isEmpty())
                return;

            else {
                prev = current;
                current = stack.peek();
                if (current.getLeftNode() == null && current.getRightNode() == null) {
                    System.out.print(current.getData() + "\t");
                    stack.pop();

                } else {
                    if (current.getRightNode().equals(prev)) {
                        System.out.print(stack.pop().getData() + "\t");
                    } else if (current.getRightNode() != null) {
                        root = current.getRightNode();
                    }
                }
            }
        }
    }

    public void postOrder(BinarySearchTree Root) {
        if (Root == null)
            return;
        else {
            postOrder(Root.getLeftNode());
            postOrder(Root.getRightNode());
            System.out.print(Root.getData() + "\t");
        }
    }
}