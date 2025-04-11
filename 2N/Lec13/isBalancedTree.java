
// public class isBalanced {

// }


class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) {
        val = x;
    }
}

public class isBalancedTree {

    public boolean isBalanced(TreeNode root) {
        return checkHeight(root) != -1;
    }

    private int checkHeight(TreeNode node) {
        if (node == null) return 0;

        int left = checkHeight(node.left);       
        int right = checkHeight(node.right);

        if (Math.abs(left - right) > 1) return -1;        // current node unbalanced

        return Math.max(left, right) + 1;                // height of current node
    }

    public static void main(String[] args) {
      
  // Example:
        //     1
        //    / \
        //   2   3
        //  /
        // 4


        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);

        BalancedTreeChecker checker = new BalancedTreeChecker();
        boolean result = checker.isBalanced(root);
        System.out.println("Is the tree balanced? " + result);
    }
}
