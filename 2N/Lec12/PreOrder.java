class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class PreOrder {

    // Preorder Traversal: Root → Left → Right
    public void preorder(TreeNode root) {
        if (root == null) return;

        System.out.print(root.val + " ");    // Visit Root
        preorder(root.left);                 // Traverse Left Subtree
        preorder(root.right);                // Traverse Right Subtree
    }

    public static void main(String[] args) {
        // Create a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        PreOrder tree = new PreOrder();
        System.out.print("Preorder Traversal: ");
        tree.preorder(root);
    }
}