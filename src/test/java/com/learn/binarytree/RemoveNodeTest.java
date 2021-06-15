package com.learn.binarytree;
import org.junit.Assert;
import org.junit.Test;




public class RemoveNodeTest {




    @Test
    public void removeMostLeftNode(){
        Integer[]arr={80,40,300,20,50,200,500,10,25,45,60,100,250,400,700};
        TreeNode head=BinaryTreeUtil.addNode(arr);
        BinaryTreeUtil.removeNode(head,10);
        validateNode(head,80,40,300);
        TreeNode fourty=head.left;
        validateNode(fourty,40,20,50);
        TreeNode twenty=head.left.left;
        validateNodeWithNoGrandSons(twenty,20,null,25);
        TreeNode fivety=head.left.right;
        validateNodeWithNoGrandSons(fivety,50,45,60);
        TreeNode threeHundried=head.right;
        validateNode(threeHundried,300,200,500);
        TreeNode twoHundried=threeHundried.left;
        validateNodeWithNoGrandSons(twoHundried,200,100,250);
        TreeNode fiveHundried=threeHundried.right;
        validateNodeWithNoGrandSons(fiveHundried,500,400,700);
    }



    @Test
    public void removeLeftNodeWithNoGrandSons(){
        Integer[]arr={80,40,300,20,50,200,500,10,25,45,60,100,250,400,700};
        TreeNode head=BinaryTreeUtil.addNode(arr);
        BinaryTreeUtil.removeNode(head,20);
        validateNode(head,80,40,300);
        TreeNode fourty=head.left;
        validateNode(fourty,40,25,50);
        TreeNode twentyFive=head.left.left;
        validateNodeWithNoGrandSons(twentyFive,25,10,null);
        TreeNode fivety=head.left.right;
        validateNodeWithNoGrandSons(fivety,50,45,60);
        TreeNode threeHundried=head.right;
        validateNode(threeHundried,300,200,500);
        TreeNode twoHundried=threeHundried.left;
        validateNodeWithNoGrandSons(twoHundried,200,100,250);
        TreeNode fiveHundried=threeHundried.right;
        validateNodeWithNoGrandSons(fiveHundried,500,400,700);
    }






    private static  void validateNode(TreeNode node,Integer value,Integer leftValue,Integer rightValue){
        Boolean result=true;
        if(node.val!=value){
            result=false;
        }
        if(leftValue==null && node.left!=null){
            result=false;
        }
        if(rightValue==null && node.right!=null){
            result=false;
        }
        if(leftValue!=null && leftValue!=node.left.val){
            result=false;
        }
        if(rightValue!=null && rightValue!=node.right.val){
            result=false;
        }
        Assert.assertTrue(result);
    }





    private static  void validateNodeWithNoGrandSons(TreeNode node,Integer value,Integer leftValue,Integer rightValue){
        Boolean result=true;
        if(node.val!=value){
            result=false;
        }
        if(leftValue==null && node.left!=null){
            result=false;
        }
        if(rightValue==null && node.right!=null){
            result=false;
        }
        if(leftValue!=null && leftValue!=node.left.val){
            result=false;
        }
        if(rightValue!=null && rightValue!=node.right.val){
            result=false;
        }
        if(leftValue!=null &&  hasChild(node.left)){
            result=false;
        }
        if(rightValue!=null && hasChild(node.right)){
            result=false;
        }
        Assert.assertTrue(result);
    }



    private static Boolean hasChild(TreeNode node){
        if(node.left!=null || node.left!=null){
            return true;
        }
        return false;
    }







}
