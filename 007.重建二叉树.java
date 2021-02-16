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
    private Map<Integer,Integer> index_map=new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n=preorder.length;
        for(int i=0;i<n;++i){
            index_map.put(inorder[i],i);
        }
        return buildTree(preorder,inorder,0,n-1,0,n-1);
    }

    private TreeNode buildTree(int[] preorder,int [] inorder,int left_pre,int right_pre,int left_in,int right_in){
        if(left_pre>right_pre) return null;
        TreeNode root=new TreeNode(preorder[left_pre]);
        int root_index=index_map.get(preorder[left_pre]);
        int left_tree_length=root_index-left_in;
        root.left=buildTree(preorder,inorder,left_pre+1,left_pre+left_tree_length,left_in,root_index-1);
        root.right=buildTree(preorder,inorder,left_pre+left_tree_length+1,right_pre,root_index+1,right_in);
        return root;
    }
}
