/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return null;
        TreeNode left=invertTree(root.left);
        TreeNode right=invertTree(root.right);
        TreeNode temp=left;
        left=right;
        right=temp;
        root.left=left;
        root.right=right;
        return root;
    }
}
