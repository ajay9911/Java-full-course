package tree.binaryTree;

// Definition of TreeNode (Represents a node in the Binary Search Tree)
class TreeNode {
    int val;           // Node value
    TreeNode left;     // Left child
    TreeNode right;    // Right child

    // Constructor to initialize node with a value
    public TreeNode(int val) {
        this.val = val;
    }
}

// BinaryTree class with insert, delete, and traversal methods
class BinaryTree {
    private TreeNode root; // Root node of the tree

    // Method to insert a node into the BST
    public void insert(int key) {
        root = insertRecursive(root, key);
    }

    // Recursive function to insert a node into the BST
    private TreeNode insertRecursive(TreeNode root, int key) {
        if (root == null) return new TreeNode(key); // Create new node if tree/subtree is empty

        // Insert in left subtree if key is smaller, else insert in right subtree
        if (key < root.val) root.left = insertRecursive(root.left, key);
        else root.right = insertRecursive(root.right, key);

        return root; // Return updated tree
    }

    // Method to delete a node from the BST
    public void delete(int key) {
        root = deleteRecursive(root, key);
    }

    // Recursive function to delete a node
    private TreeNode deleteRecursive(TreeNode root, int key) {
        if (root == null) return null; // If tree/subtree is empty, return null

        // Traverse the tree to find the node to delete
        if (key < root.val) root.left = deleteRecursive(root.left, key);
        else if (key > root.val) root.right = deleteRecursive(root.right, key);
        else {
            // Case 1: Node with only one child or no child
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            // Case 2: Node with two children -> Get inorder successor (smallest in right subtree)
            root.val = findMinValue(root.right);

            // Delete the inorder successor
            root.right = deleteRecursive(root.right, root.val);
        }
        return root;
    }

    // Helper method to find the minimum value in a subtree (used for deletion)
    private int findMinValue(TreeNode root) {
        while (root.left != null) root = root.left; // Move left until the smallest value is found
        return root.val;
    }

    // Method to perform Inorder Traversal (Left, Root, Right)
    public void inorder() {
        System.out.print("Inorder Traversal (Sorted Order): ");
        inorderTraversal(root);
        System.out.println();
    }

    private void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.val + " ");
            inorderTraversal(root.right);
        }
    }

    // Method to perform Preorder Traversal (Root, Left, Right)
    public void preorder() {
        System.out.print("Preorder Traversal (Root First): ");
        preorderTraversal(root);
        System.out.println();
    }

    private void preorderTraversal(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
    }

    // Method to perform Postorder Traversal (Left, Right, Root)
    public void postorder() {
        System.out.print("Postorder Traversal (Root Last): ");
        postorderTraversal(root);
        System.out.println();
    }

    private void postorderTraversal(TreeNode root) {
        if (root != null) {
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            System.out.print(root.val + " ");
        }
    }
}

// Main class to test the binary tree operations
public class BinaryTreeOperations {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(); // Creating an instance of BinaryTree

        // Insert nodes into the tree
        int[] values = {50, 30, 70, 20, 40, 60, 80};
        for (int val : values) {
            System.out.println("Inserting: " + val);
            tree.insert(val);
        }

        // Display tree traversals
        System.out.println("\nTree Traversal Results:");
        tree.inorder();
        tree.preorder();
        tree.postorder();

        // Delete a node
        System.out.println("\nDeleting node 50...");
        tree.delete(50);

        // Display tree after deletion
        System.out.println("\nTree after deletion:");
        tree.inorder();
    }
}
