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
    int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        dfs(root);
        return max;
    }
    private int dfs(TreeNode root){
        if(root.left==null&&root.right==null){
            return 0;
        }
        int leftSize=root.left==null?0:dfs(root.left)+1;
        int rightSize=root.right==null?0:dfs(root.right)+1;
        max=Math.max(max,leftSize+rightSize);
        return Math.max(leftSize,rightSize);
    }
}
