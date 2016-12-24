package com.insertingNodeToBST;

/**
 * Created by Rachana Rao on 3/12/2016.
 */
public class LeastCommonAnsister {
    public BinarySearchTree LCA(BinarySearchTree root, BinarySearchTree alpha, BinarySearchTree beeta) {

        if (root == null)
            return null;
        if ((root.getData() >= alpha.getData() && root.getData() <= beeta.getData()) ||
                (root.getData() <= alpha.getData() && root.getData() >= beeta.getData())) {
            return root;
        } else {

            if (root.getData() > alpha.getData())
                return LCA(root.getLeftNode(), alpha, beeta);
            else
                return LCA(root.getRightNode(), alpha, beeta);
        }
    }
}
