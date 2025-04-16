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
class ConvertArrayToBST {
   
    public TreeNode sortedArrayToBST(int[] nums) {
        
         return generate(nums,0,nums.length-1);       
    }
     public TreeNode generate(int[] arr, int start, int end){

        if(start > end) return null;

        int mid = (start + end)/2;

        TreeNode node = new TreeNode(arr[mid]);
        node.left = generate(arr, start, mid-1);
        node.right = generate(arr, mid+1, end);

        return node;
    }
}