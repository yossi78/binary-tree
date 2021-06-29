package com.learn.binarytree;
import org.junit.Test;





public class SearchSubTree {


    @Test
    public void findParentWithoutGrandSonsFromLeftSide(){
        Integer[]arr={4,2,7,1,3};
        TreeNode head=BinaryTreeUtil.addNode(arr);
        TreeNode subTree=BinaryTreeUtil.searchBST(head,2);
        TestUtil.validateNodeWithNoGrandSons(subTree,2,1,3);
    }
}
