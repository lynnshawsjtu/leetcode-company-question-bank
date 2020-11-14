class Solution {
    public int coinChange(int[] coins, int amount) {
        //dp
        if(coins.length==0) return -1;
        int[] dp=new int[amount+1];
        Arrays.fill(dp,1,dp.length,Integer.MAX_VALUE);
        for(int i=0;i<coins.length;++i){
            for(int j=coins[i];j<=amount;++j){
                if(dp[j-coins[i]]!=Integer.MAX_VALUE){
                    dp[j]=Math.min(dp[j],dp[j-coins[i]]+1);
                }
            }
        }
        if(dp[amount]!=Integer.MAX_VALUE) return dp[amount];
        return -1;
    }
}
