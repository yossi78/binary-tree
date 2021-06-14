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


    public static void removeNode(TreeNode head, Integer value){
        doRemoveNode(head,value);
    }

    private static void doRemoveNode(TreeNode currentNode,Integer val) {
        if(currentNode==null || currentNode.val==val){
            currentNode=null;
            return;
        }
        if(currentNode.right.val==val && currentNode.left==null){
            currentNode.right=currentNode.right.right;
            return;
        }
        if(currentNode.left.val==val && currentNode.right==null){
            currentNode.left=currentNode.left.left;
            return;
        }


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
            return min;
        }
        if(rightMin<min){
            min=rightMin;
            return min;
        }
        return min;
    }




}



