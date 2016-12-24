package com.avlTrees;

import com.insertingNodeToBST.BinarySearchTree;

/**
 * Created by Rachana Rao on 3/22/2016.
 */
public class CheckBalancedTree {

    public boolean isBalanced(BinarySearchTree root) {
        return balancedTreeCheck(root) == -1;
    }

    private int balancedTreeCheck(BinarySearchTree root) {
        if (root == null)
            return 0;
        else {
            int l = balancedTreeCheck(root.getLeftNode());
            if (l == -1) {
                return l;
            }
            int r = balancedTreeCheck(root.getRightNode());
            if (r == -1) {
                return r;
            }
            if (Math.abs(l - r) < 2) {
                return 1 + Math.max(l, r);
            } else
                return -1;
        }
    }
}
