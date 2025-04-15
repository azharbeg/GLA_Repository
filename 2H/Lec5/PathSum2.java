/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class PathSum2 {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
      List<List<Integer>> res = new ArrayList<List<Integer>>();
        helper(root, targetSum, new ArrayList<Integer>(), res);
        return res;
    }

     void helper(TreeNode root, int sum, List<Integer> sol, List<List<Integer>> res) {
        if (root == null) {
            return;
        }
        
        sol.add(root.val);  
        
        if (root.left == null && root.right == null && sum == root.val) {
            res.add(new ArrayList<Integer>(sol));
        } 
        
        else {
            helper(root.left, sum - root.val, sol, res);
            helper(root.right, sum - root.val, sol, res);
        }
        
        sol.remove(sol.size() - 1);  
    }
}