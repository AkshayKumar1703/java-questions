package org.example.datastructure;

import com.sun.source.tree.Tree;

public class BinaryTreeExamples {

    int sum = 0;

    public int sumOfBinaryTree(TreeNode root) {
        sumOfNodes(root);
        return sum;
    }

    public void sumOfNodes(TreeNode root) {
        if (root == null) return;

        sumOfNodes(root.left);
        sum = sum + root.value;
        sumOfNodes(root.right);
    }

    public void inOrder(TreeNode root) {
        if (root == null) return;

        inOrder(root.left);
        System.out.println(root.value);
        inOrder(root.right);
    }

    public void preOrder(TreeNode root) {
        if (root == null) return;

        System.out.println(root.value);
        inOrder(root.left);
        inOrder(root.right);
    }

    public Integer height(TreeNode root) {
        if (root == null) return 0;

        Integer leftHeight = height(root.left);
        Integer rightHeight = height(root.right);

        return 1 + Math.max(leftHeight, rightHeight);
    }

    public Integer sumOfAllNodes(TreeNode root) {
        if (root == null) return 0;

        int leftSum = sumOfAllNodes(root.left);
        int rightSum = sumOfAllNodes(root.right);

        int finalSum = root.value + leftSum + rightSum;
        return finalSum;
    }

    public boolean isLeaf(TreeNode root) {
        if (root == null) return false;

        if (root.right == null && root.left == null)
            return true;
        return false;
    }

    public int leafSum(TreeNode root) {
        if (root == null) return 0;

        if (isLeaf(root))
                return root.value;

        int leftLeaf = leafSum(root.left);
        int rightLeaf = leafSum(root.right);

        return leftLeaf + rightLeaf;
    }
}

