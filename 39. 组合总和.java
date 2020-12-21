class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        //回溯+剪枝
        ans=new ArrayList<>();
        List<Integer> combine=new ArrayList<>();
        Arrays.sort(candidates);
        dfs(candidates,target,combine,0);
        return ans;
    }
    void dfs(int[] candidates,int target,List<Integer> cur,int i){
        if(i==candidates.length) return;
        if(target==0){
            ans.add(new ArrayList<>(cur));
            return;
        }
        //剪枝，candidates排序后，target小于当前的值就不用往后算了
        if(target<candidates[i]) return;
        cur.add(candidates[i]);
        dfs(candidates,target-candidates[i],cur,i);
        cur.remove(cur.size()-1);
        dfs(candidates,target,cur,i+1);
    }
}
