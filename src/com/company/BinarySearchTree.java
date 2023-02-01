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
    static TreeNode root;

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

    public static int level() {
        return findLevel(root);
    }

    public static int height() {
        int height = findLevel(root);
        return height - 1;
    }

    public static void delete(int key) { root = deleteKey(root, key); }

    // FInd the height of the BST
    private static int findLevel(TreeNode root) {
        if(root == null) return 0;
        else {
            int l_height = findLevel(root.left);
            int r_height = findLevel(root.right);
            if(l_height > r_height) {
                return l_height + 1;
            } else {
                return r_height + 1;
            }
        }
    }

    public static boolean search(int key) {
        TreeNode address = searchKey(root, key);
        if(address == null) return false;
        else return true;
    }

    // Search a node in a BST
    private static TreeNode searchKey(TreeNode root, int key) {
        if(root == null || key == root.data) return root;
        if(key < root.data) return searchKey(root.left, key);
        if(key > root.data) return searchKey(root.right, key);
        return root;
    }

    private static int findMin(TreeNode root) {
        int minValue = root.data;
        while(root.left != null) {
            minValue = root.left.data;
            root = root.left;
        }
        return minValue;
    }

    private static TreeNode deleteKey(TreeNode root, int key) {
        // Search the element and traverse to it, and delete the element

        // Case 0 --> If the element does not exist in the tree (BST)
        if(root == null) return null;
        else {
            // If the element exists

            // key < root
            if(key < root.data) root.left = deleteKey(root.left, key);
            // key > root
            else if(key > root.data) root.right = deleteKey(root.right, key);
            // key = root | Key has been found, we will delete that key
            else {
                // Case 2 --> If the node to be deleted has only one child
                if(root.left == null) return root.right;
                else if(root.right == null) return root.left;
                // Case 3 --> If the node to be deleted has two children
                else {
                    // Find the element largest in the left subtree --> findMax(root.left);
                    // Find the element smallest in the right subtree
                    root.data = findMin(root.right);
                    root.right = deleteKey(root.right, root.data);
                }
            }
        }
        return root;
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
        bst.insert(10);
        bst.insert(11);
        bst.insert(12);

        bst.inOrder();                                                          // 1 2 3 4 5 6 7 8 9
        System.out.println();

        bst.preOrder();                                                         // 6 5 1 4 3 2 7 8 9
        System.out.println();

        bst.postOrder();                                                        // 2 3 4 1 5 9 8 7 6
        System.out.println();

        // 10 is mot present
        boolean is10Present = search(10);
        if(is10Present) System.out.println("10 is present");
        else System.out.println("10 is not present");

        // 9 is present
        boolean is9Present = search(9);
        if(is9Present) System.out.println("9 is present");
        else System.out.println("9 is not present");

        System.out.println(bst.height());                                       // 5

        bst.delete(6);
        bst.inOrder();                                                          // 1 2 3 4 5 7 8 9
        System.out.println();
    }
}
