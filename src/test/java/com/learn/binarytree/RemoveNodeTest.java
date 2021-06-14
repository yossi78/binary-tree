package com.learn.binarytree;
import org.junit.Assert;
import org.junit.Test;




public class RemoveNodeTest {


    @Test
    public void noChildsRightest(){
        Integer[]arr={80,40,300,20,50,200,500,10,25,45,60,100,250,400,700};
        TreeNode head=BinaryTreeUtil.addNode(arr);
        Integer min=BinaryTreeUtil.findMinValue(head);
        System.out.println(min);
        //BinaryTreeUtil.removeNode(head,);

    }





    // OLD
//    @Test
//    public void removeLeftNodeWithRightBiggerThenCurrent(){
//        TreeNode five=new TreeNode(5,null,null);
//        TreeNode sixty=new TreeNode(60,null,null);
//        TreeNode therty=new TreeNode(30,null,null);
//        TreeNode ten=new TreeNode(10,five,sixty);
//        TreeNode head=new TreeNode(20,ten,therty);
//        BinaryTreeUtil.addNode(null,head);
//        BinaryTreeUtil.removeNode(head,ten);
//        Assert.assertEquals(head.val,20);
//        Assert.assertEquals(head.left,five);
//        Assert.assertEquals(head.right,therty);
//        Assert.assertEquals(five.val,5);
//        Assert.assertEquals(five.left,null);
//        Assert.assertEquals(five.right,sixty);
//        Assert.assertEquals(therty.val,30);
//        Assert.assertEquals(therty.left,null);
//        Assert.assertEquals(therty.right,null);
//        Assert.assertEquals(sixty.val,60);
//        Assert.assertEquals(sixty.left,null);
//        Assert.assertEquals(sixty.right,null);
//    }
//
//
//
//
//
//
//
//
//
//    @Test
//    public void removeLeftNodeWithRightSmallerThenCurrent(){
//        TreeNode five=new TreeNode(5,null,null);
//        TreeNode fiveteen=new TreeNode(15,null,null);
//        TreeNode therty=new TreeNode(30,null,null);
//        TreeNode ten=new TreeNode(10,five,fiveteen);
//        TreeNode head=new TreeNode(20,ten,therty);
//        BinaryTreeUtil.addNode(null,head);
//        BinaryTreeUtil.removeNode(head,ten);
//        Assert.assertEquals(head.val,20);
//        Assert.assertEquals(head.left,fiveteen);
//        Assert.assertEquals(head.right,therty);
//        Assert.assertEquals(fiveteen.val,15);
//        Assert.assertEquals(fiveteen.left,five);
//        Assert.assertEquals(fiveteen.right,null);
//        Assert.assertEquals(therty.val,30);
//        Assert.assertEquals(therty.left,null);
//        Assert.assertEquals(therty.right,null);
//        Assert.assertEquals(five.val,5);
//        Assert.assertEquals(five.left,null);
//        Assert.assertEquals(five.right,null);
//    }
//
//
//
//    @Test
//    public void removeRightNodeWithLeftSmallerThenCurrent(){
//        TreeNode five=new TreeNode(5,null,null);
//        TreeNode oneHundried=new TreeNode(100,null,null);
//        TreeNode ten=new TreeNode(10,null,null);
//        TreeNode therty=new TreeNode(30,five,oneHundried);
//        TreeNode head=new TreeNode(20,ten,therty);
//        BinaryTreeUtil.addNode(null,head);
//        BinaryTreeUtil.removeNode(head,therty);
//        Assert.assertEquals(head.val,20);
//        Assert.assertEquals(head.left,ten);
//        Assert.assertEquals(head.right,oneHundried);
//        Assert.assertEquals(ten.val,10);
//        Assert.assertEquals(ten.left,null);
//        Assert.assertEquals(ten.right,null);
//        Assert.assertEquals(oneHundried.val,100);
//        Assert.assertEquals(oneHundried.left,five);
//        Assert.assertEquals(oneHundried.right,null);
//        Assert.assertEquals(five.val,5);
//        Assert.assertEquals(five.left,null);
//        Assert.assertEquals(five.right,null);
//    }
//
//
//    @Test
//    public void removeRightNodeWithLeftBiggerThenCurrent(){
//        TreeNode twentyFive=new TreeNode(25,null,null);
//        TreeNode oneHundried=new TreeNode(100,null,null);
//        TreeNode ten=new TreeNode(10,null,null);
//        TreeNode therty=new TreeNode(30,twentyFive,oneHundried);
//        TreeNode head=new TreeNode(20,ten,therty);
//        BinaryTreeUtil.addNode(null,head);
//        BinaryTreeUtil.removeNode(head,therty);
//        Assert.assertEquals(head.val,20);
//        Assert.assertEquals(head.left,ten);
//        Assert.assertEquals(head.right,twentyFive);
//        Assert.assertEquals(ten.val,10);
//        Assert.assertEquals(ten.left,null);
//        Assert.assertEquals(ten.right,null);
//        Assert.assertEquals(twentyFive.val,25);
//        Assert.assertEquals(twentyFive.left,null);
//        Assert.assertEquals(twentyFive.right,oneHundried);
//        Assert.assertEquals(oneHundried.val,100);
//        Assert.assertEquals(oneHundried.left,null);
//        Assert.assertEquals(oneHundried.right,null);
//    }
//
//



}
