package com.learn.binarytree;
import org.junit.Test;




public class RemoveNodeTest {


    @Test
    public void removeMostRightNode(){
        Integer[]arr={80,40,300,20,50,200,500,10,25,45,60,100,250,400,700};
        TreeNode head=BinaryTreeUtil.addNode(arr);
        BinaryTreeUtil.removeNode(head,700);
        TestUtil.validateNode(head,80,40,300);
        TreeNode fourty=head.left;
        TestUtil.validateNode(fourty,40,20,50);
        TreeNode threeHundried=head.right;
        TestUtil.validateNode(threeHundried,300,200,500);
        TreeNode twenty=fourty.left;
        TestUtil.validateNodeWithNoGrandSons(twenty,20,10,25);
        TreeNode fivety=fourty.right;
        TestUtil.validateNodeWithNoGrandSons(fivety,50,45,60);
        TreeNode twoHundried=threeHundried.left;
        TestUtil.validateNodeWithNoGrandSons(twoHundried,200,100,250);
        TreeNode fiveHundried=threeHundried.right;
        TestUtil.validateNodeWithNoGrandSons(fiveHundried,500,400,null);
    }


    @Test
    public void removeMostLeftNode(){
        Integer[]arr={80,40,300,20,50,200,500,10,25,45,60,100,250,400,700};
        TreeNode head=BinaryTreeUtil.addNode(arr);
        BinaryTreeUtil.removeNode(head,10);
        TestUtil.validateNode(head,80,40,300);
        TreeNode fourty=head.left;
        TestUtil.validateNode(fourty,40,20,50);
        TreeNode twenty=head.left.left;
        TestUtil.validateNodeWithNoGrandSons(twenty,20,null,25);
        TreeNode fivety=head.left.right;
        TestUtil.validateNodeWithNoGrandSons(fivety,50,45,60);
        TreeNode threeHundried=head.right;
        TestUtil.validateNode(threeHundried,300,200,500);
        TreeNode twoHundried=threeHundried.left;
        TestUtil.validateNodeWithNoGrandSons(twoHundried,200,100,250);
        TreeNode fiveHundried=threeHundried.right;
        TestUtil.validateNodeWithNoGrandSons(fiveHundried,500,400,700);
    }



    @Test
    public void removeLeftLeafNodeFromMiddleOfTree(){
        Integer[]arr={80,40,300,20,50,200,500,10,25,45,60,100,250,400,700};
        TreeNode head=BinaryTreeUtil.addNode(arr);
        BinaryTreeUtil.removeNode(head,100);
        TestUtil.validateNode(head,80,40,300);
        TreeNode fourty=head.left;
        TestUtil.validateNode(fourty,40,20,50);
        TreeNode threeHundried=head.right;
        TestUtil.validateNode(threeHundried,300,200,500);
        TreeNode twenty=fourty.left;
        TestUtil.validateNodeWithNoGrandSons(twenty,20,10,25);
        TreeNode fivety=fourty.right;
        TestUtil.validateNodeWithNoGrandSons(fivety,50,45,60);
        TreeNode twoHundried=threeHundried.left;
        TestUtil.validateNodeWithNoGrandSons(twoHundried,200,null,250);
        TreeNode fiveHundried=threeHundried.right;
        TestUtil.validateNodeWithNoGrandSons(fiveHundried,500,400,700);
    }



    @Test
    public void removeRightLeafNodeFromMiddleOfTree(){
        Integer[]arr={80,40,300,20,50,200,500,10,25,45,60,100,250,400,700};
        TreeNode head=BinaryTreeUtil.addNode(arr);
        BinaryTreeUtil.removeNode(head,250);
        TestUtil.validateNode(head,80,40,300);
        TreeNode fourty=head.left;
        TestUtil.validateNode(fourty,40,20,50);
        TreeNode threeHundried=head.right;
        TestUtil.validateNode(threeHundried,300,200,500);
        TreeNode twenty=fourty.left;
        TestUtil.validateNodeWithNoGrandSons(twenty,20,10,25);
        TreeNode fivety=fourty.right;
        TestUtil.validateNodeWithNoGrandSons(fivety,50,45,60);
        TreeNode twoHundried=threeHundried.left;
        TestUtil.validateNodeWithNoGrandSons(twoHundried,200,100,null);
        TreeNode fiveHundried=threeHundried.right;
        TestUtil.validateNodeWithNoGrandSons(fiveHundried,500,400,700);
    }



