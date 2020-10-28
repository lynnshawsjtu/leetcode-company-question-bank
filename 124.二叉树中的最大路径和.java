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
class Solution {
    private int ret=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        getMax(root);
        return ret;
    }
    private int getMax(TreeNode r){
        if(r==null) return 0;
        int left=Math.max(0,getMax(r.left));
        int right=Math.max(0,getMax(r.right));
        ret=Math.max(ret,r.val+left+right);
        return Math.max(left,right)+r.val;
    }
}
