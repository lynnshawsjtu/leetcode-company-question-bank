class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        if (n<=1) return n;
        int[] dp=new int[n];
        for(int i=0;i<=n-1;++i) dp[i]=1;
        for(int i=1;i<=n-1;++i){
            int max=1;
            for(int j=0;j<=i-1;++j){
               
                if(nums[i]>nums[j]){
                    max=Math.max(dp[j]+1,max);
                }
            }
            dp[i]=max;
        }
        int max_length=1;
        for(int i=1;i<=n-1;++i){
            max_length=Math.max(max_length,dp[i]);
        }
        return max_length;
    }
}
