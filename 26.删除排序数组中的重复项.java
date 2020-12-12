class Solution {
    public int removeDuplicates(int[] nums) {
        int j=1;//双指针
        int n=nums.length;
        for(int i=1;i<=n-1;++i){
            if(nums[i]!=nums[i-1]) nums[j++]=nums[i];
        }
        return j;
    }
}
