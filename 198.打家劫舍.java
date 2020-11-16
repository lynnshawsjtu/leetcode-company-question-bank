class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;
        int []dp=new int[n];
        if (n==1) return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);
        dp[0]=nums[0];
        dp[1]=nums[1];
        for(int i=2;i<=n-1;++i)
        {
         
         for(int j=i-2;j>=0;j--) dp[i]=Math.max(dp[i],dp[j]+nums[i]);
         dp[i]=Math.max(dp[i],dp[i-1]);
        }
        int num=0;
        for(int i=0;i<=n-1;++i) num=Math.max(num,dp[i]);
        return num;
    }
}
