class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int n=prices.size();
        if(n==0) return 0;
        vector<int> dp(n,INT_MAX);
        dp[0]=prices[0];
        for(int i=1;i<=n-1;++i){
            dp[i]=min(prices[i],dp[i-1]);
        }
      
        int max_num=0;
        for(int i=0;i<=n-1;++i){
            max_num=max(max_num,prices[i]-dp[i]);
        }
        return max_num;
    }
};
