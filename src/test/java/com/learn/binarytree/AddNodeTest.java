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
        Assert.assertEquals(head.val,40);
        Assert.assertEquals(head.left,twenty);
        Assert.assertEquals(head.right,sixty);
        Assert.assertEquals(twenty.val,20);
        Assert.assertEquals(twenty.left,ten);
        Assert.assertEquals(twenty.right,therty);
        Assert.assertEquals(sixty.val,60);
        Assert.assertEquals(sixty.left,fivty);
        Assert.assertEquals(sixty.right,seventy);
        Assert.assertEquals(ten.val,10);
        Assert.assertEquals(ten.left,five);
        Assert.assertEquals(ten.right,fiveteen);
        Assert.assertEquals(therty.val,30);
        Assert.assertEquals(therty.left,twentyFive);
        Assert.assertEquals(therty.right,thertyFive);
        Assert.assertEquals(fivty.val,50);
        Assert.assertEquals(fivty.left,fourtyFive);
        Assert.assertEquals(fivty.right,fivtyFive);
        Assert.assertEquals(seventy.val,70);
        Assert.assertEquals(seventy.left,sixtyFive);
        Assert.assertEquals(seventy.right,seventyFive);
        Assert.assertEquals(five.left,null);
        Assert.assertEquals(five.right,null);
        Assert.assertEquals(fiveteen.left,null);
        Assert.assertEquals(fiveteen.right,null);
        Assert.assertEquals(twentyFive.left,null);
        Assert.assertEquals(twentyFive.right,null);
        Assert.assertEquals(thertyFive.left,null);
        Assert.assertEquals(thertyFive.right,null);
        Assert.assertEquals(fourtyFive.left,null);
        Assert.assertEquals(fourtyFive.right,null);
        Assert.assertEquals(fivtyFive.left,null);
        Assert.assertEquals(fivtyFive.right,null);
        Assert.assertEquals(sixtyFive.left,null);
        Assert.assertEquals(sixtyFive.right,null);
        Assert.assertEquals(seventyFive.left,null);
        Assert.assertEquals(seventyFive.right,null);

    }

}
