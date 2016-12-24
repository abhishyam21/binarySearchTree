package com.insertingNodeToBST;

/**
 * Created by Rachana Rao on 1/3/2016.
 */
public class DeletingNode {

    public void search(BinarySearchTree root, int data) {
        BinarySearchTree prevNode = root;

        while (true) {
            if (root == null) {
                System.out.println("No Element Found");
                break;
            } else {
                if (data == root.getData()) {
                    delete(root, prevNode);
                    break;
                } else if (root.getData() < data) {
                    prevNode = root;
                    root = root.getRightNode();
                } else if (root.getData() > data) {
                    prevNode = root;
                    root = root.getLeftNode();
                }
            }
        }
    }

    private BinarySearchTree delete(BinarySearchTree root, BinarySearchTree prevNode) {
        if (root.getLeftNode() == null && root.getRightNode() == null) {
            if (prevNode.getLeftNode().equals(root)) {
                prevNode.setLeftNode(null);
            } else if (prevNode.getRightNode().equals(root)) {
                prevNode.setRightNode(null);
            }
        } else {
            if (root.getLeftNode() != null && root.getRightNode() != null) {
                BinarySearchTree maxOfLeftSubTree = root.getLeftNode();
                while (maxOfLeftSubTree.getRightNode() != null) {
                    maxOfLeftSubTree = maxOfLeftSubTree.getRightNode();
                }
                root.setData(maxOfLeftSubTree.getData());
                root = delete(maxOfLeftSubTree, root);
            } else if (root.getLeftNode() != null || root.getRightNode() != null) {
                if (root.equals(prevNode.getRightNode())) {
                    prevNode.setRightNode(root.getRightNode());
                } else if (root.equals(prevNode.getLeftNode())) {
                    prevNode.setLeftNode(root.getLeftNode());
                }
            }/*else if(root.getRightNode() != null){
                if(root.equals(prevNode.getRightNode())){
                        prevNode.setRightNode(root.getRightNode());
                }else if(root.equals(prevNode.getLeftNode())){
                       prevNode.setLeftNode(root.getLeftNode());
                }
          }*/
        }
        return root;
    }
}
