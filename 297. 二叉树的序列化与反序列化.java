/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    //java的str+=""效率太低
    //推荐使用StringBuilder

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder res=ser_help(root,new StringBuilder());
        return res.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] str_word=data.split(",");
        List<String> list_word=new LinkedList<String>(Arrays.asList(str_word));
        return deser_help(list_word);
        
    }
    public StringBuilder ser_help(TreeNode root,StringBuilder str){
        if(root==null){
            str.append("null,");
            return str;
        }
        str.append(root.val);
        str.append(",");
        //层序遍历
        str=ser_help(root.left,str);
        str=ser_help(root.right,str);
        return str;
    }
    public TreeNode deser_help(List<String> li){
        if(li.get(0).equals("null")){
            li.remove(0);
            return null;
        }
        TreeNode res=new TreeNode(Integer.valueOf(li.get(0)));
        li.remove(0);
        res.left=deser_help(li);
        res.right=deser_help(li);
        return res;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
