package com.learn.binarytree;


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

    public static void addNode(TreeNode head,Integer[] arr){
        for(int i=0;i<arr.length;i++){
            doAddNode(head,new TreeNode(arr[i],null,null));
        }
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


    public static void removeNode(TreeNode head, TreeNode targetNode){
        doRemoveNode(head,targetNode);
    }


    private static void doRemoveNode(TreeNode currentNode, TreeNode targetNode) {
        if(currentNode==null || targetNode==null){
            return ;
        }
        if(currentNode.equals(targetNode)){
            currentNode=null;
            return;
        }
        if(currentNode.right.equals(targetNode)){
            if(currentNode.right.right==null && currentNode.right.left==null){
                currentNode.right=null;
            }
            else if(currentNode.right.left==null){
                currentNode.right=currentNode.right.right;
            }
            else if(currentNode.right.left.val> currentNode.val){
                currentNode.right.left.right=currentNode.right.right;
                currentNode.right=currentNode.right.left;
            }
            else if(currentNode.right.left.val< currentNode.val){
                currentNode.right.right.left=currentNode.right.left;
                currentNode.right=currentNode.right.right;
            }
        }
        if(currentNode.left.equals(targetNode)){
            if(currentNode.left.left==null && currentNode.left.right==null){
                currentNode.left=null;
            }
            else if(currentNode.left.right==null){
                currentNode.left=currentNode.left.left;
            }
            else if(currentNode.left.right.val> currentNode.val){
                currentNode.left.left.right=currentNode.left.right;
                currentNode.left=currentNode.left.left;
            }
            else if(currentNode.left.right.val< currentNode.val){
                currentNode.left.right.left=currentNode.left.left;
                currentNode.left=currentNode.left.right;
            }

        }

    }



}



