package com.learn.binarytree;


import org.springframework.remoting.rmi.RmiClientInterceptorUtils;

public class BinaryTreeUtil {




// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//           FIND MAX DEPTH
// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------


    public static Integer findMaxDepth(TreeNode head){
        return doFindMaxDepth(head,1);
    }

    private static Integer doFindMaxDepth(TreeNode currentNode, int counter) {
        if(currentNode.right==null && currentNode.left==null){
            return counter;
        }
        if(currentNode.left==null){
            return doFindMaxDepth(currentNode.right,counter+1);
        }
        if(currentNode.right==null){
            return doFindMaxDepth(currentNode.left,counter+1);
        }
        Integer leftCounter = doFindMaxDepth(currentNode.left,counter+1);
        Integer rightCounter=doFindMaxDepth(currentNode.right,counter+1);
        if(rightCounter>leftCounter){
            return rightCounter;
        }else{
            return leftCounter;
        }
    }



// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//           FIND MIN DEPT
// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------


    public static Integer minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        return findMinDepth(root,1);
    }



    private static Integer findMinDepth(TreeNode current,Integer counter){
        if(current.left==null && current.right!=null){
            return findMinDepth(current.right,counter+1);
        }
        if(current.right==null && current.left!=null){
            return findMinDepth(current.left,counter+1);
        }
        if(current.left==null && current.right==null){
            return counter;
        }
        counter++;
        Integer leftCount=findMinDepth(current.left,counter);
        Integer rightCount=findMinDepth(current.right,counter);
        if(rightCount<leftCount){
            return rightCount;
        }
        return leftCount;

    }

// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//           ADD NEW NODE
// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    public static TreeNode addNode(Integer[] arr){
        TreeNode head=new TreeNode(arr[0],null,null);
        for(int i=0;i<arr.length;i++){
            doAddNode(head,new TreeNode(arr[i],null,null));
        }
        return head;
    }

    public static void addNode(TreeNode head,TreeNode newNode){
        doAddNode(head,newNode);
    }


    private static void doAddNode(TreeNode currentNode, TreeNode newNode) {
        if(currentNode==null){
            return;
        }
        if(newNode.val>currentNode.val){
            if(currentNode.right==null){
                currentNode.right=newNode;
                return;
            }else{
                doAddNode(currentNode.right,newNode);
                return;
            }
        }
        if(newNode.val<currentNode.val){
            if(currentNode.left==null){
                currentNode.left=newNode;
                return;
            }
            doAddNode(currentNode.left,newNode);
            return;
        }

    }



// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//           REMOVE NODE
// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------





    public static Boolean removeNode(TreeNode currentNode, Integer val) {
       if(currentNode==null){
           return false;
       }
       if(nodeHasOnlyRightChildWithTargetValue(currentNode,val)){
            currentNode.right=currentNode.right.right;
            return true;
       }
       if(nodeHasOnlyLeftChildWithTargetValue(currentNode,val)){
            currentNode.left=currentNode.left.left;
            return true;
       }
       TreeNode targetNode=findTargetNodeFromTwoSons(currentNode,val);
       if(targetNode!=null){
           Integer minFromRightSubTree=findMinValue(targetNode.right);
           if(minFromRightSubTree!=null){
               removeNode(targetNode,minFromRightSubTree);
               targetNode.val=minFromRightSubTree;
               return true;
           }else{
               setNullToSonWithValueAsTargetNode(currentNode,targetNode);
               return true;
           }
       }
       if(removeNode(currentNode.right,val)){
           return removeNode(currentNode.right,val);
       }else{
           return removeNode(currentNode.left,val);
       }
    }

    private static TreeNode findTargetNodeFromTwoSons(TreeNode currentNode, Integer val) {
        if(nodeHasTwoChildsAndRightWithTargetValue(currentNode,val)){
            return currentNode.right;
        }
        if(nodeHasTwoChildsAndLeftWithTargetValue(currentNode,val)){
            return currentNode.left;
        }
        return null;
    }

    private static Boolean isNodeHasTwoChilds(TreeNode node) {
        return node.left!=null && node.right!=null;
    }

    private static void setNullToSonWithValueAsTargetNode(TreeNode currentNode, TreeNode targetNode) {
        if(currentNode.left!=null && currentNode.left.val==targetNode.val){
            currentNode.left=null;
        }
        if(currentNode.right!=null && currentNode.right.val==targetNode.val){
            currentNode.right=null;
        }
    }

    private static boolean nodeHasTwoChildsAndLeftWithTargetValue(TreeNode currentNode, Integer val) {
        if(currentNode.left!=null && currentNode.right!=null && currentNode.left.val==val){
            return true;
        }
        return false;
    }

    private static boolean nodeHasTwoChildsAndRightWithTargetValue(TreeNode currentNode, Integer val) {
        if(currentNode.left!=null && currentNode.right!=null && currentNode.right.val==val){
            return true;
        }
        return false;
    }


    private static Boolean nodeHasOnlyRightChildWithTargetValue(TreeNode currentNode,Integer val){
        if(currentNode.right!=null && currentNode.left==null && currentNode.right.val==val ){
            return true;
        }
        return false;
    }

    private static Boolean nodeHasOnlyLeftChildWithTargetValue(TreeNode currentNode,Integer val){
        if(currentNode.left!=null && currentNode.right==null && currentNode.left.val==val ){
            return true;
        }
        return false;
    }


    public static Integer findMaxValue(TreeNode head){
        return doFindMaxValue(head,null);
    }

    private static Integer doFindMaxValue(TreeNode current, Integer max) {
        if(current==null){
            return max;
        }
        if(max==null || current.val>max){
            max=current.val;
        }
        Integer leftMax= doFindMaxValue(current.left,max);
        Integer rightMax=doFindMaxValue(current.right, max);
        if(leftMax>max){
            max=leftMax;
        }
        if(rightMax>max){
            max=rightMax;
        }
        return max;
    }


    public static Integer findMinValue(TreeNode head){
        return doFindMinValue(head,null);
    }

    private static Integer doFindMinValue(TreeNode current, Integer min) {
        if(current==null){
            return min;
        }
        if(min==null || current.val<min){
            min=current.val;
        }
        Integer leftMin= doFindMinValue(current.left,min);
        Integer rightMin=doFindMinValue(current.right, min);
        if(leftMin<min){
            min=leftMin;
        }
        if(rightMin<min){
            min=rightMin;
        }
        return min;
    }




}



