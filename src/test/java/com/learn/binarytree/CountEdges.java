package com.learn.binarytree;
import org.junit.Assert;
import org.junit.Test;




public class CountEdges {


    @Test
    public void countEvenTreeTest(){
        Integer[]arr={80,40,300,20,50,200,500,10,25,45,60,100,250,400,700};
        TreeNode head=BinaryTreeUtil.addNode(arr);
        int count=BinaryTreeUtil.countEdges(head);
        Assert.assertEquals(14,count);
    }


    @Test
    public void countRightestTreeTest(){
        Integer[]arr={80,40,300,500,700,900};
        TreeNode head=BinaryTreeUtil.addNode(arr);
        int count=BinaryTreeUtil.countEdges(head);
        Assert.assertEquals(5,count);
    }

    @Test
    public void countLeftestTreeTest(){
        Integer[]arr={900,700,500,300,80};
        TreeNode head=BinaryTreeUtil.addNode(arr);
        int count=BinaryTreeUtil.countEdges(head);
        Assert.assertEquals(4,count);
    }


    @Test
    public void countBrokenTreeTest(){
        Integer[]arr={80,300,500,400,200,100};
        TreeNode head=BinaryTreeUtil.addNode(arr);
        int count=BinaryTreeUtil.countEdges(head);
        Assert.assertEquals(5,count);
    }



}
