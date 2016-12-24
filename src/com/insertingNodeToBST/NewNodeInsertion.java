package com.insertingNodeToBST;

/**
 * Created by Rachana Rao on 12/31/2015.
 */
public class NewNodeInsertion {

    BinarySearchTree Root;

    public NewNodeInsertion(int data) {
        Root = new BinarySearchTree(data);
    }

    public void insertNode(int data) {
        BinarySearchTree node = new BinarySearchTree(data);
        BinarySearchTree temp = Root;
        while (temp != null) {
            if (temp.getData() < data) { //RightTree
                if (temp.getRightNode() == null) {
                    temp.setRightNode(node);
                    break;
                } else {
                    temp = temp.getRightNode();
                }

            } else {  //LeftTree
                if (temp.getLeftNode() == null) {
                    temp.setLeftNode(node);
                    break;
                } else {
                    temp = temp.getLeftNode();
                }
            }
        }

    }

    protected BinarySearchTree getRoot() {
        return Root;
    }
}
