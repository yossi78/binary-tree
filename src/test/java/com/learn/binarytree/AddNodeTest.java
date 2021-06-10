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
        TreeNode nine=new TreeNode(9,null,null);
        TreeNode eight=new TreeNode(8,null,nine);
        TreeNode seven=new TreeNode(7,null,eight);
        TreeNode six=new TreeNode(6,null,seven);
        TreeNode head=new TreeNode(5,null,six);
        TreeNode ten=new TreeNode(10,null,null);
        BinaryTreeUtil.addNode(null,head);
        BinaryTreeUtil.addNode(head,ten);
        Assert.assertEquals(head.val,5);
        Assert.assertEquals(head.right,six);
        Assert.assertEquals(head.left,null);
        Assert.assertEquals(six.right,seven);
        Assert.assertEquals(seven.right,eight);
        Assert.assertEquals(eight.right,nine);
        Assert.assertEquals(nine.right,ten);
        Assert.assertEquals(ten.right,null);
        Assert.assertEquals(ten.left,null);
    }


    @Test
    public void addToMiddleRight(){
        TreeNode twelve=new TreeNode(12,null,null);
        TreeNode eleven=new TreeNode(11,null,twelve);
        TreeNode ten=new TreeNode(10,null,eleven);
        TreeNode eight=new TreeNode(8,null,ten);
        TreeNode seven=new TreeNode(7,null,eight);
        TreeNode six=new TreeNode(6,null,seven);
        TreeNode head=new TreeNode(5,null,six);
        TreeNode nine=new TreeNode(9,null,null);
        BinaryTreeUtil.addNode(null,head);
        BinaryTreeUtil.addNode(head,nine);
        Assert.assertEquals(head.val,5);
        Assert.assertEquals(head.right,six);
        Assert.assertEquals(head.left,null);
        Assert.assertEquals(six.right,seven);
        Assert.assertEquals(seven.right,eight);
        Assert.assertEquals(eight.right,ten);
        Assert.assertEquals(ten.left,nine);
        Assert.assertEquals(ten.right,eleven);
        Assert.assertEquals(eleven.right,twelve);
        Assert.assertEquals(twelve.right,null);
        Assert.assertEquals(twelve.left,null);
    }


    @Test
    public void addToMostLeft(){
        TreeNode six=new TreeNode(6,null,null);
        TreeNode seven=new TreeNode(7,six,null);
        TreeNode eight=new TreeNode(8,seven,null);
        TreeNode nine=new TreeNode(9,eight,null);
        TreeNode therty=new TreeNode(30,null,null);
        TreeNode twenty=new TreeNode(20,null,therty);
        TreeNode head=new TreeNode(10,nine,twenty);
        TreeNode five=new TreeNode(5,null,null);
        BinaryTreeUtil.addNode(null,head);
        BinaryTreeUtil.addNode(head,five);
        Assert.assertEquals(head.val,10);
        Assert.assertEquals(head.right,twenty);
        Assert.assertEquals(twenty.right,therty);
        Assert.assertEquals(therty.right,null);
        Assert.assertEquals(therty.left,null);
        Assert.assertEquals(head.left,nine);
        Assert.assertEquals(nine.left,eight);
        Assert.assertEquals(eight.left,seven);
        Assert.assertEquals(seven.left,six);
        Assert.assertEquals(six.left,five);
        Assert.assertEquals(six.right,null);
        Assert.assertEquals(five.right,null);
        Assert.assertEquals(five.left,null);
    }


    @Test
    public void addToMiddleLeft(){
        TreeNode three=new TreeNode(3,null,null);
        TreeNode four=new TreeNode(4,three,null);
        TreeNode five=new TreeNode(5,four,null);
        TreeNode seven=new TreeNode(7,five,null);
        TreeNode eight=new TreeNode(8,seven,null);
        TreeNode nine=new TreeNode(9,eight,null);
        TreeNode therty=new TreeNode(30,null,null);
        TreeNode twenty=new TreeNode(20,null,therty);
        TreeNode head=new TreeNode(10,nine,twenty);
        TreeNode six=new TreeNode(6,null,null);
        BinaryTreeUtil.addNode(null,head);
        BinaryTreeUtil.addNode(head,six);
        Assert.assertEquals(head.val,10);
        Assert.assertEquals(head.right,twenty);
        Assert.assertEquals(twenty.right,therty);
        Assert.assertEquals(therty.right,null);
        Assert.assertEquals(therty.left,null);
        Assert.assertEquals(head.left,nine);
        Assert.assertEquals(nine.left,eight);
        Assert.assertEquals(eight.left,seven);
        Assert.assertEquals(seven.left,five);
        Assert.assertEquals(five.right,six);
        Assert.assertEquals(five.left,four);
        Assert.assertEquals(six.left,null);
        Assert.assertEquals(six.right,null);
        Assert.assertEquals(four.left,three);
        Assert.assertEquals(three.right,null);
        Assert.assertEquals(three.left,null);
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
