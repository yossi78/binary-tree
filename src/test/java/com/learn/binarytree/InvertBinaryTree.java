package com.learn.binarytree;
import org.junit.Assert;
import org.junit.Test;




public class InvertBinaryTree {



    @Test
    public void InvertBinaryTreeTest(){
        Integer[]arr={4,2,7,1,3,6,9};
        TreeNode head=BinaryTreeUtil.addNode(arr);
        TreeNode newHead=BinaryTreeUtil.invertTree(head);
        TestUtil.validateNode(newHead,4,7,2);
        TreeNode seven=newHead.left;
        TestUtil.validateNodeWithNoGrandSons(seven,7,9,6);
        TreeNode two=newHead.right;
        TestUtil.validateNodeWithNoGrandSons(two,2,3,1);
    }


    @Test
    public void InvertBinaryTreeTripleTest(){
        Integer[]arr={2,1,3};
        TreeNode head=BinaryTreeUtil.addNode(arr);
        TreeNode newHead=BinaryTreeUtil.invertTree(head);
        TestUtil.validateNodeWithNoGrandSons(newHead,2,3,1);
    }

    @Test
    public void InvertBinaryTreeEmptyTest(){
        Integer[]arr={};
        TreeNode head=BinaryTreeUtil.addNode(arr);
        TreeNode newHead=BinaryTreeUtil.invertTree(head);
        TestUtil.validateNodeWithNoGrandSons(newHead,null,null,null);
    }


    @Test
    public void InvertBinaryTreeTwoNodesTest(){
        Integer[]arr={1,2};
        TreeNode head=BinaryTreeUtil.addNode(arr);
        TreeNode newHead=BinaryTreeUtil.invertTree(head);
        TestUtil.validateNodeWithNoGrandSons(newHead,1,2,null);
    }

}
