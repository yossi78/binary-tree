package com.learn.binarytree;
import org.junit.Assert;
import org.junit.Test;




public class FindMinDept {



    @Test
    public void findMinDepthOnMixTree2And4(){
        TreeNode sixtyFive=new TreeNode(65,null,null);
        TreeNode seventyFive=new TreeNode(75,null,null);
        TreeNode seventy=new TreeNode(70,sixtyFive,seventyFive);
        TreeNode fivty=new TreeNode(50,null,null);
        TreeNode twenty=new TreeNode(20,null,null);
        TreeNode sixty=new TreeNode(60,fivty,seventy);
        TreeNode head=new TreeNode(40,twenty,sixty);
        BinaryTreeUtil.addNode(null,head);
        Integer minDepth=BinaryTreeUtil.minDepth(head);
        Assert.assertEquals(2L,minDepth.longValue());
    }


    @Test
    public void findMinDepthOnMixTree4(){
        TreeNode foutryFive=new TreeNode(45,null,null);
        TreeNode ten=new TreeNode(10,null,null);
        TreeNode therty=new TreeNode(30,null,null);
        TreeNode fivty=new TreeNode(50,foutryFive,null);
        TreeNode seventy=new TreeNode(70,null,null);
        TreeNode twenty=new TreeNode(20,ten,therty);
        TreeNode sixty=new TreeNode(60,fivty,seventy);
        TreeNode head=new TreeNode(40,twenty,sixty);
        BinaryTreeUtil.addNode(null,head);
        Integer maxDepth=BinaryTreeUtil.minDepth(head);
        Assert.assertEquals(3L,maxDepth.longValue());
    }

    @Test
    public void findMinDepthOnEvenTree4(){
        TreeNode five=new TreeNode(5,null,null);
        TreeNode fiveteen=new TreeNode(15,null,null);
        TreeNode twentyFive=new TreeNode(25,null,null);
        TreeNode thertyFive=new TreeNode(35,null,null);
        TreeNode fourtyFive=new TreeNode(45,null,null);
        TreeNode fivtyFive=new TreeNode(55,null,null);
        TreeNode sixtyFive=new TreeNode(65,null,null);
        TreeNode seventyFive=new TreeNode(75,null,null);
        TreeNode ten=new TreeNode(10,five,fiveteen);
        TreeNode therty=new TreeNode(30,twentyFive,thertyFive);
        TreeNode fivty=new TreeNode(50,fourtyFive,fivtyFive);
        TreeNode seventy=new TreeNode(70,sixtyFive,seventyFive);
        TreeNode twenty=new TreeNode(20,ten,therty);
        TreeNode sixty=new TreeNode(60,fivty,seventy);
        TreeNode head=new TreeNode(40,twenty,sixty);
        BinaryTreeUtil.addNode(null,head);
        Integer maxDepth=BinaryTreeUtil.minDepth(head);
        Assert.assertEquals(4L,maxDepth.longValue());
    }


    @Test
    public void findMinDepthFromEvenTree3(){
        TreeNode therty=new TreeNode(30,null,null);
        TreeNode fivty=new TreeNode(50,null,null);
        TreeNode twenty=new TreeNode(20,null,null);
        TreeNode eighty=new TreeNode(80,null,null);
        TreeNode fourty=new TreeNode(40,therty,fivty);
        TreeNode seventy=new TreeNode(70,twenty,eighty);
        TreeNode head=new TreeNode(60,fourty,seventy);
        BinaryTreeUtil.addNode(null,head);
        Integer maxDepth=BinaryTreeUtil.minDepth(head);
        Assert.assertEquals(3L, maxDepth.longValue());
    }






}
