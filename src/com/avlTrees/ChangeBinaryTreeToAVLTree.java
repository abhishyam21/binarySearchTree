package com.avlTrees;

import com.insertingNodeToBST.BinarySearchTree;

/**
 * Created by Rachana Rao on 4/2/2016.
 */
public class ChangeBinaryTreeToAVLTree {
    public BinarySearchTree getConvertedTree(BinarySearchTree root) {
        System.out.println(root.getData() + "Not Balanced point");
        /*if(root.getLeftNode()!= null && root.getLeftNode().getLeftNode() != null){
            root = leftLeftarrange(root);
        }
        else if(root.getRightNode() != null && root.getRightNode().getRightNode() != null){
            root = rightRightArrange(root);
        }
        else*/
        if (root.getLeftNode() != null && root.getLeftNode().getRightNode() != null) {
            root = leftRightArrange(root);
        } else if (root.getRightNode() != null && root.getRightNode().getLeftNode() != null) {
            root = rightLeftArrange(root);
        }

        return root;
    }

    private BinarySearchTree rightLeftArrange(BinarySearchTree root) {
        root.setRightNode(leftLeftarrange(root.getRightNode()));
        return rightRightArrange(root);
    }

    private BinarySearchTree leftRightArrange(BinarySearchTree root) {
        root.setLeftNode(rightRightArrange(root.getLeftNode()));
        return leftLeftarrange(root);

    }

    private BinarySearchTree rightRightArrange(BinarySearchTree root) {
        BinarySearchTree Root = root.getRightNode();
        root.setRightNode(null);
        if (Root.getLeftNode() != null) {
            root.setRightNode(Root.getLeftNode());
        }
        Root.setLeftNode(root);
        return Root;
    }

    private BinarySearchTree leftLeftarrange(BinarySearchTree root) {
        BinarySearchTree Root = root.getLeftNode();
        root.setLeftNode(null);
        if (Root.getRightNode() != null) {
            root.setLeftNode(Root.getRightNode());
        }
        Root.setRightNode(root);
        return Root;
    }
}
