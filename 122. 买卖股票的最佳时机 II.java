class Solution {
    public int maxProfit(int[] prices) {
        int num=0;
        int n=prices.length;
        for(int i=1;i<=n-1;++i){
            num+=Math.max(0,prices[i]-prices[i-1]);
        }
        return num;
    }
}
