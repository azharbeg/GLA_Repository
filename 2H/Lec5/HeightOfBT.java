class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class  HeightOfBT {
    // Function to calculate height of binary tree
    public int height(TreeNode root) {
      
     if (root == null) return -1;  

        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static void main(String[] args) {
        // Example Tree:
        //      1
        //     / \
        //    2   3
        //   /
        //  4
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);

        TreeHeight th = new TreeHeight();
        System.out.println("Height of tree: " + th.height(root)); // Output: 2 (edge-based)
    }
}
