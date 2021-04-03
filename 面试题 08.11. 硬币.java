class Solution {
    public int waysToChange(int n) {
        //dp
        long []dp=new long[n+1];
        if(n==0) return 0;
        if (n==1) return 1;
        
        dp[0]=1;
        int[] coins={25,10,5,1};
        //从大到小，以免重复
        for(int i=0;i<=3;++i){
            for(int j=coins[i];j<=n;++j){
                dp[j]=(dp[j-coins[i]]+dp[j])%1000000007;
            }
        }
        return (int)dp[n];
    }
}
