package com.avlTrees;

import com.insertingNodeToBST.BinarySearchTree;
import com.insertingNodeToBST.LevelOrderTraversal;

/**
 * Created by Rachana Rao on 3/21/2016.
 */
public class Tree {
    public static void main(String[] args) {

        BinarySearchTree Root = null;
        NodeInsertion nodeInsertion = new NodeInsertion();

       /* Root = nodeInsertion.addNode(10,Root);
        Root = nodeInsertion.addNode(6,Root);
        Root = nodeInsertion.addNode(15,Root);
        Root = nodeInsertion.addNode(5,Root);
        Root = nodeInsertion.addNode(7,Root);
        Root = nodeInsertion.addNode(4,Root);*/
        Root = nodeInsertion.addNode(4, Root);
        Root = nodeInsertion.addNode(2, Root);
        Root = nodeInsertion.addNode(7, Root);
        Root = nodeInsertion.addNode(6, Root);
        Root = nodeInsertion.addNode(8, Root);
        Root = nodeInsertion.addNode(5, Root);
        /*Root = nodeInsertion.addNode(3,Root);
        Root = nodeInsertion.addNode(7,Root);*/
        LevelOrderTraversal levelOrderTraversal = new LevelOrderTraversal();
        levelOrderTraversal.levelOrderTraversal(Root);

        System.out.println("Height");
        System.out.println("-------");
        HeightOfTree heightOfTree = new HeightOfTree();
        System.out.println(heightOfTree.height(Root));

        CheckBalancedTree checkBalancedTree = new CheckBalancedTree();

        if (!checkBalancedTree.isBalanced(Root))
            System.out.println("Balanced");
        else {
            System.out.println("Not Balanced");
        }
    }
}
