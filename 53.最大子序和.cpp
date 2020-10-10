class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int n=nums.size();
        vector<int> dp(n,0);
        dp[0]=nums[0];
        for(int i=1;i<=dp.size()-1;++i){
            if(dp[i-1]<0) dp[i]=nums[i];
            else dp[i]=dp[i-1]+nums[i];
        }
        int max_sum=INT_MIN;
        for(int i=0;i<=dp.size()-1;++i){
            if(dp[i]>max_sum) max_sum=dp[i];
        }
        return max_sum;
    }
};
