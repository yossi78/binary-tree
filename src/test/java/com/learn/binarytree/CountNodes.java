package com.learn.binarytree;

import org.junit.Assert;
import org.junit.Test;

public class CountNodes {



    @Test
    public void removeMostRightNode(){
        Integer[]arr={80,40,300,20,50,200,500,10,25,45,60,100,250,400,700};
        TreeNode head=BinaryTreeUtil.addNode(arr);
        int count=BinaryTreeUtil.countNodes(head);
        Assert.assertEquals(15,count);
    }



}
