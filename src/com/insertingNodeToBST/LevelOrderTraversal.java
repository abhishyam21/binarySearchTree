package com.insertingNodeToBST;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by Rachana Rao on 12/26/2015.
 */
public class LevelOrderTraversal {
    Queue<BinarySearchTree> queue = new ArrayDeque<>();
    BinarySearchTree tempNode = new BinarySearchTree(-1);

    public void levelOrderTraversal(BinarySearchTree tree) {
        if (tree == null) {
            return;
        } else {
            queue.add(tree);
            queue.add(tempNode);
            while (!queue.isEmpty()) {
                BinarySearchTree current = queue.peek();
                if (current.equals(tempNode)) {
                    if (queue.size() > 1)
                        queue.add(tempNode);
                    queue.remove();
                    System.out.println("");
                } else {
                    System.out.print(current.getData() + "\t");
                    queue.remove();
                    if (current.getLeftNode() != null) {
                        queue.add(current.getLeftNode());
                    }
                    if (current.getRightNode() != null) {
                        queue.add(current.getRightNode());
                    }
                }
            }
        }
    }
}
