 
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class LowestAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
          if(root == null || root == p || root == q){
            return root;
        }
        TreeNode leftlca = lowestCommonAncestor(root.left,p,q);
        TreeNode rightlca = lowestCommonAncestor(root.right,p,q);
        
        if(rightlca == null){
            return leftlca;
        }
        if(leftlca == null){
            return rightlca;
        }
        return root;
    }
}
