class Solution {
    public int singleNumber(int[] nums) {
        //异或
        int n=nums.length;
        int res=0;
        for(int i=0;i<=n-1;++i) res=res^nums[i];
        return res;
    }
}
