package com.TreeTraversal;

import com.insertingNodeToBST.BinarySearchTree;

import java.util.Stack;

/**
 * Created by Rachana Rao on 12/18/2015.
 */
public class InOrder {
    Stack<BinarySearchTree> stack = new Stack<>();
    BinarySearchTree Root = null;

    private void addLeftLeaf(BinarySearchTree root) {
        while (root != null) {
            stack.push(root);
            root = root.getLeftNode();
        }
    }

    public void inOrderTraverseWithoutRecursion(BinarySearchTree root) {
        addLeftLeaf(root);

        while (!stack.isEmpty()) {
            BinarySearchTree currentNode = stack.pop();
            System.out.print(currentNode.getData() + "\t");

            if (currentNode.getRightNode() != null) {
                addLeftLeaf(currentNode.getRightNode());
            }
        }
    }

    public void inOrder(BinarySearchTree Root) {
        if (Root == null)
            return;
        else {
            inOrder(Root.getLeftNode());
            System.out.print(Root.getData() + "\t");
            inOrder(Root.getRightNode());
        }
    }

}
