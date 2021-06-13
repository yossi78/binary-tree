package com.learn.binarytree;
import org.junit.Assert;
import org.junit.jupiter.api.Test;





public class AddNodeTest {


    @Test
    public void addJustHead(){
        TreeNode head=new TreeNode(3,null,null);
        BinaryTreeUtil.addNode(null,head);
        Assert.assertEquals(head.right,null);
        Assert.assertEquals(head.left,null);
        Assert.assertEquals(head.val,3);
    }


    @Test
    public void addToMostRight(){
        Integer[]arr={5,6,7,8,9};
        TreeNode head=BinaryTreeUtil.addNode(arr);
        BinaryTreeUtil.addNode(head,new TreeNode(10,null,null));
        Assert.assertEquals(head.val,5);
        Assert.assertEquals(head.right.val,6);
        Assert.assertEquals(head.left,null);
        Assert.assertEquals(head.right.val,6);
        Assert.assertEquals(head.right.right.val,7);
        Assert.assertEquals(head.right.right.right.val,8);
        Assert.assertEquals(head.right.right.right.right.val,9);
        Assert.assertEquals(head.right.right.right.right.right.val,10);
        Assert.assertEquals(head.right.right.right.right.right.right,null);
        Assert.assertEquals(head.right.right.right.right.right.left,null);
    }


    @Test
    public void addToMiddleRight(){
        Integer[]arr={5,6,7,8,10,11,12};
        TreeNode nine=new TreeNode(9,null,null);
        TreeNode head=BinaryTreeUtil.addNode(arr);
        BinaryTreeUtil.addNode(head,nine);
        Assert.assertEquals(head.val,5);
        Assert.assertEquals(head.right.val,6);
        Assert.assertEquals(head.left,null);
        Assert.assertEquals(head.right.val,6);
        Assert.assertEquals(head.right.right.val,7);
        Assert.assertEquals(head.right.right.right.val,8);
        Assert.assertEquals(head.right.right.right.right.val,10);
        Assert.assertEquals(head.right.right.right.right.left.val,9);
        Assert.assertEquals(head.right.right.right.right.right.val,11);
        Assert.assertEquals(head.right.right.right.right.right.right.val,12);
        Assert.assertEquals(head.right.right.right.right.right.right.right,null);
        Assert.assertEquals(head.right.right.right.right.right.right.left,null);
    }



    @Test
    public void addToMostLeft(){
        Integer[]arr={10,20,30,9,8,7,6};
        TreeNode head=BinaryTreeUtil.addNode(arr);
        TreeNode five=new TreeNode(5,null,null);
        BinaryTreeUtil.addNode(head,five);
        Assert.assertEquals(head.val,10);
        Assert.assertEquals(head.left.val,9);
        Assert.assertEquals(head.right.val,20);
        Assert.assertEquals(head.right.val,20);
        Assert.assertEquals(head.right.left,null);
        Assert.assertEquals(head.right.right.val,30);
        Assert.assertEquals(head.right.right.val,30);
        Assert.assertEquals(head.right.right.left,null);
        Assert.assertEquals(head.right.right.right,null);
        Assert.assertEquals(head.left.val,9);
        Assert.assertEquals(head.left.left.val,8);
        Assert.assertEquals(head.left.right,null);
        TreeNode eight=head.left.left;
        Assert.assertEquals(eight.val,8);
        Assert.assertEquals(eight.left.val,7);
        Assert.assertEquals(eight.right,null);
        TreeNode seven=head.left.left.left;
        Assert.assertEquals(seven.val,7);
        Assert.assertEquals(seven.left.val,6);
        Assert.assertEquals(seven.right,null);
        TreeNode six=head.left.left.left.left;
        Assert.assertEquals(six.val,6);
        Assert.assertEquals(six.left.val,5);
        Assert.assertEquals(six.right,null);
        Assert.assertEquals(six.left.val,5);
        Assert.assertEquals(six.left.left,null);
        Assert.assertEquals(six.left.right,null);
    }


