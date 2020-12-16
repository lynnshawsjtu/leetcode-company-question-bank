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
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<Integer> cur=new ArrayList<>();
        dfs(root,cur,0,sum);
        return res;

    }
    public void dfs(TreeNode node,List<Integer> cur,int sum,int target){
        if(node==null) return;
        if(node.left==null&&node.right==null&&node.val+sum==target){
            cur.add(node.val);
            res.add(new ArrayList<>(cur));
            cur.remove(cur.size()-1);
            return;
        }
        cur.add(node.val);
        dfs(node.left,cur,sum+node.val,target);
        dfs(node.right,cur,sum+node.val,target);
        cur.remove(cur.size()-1);
    }
}
