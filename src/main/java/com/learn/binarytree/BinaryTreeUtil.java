package com.learn.binarytree;
public class BinaryTreeUtil {



// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//           INVERT BINARY TREE
// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    public static TreeNode invertTree(TreeNode root) {
        return doInvertTree(root,root);
    }

    public static TreeNode doInvertTree(TreeNode root,TreeNode currentNode) {
        if(root==null || isSingle(currentNode)){
            return root;
        }
        if(hasOneChild(currentNode)){
            invertChilds(currentNode);
        }
        if(hasLeftOnly(currentNode)){
            return doInvertTree(root,currentNode.left);
        }
        if(hasRightOnly(currentNode)){
            return doInvertTree(root,currentNode.right);
        }
        doInvertTree(root,currentNode.left);
        doInvertTree(root,currentNode.right);
        return root;
    }


    private static void invertChilds(TreeNode node){
        TreeNode oldLeft=node.left;
        node.left=node.right;
        node.right=oldLeft;
    }

// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//           SEARCH FOR SUB-TREE
// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------


    public static TreeNode searchBST(TreeNode currentNode, int val) {
        if(currentNode==null){
            return null;
        }
        if(currentNode.val==val){
            return currentNode;
        }
        if(currentNode.right!=null && currentNode.val==val){
            return currentNode.right;
        }
        if(currentNode.left!=null && currentNode.left.val==val){
            return currentNode.left;
        }
        TreeNode rightCase=searchBST(currentNode.right,val);
        if(rightCase!=null){
            return rightCase;
        }else{
            return searchBST(currentNode.left,val);
        }
    }

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


    public static Integer minDepth(TreeNode currentNode) {
        if(currentNode==null){
            return 0;
        }
        return findMinDepth(currentNode,1);
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
        if(arr.length==0){
            return null;
        }
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
       if(currentNode.val==val){
           replaceNodeWithLowestValueFromRightSubTree(currentNode,currentNode);
       }
       if(checkOneChildWithTargetValue(currentNode,val)){
           return true;
       }
       if(checkTwoChildWhichOneHasTargetValue(currentNode,val)){
           return true;
       }
       if(removeNode(currentNode.right,val)){
           return true;
       }else{
           return removeNode(currentNode.left,val);
       }
    }


    private static boolean checkOneChildWithTargetValue(TreeNode currentNode, Integer val) {
        if(nodeHasOnlyRightChildWithTargetValue(currentNode,val)){
            currentNode.right=currentNode.right.right;
            return true;
        }
        if(nodeHasOnlyLeftChildWithTargetValue(currentNode,val)){
            currentNode.left=currentNode.left.left;
            return true;
        }
        return false;
    }

    private static boolean checkTwoChildWhichOneHasTargetValue(TreeNode currentNode, Integer val) {
        TreeNode targetNode=findTargetNodeFromTwoSons(currentNode,val);
        if(targetNode==null){
            return false;
        }
        replaceNodeWithLowestValueFromRightSubTree(currentNode,targetNode);
        return true;
    }



    private static Boolean replaceNodeWithLowestValueFromRightSubTree(TreeNode parentOfTargetNode, TreeNode targetNode){
        Integer minFromRightSubTree=findMinValue(targetNode.right);
        if(minFromRightSubTree!=null){
            removeNode(targetNode,minFromRightSubTree);
            targetNode.val=minFromRightSubTree;
        }else{
            setNullToSonWithValueAsTargetNode(parentOfTargetNode,targetNode);
        }
        return true;

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




    private static Boolean isSingle(TreeNode node){
        return (node!=null && node.left==null && node.right==null);
    }

    private static Boolean hasRightOnly(TreeNode node){
        return (node!=null && node.left==null && node.right!=null);
    }

    private static Boolean hasLeftOnly(TreeNode node){
        return (node!=null && node.left!=null && node.right==null);
    }

    private static Boolean hasTwoChilds(TreeNode node){
        return (node!=null && node.left!=null && node.right!=null);
    }

    private static Boolean hasOneChild(TreeNode node){
        if(node!=null && (node.right!=null || node.left!=null)){
            return true;
        }
        return false;
    }

}



