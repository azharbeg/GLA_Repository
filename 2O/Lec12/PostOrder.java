
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class PostOrder {

    // Postorder Traversal: Left → Right → Root
    public void postorder(TreeNode root) {
        if (root == null) return;

        postorder(root.left);      // Traverse Left Subtree
        postorder(root.right);      // Traverse Right Subtree
        
        System.out.print(root.val + " "); // Visit Root
    }

    public static void main(String[] args) {
        // Create a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        PostOrder tree = new PostOrder();
        System.out.print("Postorder Traversal: ");
        tree.postorder(root);
    }
}

