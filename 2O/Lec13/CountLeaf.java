
class TreeNode {
    int val;
    TreeNode left, right;
    
    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class CountLeaf {
    
    // Function to count leaf nodes
    public static int countLeaves(TreeNode root) {
        if (root == null) return 0;
        
        // A node is a leaf if both left and right are null
        if (root.left == null && root.right == null) {
            return 1;
        }

        // Recursively count leaves in left and right subtree
        return countLeaves(root.left) + countLeaves(root.right);
    }

    public static void main(String[] args) {
        // Sample binary tree
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(18);

        System.out.println("Number of leaf nodes: " + countLeaves(root));
    }
}

