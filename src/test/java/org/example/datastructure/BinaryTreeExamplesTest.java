package org.example.datastructure;

import com.sun.source.tree.Tree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeExamplesTest {

    BinaryTreeExamples binaryTreeExamples = new BinaryTreeExamples();


     TreeNode buildTree() {
        TreeNode root = new TreeNode(3);

        TreeNode left = new TreeNode(11);

        TreeNode right = new TreeNode(12);
        TreeNode leftleft = new TreeNode(13);

        root.left = left;
        root.right = right;
        root.left.left = leftleft;

        return root;
    }

    @Test
    void testInOrder() {
         TreeNode root = buildTree();
         binaryTreeExamples.inOrder(root);
    }

    @Test
    void testPreOrder() {
        TreeNode root = buildTree();
        binaryTreeExamples.preOrder(root);
    }

    @Test
    void getSum() {
         TreeNode root = buildTree();
         int result = binaryTreeExamples.sumOfBinaryTree(root);
         assertEquals(6, result);
    }

    @Test
    void getHeight() {
         TreeNode root = buildTree();
         int result = binaryTreeExamples.height(root);
         assertEquals(2, result);
    }

    @Test
    void getSumofNodes() {
         TreeNode root = buildTree();
         int sum = binaryTreeExamples.sumOfAllNodes(root);
         assertEquals(6,sum);
    }
    @Test
    void testSumOfLeaf() {
        TreeNode root = buildTree();
        int sum = binaryTreeExamples.leafSum(root);
        assertEquals(25,sum);
    }
    @Test
    void testSumOfLeafWithEmptyTree() {
        TreeNode root =  null;
        int sum = binaryTreeExamples.leafSum(root);
        assertEquals(0, sum);
    }
    @Test
    void testPrintLevel() {
         TreeNode root = buildTree();
         binaryTreeExamples.printLevel(root);
    }
}