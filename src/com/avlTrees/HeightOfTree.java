package com.avlTrees;

import com.insertingNodeToBST.BinarySearchTree;

/**
 * Created by Rachana Rao on 3/21/2016.
 */
public class HeightOfTree {
    public int height(BinarySearchTree node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(height(node.getLeftNode()), height(node.getRightNode()));
    }
}
