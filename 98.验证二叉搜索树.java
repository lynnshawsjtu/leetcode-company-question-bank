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
    double last=-Double.MAX_VALUE;
    public boolean isValidBST(TreeNode root) {
        boolean ans=true;
        if(root==null) return true;
        ans=ans &&isValidBST(root.left);
        if(last<root.val) last=root.val;
        else return false;
        ans=ans&&isValidBST(root.right);
        return ans;
    }
}
