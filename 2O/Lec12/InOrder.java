class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class InOrder {

    // Inorder Traversal: Left → Root → Right
    public void inorder(TreeNode root) {
        if (root == null) return;

        inorder(root.left);             // Traverse Left Subtree
        System.out.print(root.val + " "); // Visit Root
        inorder(root.right);            // Traverse Right Subtree
    }

    public static void main(String[] args) {
        // Sample Binary Tree:
        //       1
        //      / \
        //     2   3
        //    / \
        //   4   5

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        InOrder tree = new InOrder();
        System.out.print("Inorder Traversal: ");
        tree.inorder(root);
    }
}

 
