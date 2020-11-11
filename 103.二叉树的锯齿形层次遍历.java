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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    
        if(root==null)  return new ArrayList<>();
         List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        int t=0;
        while(!queue.isEmpty()){
            int n=queue.size();
            t++;
            List<Integer> tmp=new ArrayList<>();
            for(int i=1;i<=n;++i){
                TreeNode tmpNode=queue.poll();
                if(tmpNode.left!=null) queue.offer(tmpNode.left);
                if(tmpNode.right!=null) queue.offer(tmpNode.right);
                tmp.add(tmpNode.val);
            }
            if (t%2==1)res.add(tmp);
            else {
                List<Integer> tmp1=new ArrayList<>();
                for(int i=tmp.size()-1;i>=0;--i){
                    int x=tmp.get(i);
                    tmp1.add(x);
                    
                }
                res.add(tmp1);
                
            }

                
            
        }
        return res;
    }
}
