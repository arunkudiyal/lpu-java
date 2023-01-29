package com.company;

class TreeNode {
    int data;
    TreeNode left, right;
    TreeNode(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class BinarySearchTree {
    TreeNode root;

    BinarySearchTree() {
        this.root = null;
    }

    // Encapsulated Codes
    public void insert(int data) {
        this.root = insertData(root, data);
    }

    public void inOrder() {
        inOrderTraversal(root);
    }

    public void preOrder() {
        preOrderTraversal(root);
    }

    public void postOrder() {
        postOrderTraversal(root);
    }

    // Inserting a node in a BST
    private static TreeNode insertData(TreeNode root, int key) {
        if(root == null) root = new TreeNode(key);
        else if(key < root.data) root.left = insertData(root.left, key);
        else if(key > root.data) root.right = insertData(root.right, key);
        return root;
    }

    private static void inOrderTraversal(TreeNode root) {
        // Left_Subtree(L) | root.data (D) | Right_Subtree (R)
        if(root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }

    private static void preOrderTraversal(TreeNode root) {
        //  root.data (D) | Left_Subtree(L) | Right_Subtree (R)
        if(root != null) {
            System.out.print(root.data + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }

    private static void postOrderTraversal(TreeNode root) {
        //  Left_Subtree(L) | Right_Subtree (R) | root.data (D)
        if(root != null) {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();                          // top = null;

        bst.insert(6);
        bst.insert(5);
        bst.insert(7);
        bst.insert(8);
        bst.insert(9);
        bst.insert(1);
        bst.insert(4);
        bst.insert(3);
        bst.insert(2);

        bst.inOrder();                                                          // 1 2 3 4 5 6 7 8 9
        System.out.println();

        bst.preOrder();                                                         // 6 5 1 4 3 2 7 8 9
        System.out.println();

        bst.postOrder();                                                        // 2 3 4 1 5 9 8 7 6
        System.out.println();
    }
}