    @Test
    public void removeParentOfLeafsFromLeftSide(){
        Integer[]arr={80,40,300,20,50,200,500,10,25,45,60,100,250,400,700};
        TreeNode head=BinaryTreeUtil.addNode(arr);
        BinaryTreeUtil.removeNode(head,20);
        TestUtil.validateNode(head,80,40,300);
        TreeNode fourty=head.left;
        TestUtil.validateNode(fourty,40,25,50);
        TreeNode twentyFive=head.left.left;
        TestUtil.validateNodeWithNoGrandSons(twentyFive,25,10,null);
        TreeNode fivety=head.left.right;
        TestUtil.validateNodeWithNoGrandSons(fivety,50,45,60);
        TreeNode threeHundried=head.right;
        TestUtil.validateNode(threeHundried,300,200,500);
        TreeNode twoHundried=threeHundried.left;
        TestUtil.validateNodeWithNoGrandSons(twoHundried,200,100,250);
        TreeNode fiveHundried=threeHundried.right;
        TestUtil.validateNodeWithNoGrandSons(fiveHundried,500,400,700);
    }



    @Test
    public void removeParentOfLeafsFromRightSide(){
        Integer[]arr={80,40,300,20,50,200,500,10,25,45,60,100,250,400,700};
        TreeNode head=BinaryTreeUtil.addNode(arr);
        BinaryTreeUtil.removeNode(head,500);
        TestUtil.validateNode(head,80,40,300);
        TreeNode fourty=head.left;
        TestUtil.validateNode(fourty,40,20,50);
        TreeNode threeHundried=head.right;
        TestUtil.validateNode(threeHundried,300,200,700);
        TreeNode twenty=fourty.left;
        TestUtil.validateNodeWithNoGrandSons(twenty,20,10,25);
        TreeNode fivety=fourty.right;
        TestUtil.validateNodeWithNoGrandSons(fivety,50,45,60);
        TreeNode twoHundried=threeHundried.left;
        TestUtil.validateNodeWithNoGrandSons(twoHundried,200,100,250);
        TreeNode sevenHundried=threeHundried.right;
        TestUtil.validateNodeWithNoGrandSons(sevenHundried,700,400,null);
    }



    @Test
    public void removeGrantFatherFromLeftSide(){
        Integer[]arr={80,40,300,20,50,200,500,10,25,45,60,100,250,400,700};
        TreeNode head=BinaryTreeUtil.addNode(arr);
        BinaryTreeUtil.removeNode(head,40);
        TestUtil.validateNode(head,80,45,300);
        TreeNode fourtyFive=head.left;
        TestUtil.validateNode(fourtyFive,45,20,50);
        TreeNode threeHundried=head.right;
        TestUtil.validateNode(threeHundried,300,200,500);
        TreeNode twenty=fourtyFive.left;
        TestUtil.validateNodeWithNoGrandSons(twenty,20,10,25);
        TreeNode fivety=fourtyFive.right;
        TestUtil.validateNodeWithNoGrandSons(fivety,50,null,60);
        TreeNode twoHundried=threeHundried.left;
        TestUtil.validateNodeWithNoGrandSons(twoHundried,200,100,250);
        TreeNode fiveHundried=threeHundried.right;
        TestUtil.validateNodeWithNoGrandSons(fiveHundried,500,400,700);
    }



    @Test
    public void removeGrantFatherFromRightSide(){
        Integer[]arr={80,40,300,20,50,200,500,10,25,45,60,100,250,400,700};
        TreeNode head=BinaryTreeUtil.addNode(arr);
        BinaryTreeUtil.removeNode(head,300);
        TestUtil.validateNode(head,80,40,400);
        TreeNode fourty=head.left;
        TestUtil.validateNode(fourty,40,20,50);
        TreeNode fourHundried=head.right;
        TestUtil.validateNode(fourHundried,400,200,500);
        TreeNode twenty=fourty.left;
        TestUtil.validateNodeWithNoGrandSons(twenty,20,10,25);
        TreeNode fivety=fourty.right;
        TestUtil.validateNodeWithNoGrandSons(fivety,50,45,60);
        TreeNode twoHundried=fourHundried.left;
        TestUtil.validateNodeWithNoGrandSons(twoHundried,200,100,250);
        TreeNode fiveHundried=fourHundried.right;
        TestUtil.validateNodeWithNoGrandSons(fiveHundried,500,null,700);
    }



    @Test
    public void removeHeadNode(){
        Integer[]arr={80,40,300,20,50,200,500,10,25,45,60,100,250,400,700};
        TreeNode head=BinaryTreeUtil.addNode(arr);
        BinaryTreeUtil.removeNode(head,80);
        TestUtil.validateNode(head,100,40,300);
        TreeNode fourty=head.left;
        TestUtil.validateNode(fourty,40,20,50);
        TreeNode threeHundried=head.right;
        TestUtil.validateNode(threeHundried,300,200,500);
        TreeNode twenty=fourty.left;
        TestUtil.validateNodeWithNoGrandSons(twenty,20,10,25);
        TreeNode fivety=fourty.right;
        TestUtil.validateNodeWithNoGrandSons(fivety,50,45,60);
        TreeNode twoHundried=threeHundried.left;
        TestUtil.validateNodeWithNoGrandSons(twoHundried,200,null,250);
        TreeNode fiveHundried=threeHundried.right;
        TestUtil.validateNodeWithNoGrandSons(fiveHundried,500,400,700);

    }


}
