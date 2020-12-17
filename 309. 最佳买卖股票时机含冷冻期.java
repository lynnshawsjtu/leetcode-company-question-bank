class Solution {
    public int maxProfit(int[] prices) {
        //sell.buy.cool
        int n=prices.length;
        if(n==0) return 0;
        int []sell=new int[n];
        int []buy=new int[n];
        int []cool=new int[n];
        buy[0]=-prices[0];
        for (int i=1;i<n;++i){
            sell[i]=Math.max(buy[i-1]+prices[i],sell[i-1]);
            buy[i]=Math.max(cool[i-1]-prices[i],buy[i-1]);
            cool[i]=Math.max(Math.max(sell[i-1],buy[i-1]),cool[i-1]);
        }
        return sell[n-1];
    }
}
