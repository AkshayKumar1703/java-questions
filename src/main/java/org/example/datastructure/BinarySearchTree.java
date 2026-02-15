package org.example.datastructure;

public class BinarySearchTree {

    public TreeNode root;

    public void insert(int value) {
        root = insertRecursive(root, value);
    }

    public TreeNode insertRecursive(TreeNode node, int value) {
        if (node == null) {
            return new TreeNode(value);
        }

        if (value < node.value) {
            node.left = insertRecursive(node.left, value);
        } else if (value > node.value) {
            node.right = insertRecursive(node.right, value);
        }

        return node;
    }

    public void printInOrder() {
        inorder(root);
        System.out.println();
    }

    public void inorder(TreeNode node) {
        if (node == null) return;

        inorder(node.left);
        System.out.print(node.value + " ");
        inorder(node.right);
    }
}
