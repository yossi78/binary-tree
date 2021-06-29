package com.learn.binarytree;
import org.junit.Assert;
import org.junit.Test;




public class DiameterOfBinaryTreeTest {


    @Test
    public void InvertBinaryTreeTest(){
        Integer[]arr={80,40,300,20,50,200,500};
        TreeNode head=BinaryTreeUtil.addNode(arr);
        int result=BinaryTreeUtil.diameterOfBinaryTree(head);
        Assert.assertEquals(4,result);
    }


}
