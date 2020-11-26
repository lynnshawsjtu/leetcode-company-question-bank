class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        res.add(new ArrayList<>());
        int n=nums.length;
        for(int i=0;i<nums.length;++i){
            int all=res.size();
            for(int j=0;j<all;++j){
                List<Integer> tmp=new ArrayList<>(res.get(j));
                tmp.add(nums[i]);
                res.add(tmp);
            }
        }
        return res;
    }
}
