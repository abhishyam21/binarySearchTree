package com.insertingNodeToBST;

/**
 * Created by Rachana Rao on 1/3/2016.
 */
public class SearchingNode {

    public void search(BinarySearchTree root, int data) {
        BinarySearchTree tempNode = root;

        while (true) {
            if (tempNode == null) {
                System.out.println("No Element Found");
                break;
            } else {
                if (data == tempNode.getData()) {
                    System.out.println("Data Found!!!");
                    break;
                } else if (tempNode.getData() < data)
                    tempNode = tempNode.getRightNode();
                else if (tempNode.getData() > data)
                    tempNode = tempNode.getLeftNode();
            }
        }
    }
}
