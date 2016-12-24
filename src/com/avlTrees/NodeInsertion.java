package com.avlTrees;

import com.insertingNodeToBST.BinarySearchTree;

/**
 * Created by Rachana Rao on 3/21/2016.
 */
public class NodeInsertion {

    public BinarySearchTree addNode(int i, BinarySearchTree root) {
        BinarySearchTree binarySearchTree = new BinarySearchTree(i);
        if (root == null) {
            root = binarySearchTree;
            return root;
        } else {
            if (root.getData() <= i) {
                root.setRightNode(addNode(i, root.getRightNode()));
            } else {
                root.setLeftNode(addNode(i, root.getLeftNode()));
            }
        }
        CheckBalancedTree checkBalancedTree = new CheckBalancedTree();
        if (checkBalancedTree.isBalanced(root)) {
            ChangeBinaryTreeToAVLTree changeBinaryTreeToAVLTree = new ChangeBinaryTreeToAVLTree();
            root = changeBinaryTreeToAVLTree.getConvertedTree(root);
        }
        return root;
    }

}
