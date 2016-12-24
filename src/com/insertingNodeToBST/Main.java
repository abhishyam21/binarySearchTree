package com.insertingNodeToBST;

import java.util.Random;

/**
 * Created by Rachana Rao on 12/31/2015.
 */
public class Main {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        NewNodeInsertion newNodeInsertion = new NewNodeInsertion(4);

       /* newNodeInsertion.insertNode(2);
        newNodeInsertion.insertNode(8);
        newNodeInsertion.insertNode(5);
        newNodeInsertion.insertNode(11);
        newNodeInsertion.insertNode(7);
        newNodeInsertion.insertNode(6);
*/

        for (int i = 0; i < 100000000; i++) {
            newNodeInsertion.insertNode(new Random().nextInt());
        }

        /*newNodeInsertion.insertNode(5);
        newNodeInsertion.insertNode(3);
        newNodeInsertion.insertNode(7);
        newNodeInsertion.insertNode(9);
        newNodeInsertion.insertNode(12);
        newNodeInsertion.insertNode(1);
        newNodeInsertion.insertNode(15);
        newNodeInsertion.insertNode(6);*/

        newNodeInsertion.insertNode(999);
        BinarySearchTree Root = newNodeInsertion.getRoot();
        long mid = System.currentTimeMillis();
        System.out.println((mid - start) / 1000);

        /*InOrder inOrder = new InOrder();
        PreOrder preOrder = new PreOrder();
        PostOrder postOrder = new PostOrder();

        System.out.println("Inorder Traversal!!!!!!!");
        inOrder.inOrder(Root);
        System.out.println("\n");
        inOrder.inOrderTraverseWithoutRecursion(Root);

        System.out.println("\nPreOrder Traversal!!!!!");
        preOrder.preOrder(Root);
        System.out.println("\n");
        preOrder.preOderTraversalWithoutRecursion(Root);

        System.out.println("\nPostOrder Traversal!!!!!!");
        postOrder.postOrder(Root);
        System.out.println("\n");
      //  postOrder.postOderTraversalWithoutRecursion(Root);

        LevelOrderTraversal levelOrderTraversal = new LevelOrderTraversal();
        levelOrderTraversal.levelOrderTraversal(Root);
        System.out.println("");



        System.out.println("Deleting the Node from Tree");
        DeletingNode deletingNode = new DeletingNode();
        deletingNode.search(Root,2);

        LevelOrderTraversal levelOrderTraversal1 = new LevelOrderTraversal();
        levelOrderTraversal1.levelOrderTraversal(Root);
        System.out.println("");*/

      /*  System.out.println("LCA!!!");
        LeastCommonAnsister leastCommonAnsister = new LeastCommonAnsister();
        BinarySearchTree LCA = leastCommonAnsister.LCA(Root,new BinarySearchTree(7),new BinarySearchTree(11));
            if(LCA != null)
        System.out.println(LCA.getData());*/

        System.out.println("Searching an Element!!!");
        SearchingNode searchingNode = new SearchingNode();
        searchingNode.search(Root, 999);

        long end = System.currentTimeMillis();
        System.out.println((end - mid) / 1000);
    }
}
