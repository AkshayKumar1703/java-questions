package org.example.datastructure;

import com.sun.source.tree.Tree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeExamplesTest {

    BinaryTreeExamples binaryTreeExamples = new BinaryTreeExamples();


     TreeNode buildTree() {
        TreeNode root = new TreeNode(3);

        TreeNode left = new TreeNode(2);

        TreeNode right = new TreeNode(1);

        root.left = left;
        root.right = right;

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

}