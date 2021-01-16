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
    TreeNode last=null;
    public void flatten(TreeNode root) {
        //递归，左子树置空
        if(root==null) return;
        flatten(root.right);
        flatten(root.left);
        root.right=last;
        root.left=null;
        last=root;
    }
}
