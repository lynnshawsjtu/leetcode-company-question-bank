class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        if (n==0) return 1;
       
        int[] nums1=new int[n];
        for(int i=0;i<=n-1;++i){
            if(nums[i]-1>=0&&nums[i]-1<=n-1)
           nums1[nums[i]-1]=nums[i];//映射到nums[i]-1的位置，不是nums[i]，感觉emmm很是玄学
        }
        for(int i=0;i<=n-1;++i){
            if(nums1[i]-1!=i) return i+1;
        }
        return n+1;
    }
}
