package com.learn.binarytree;

import org.junit.Assert;

public class TestUtil {

    public static void validateNode(TreeNode node,Integer value,Integer leftValue,Integer rightValue){
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


    public static void validateNodeWithNoGrandSons(TreeNode node,Integer value,Integer leftValue,Integer rightValue){
        Boolean result=true;
        if(node==null && value==null){
            return;
        }
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

    public static Boolean hasChild(TreeNode node){
        if(node.left!=null || node.left!=null){
            return true;
        }
        return false;
    }
}