    @Test
    public void addToMiddleLeft(){
        Integer[]arr={10,20,30,9,8,7,5,4,3};
        TreeNode head=BinaryTreeUtil.addNode(arr);
        TreeNode six=new TreeNode(6,null,null);
        BinaryTreeUtil.addNode(head,six);
        Assert.assertEquals(head.val,10);
        Assert.assertEquals(head.left.val,9);
        Assert.assertEquals(head.right.val,20);
        Assert.assertEquals(head.right.val,20);
        Assert.assertEquals(head.right.left,null);
        Assert.assertEquals(head.right.right.val,30);
        Assert.assertEquals(head.right.right.val,30);
        Assert.assertEquals(head.right.right.left,null);
        Assert.assertEquals(head.right.right.right,null);
        Assert.assertEquals(head.left.val,9);
        Assert.assertEquals(head.left.left.val,8);
        Assert.assertEquals(head.left.right,null);
        TreeNode eight=head.left.left;
        Assert.assertEquals(eight.val,8);
        Assert.assertEquals(eight.left.val,7);
        Assert.assertEquals(eight.right,null);
        TreeNode seven=head.left.left.left;
        Assert.assertEquals(seven.val,7);
        Assert.assertEquals(seven.left.val,5);
        Assert.assertEquals(seven.right,null);
        TreeNode five=seven.left;
        Assert.assertEquals(five.val,5);
        Assert.assertEquals(five.left.val,4);
        Assert.assertEquals(five.right.val,6);
        TreeNode newSix=five.right;
        Assert.assertEquals(newSix.val,6);
        Assert.assertEquals(newSix.left,null);
        Assert.assertEquals(newSix.right,null);
        Assert.assertEquals(five.left.val,4);
        Assert.assertEquals(five.left.left.val,3);
        Assert.assertEquals(five.left.right,null);
        TreeNode three=five.left.left;
        Assert.assertEquals(three.val,3);
        Assert.assertEquals(three.left,null);
        Assert.assertEquals(three.right,null);
    }


    @Test
    public void createfourLevelTree(){
        Integer[]arr={80,40,300,20,50,200,500,10,25,45,60,100,250,400,700};
        TreeNode head=BinaryTreeUtil.addNode(arr);
        Assert.assertEquals(head.val,80);
        Assert.assertEquals(head.left.val,40);
        Assert.assertEquals(head.right.val,300);
        TreeNode fourty=head.left;
        Assert.assertEquals(fourty.val,40);
        Assert.assertEquals(fourty.left.val,20);
        Assert.assertEquals(fourty.right.val,50);
        TreeNode treeHundriess=head.right;
        Assert.assertEquals(treeHundriess.val,300);
        Assert.assertEquals(treeHundriess.left.val,200);
        Assert.assertEquals(treeHundriess.right.val,500);
        TreeNode twenty=fourty.left;
        Assert.assertEquals(twenty.val,20);
        Assert.assertEquals(twenty.left.val,10);
        Assert.assertEquals(twenty.right.val,25);
        TreeNode fivty=fourty.right;
        Assert.assertEquals(fivty.val,50);
        Assert.assertEquals(fivty.left.val,45);
        Assert.assertEquals(fivty.right.val,60);
        TreeNode twoHundried=treeHundriess.left;
        Assert.assertEquals(twoHundried.val,200);
        Assert.assertEquals(twoHundried.left.val,100);
        Assert.assertEquals(twoHundried.right.val,250);
        TreeNode fiveHundried=treeHundriess.right;
        Assert.assertEquals(fiveHundried.val,500);
        Assert.assertEquals(fiveHundried.left.val,400);
        Assert.assertEquals(fiveHundried.right.val,700);
        Assert.assertEquals(twenty.left.left,null);
        Assert.assertEquals(twenty.left.right,null);
        Assert.assertEquals(twenty.right.left,null);
        Assert.assertEquals(twenty.right.right,null);
        Assert.assertEquals(fivty.left.left,null);
        Assert.assertEquals(fivty.left.right,null);
        Assert.assertEquals(fivty.right.left,null);
        Assert.assertEquals(fivty.right.right,null);
        Assert.assertEquals(twoHundried.left.left,null);
        Assert.assertEquals(twoHundried.left.right,null);
        Assert.assertEquals(twoHundried.right.left,null);
        Assert.assertEquals(twoHundried.right.right,null);
        Assert.assertEquals(fiveHundried.left.left,null);
        Assert.assertEquals(fiveHundried.left.right,null);
        Assert.assertEquals(fiveHundried.right.left,null);
        Assert.assertEquals(fiveHundried.right.right,null);
    }

}
