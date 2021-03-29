class Solution {
    public int maxProfit(int k, int[] prices) {
        //当k>=数组长度一半时，退化为贪心算法
        if(k<1) return 0;
        if(k>=prices.length/2) return greedy(prices);
        int[][] t=new int[k][2];
        for(int i=0;i<k;++i) t[i][0]=Integer.MIN_VALUE;
        for(int p:prices){
            t[0][0]=Math.max(t[0][0],-p);
            t[0][1]=Math.max(t[0][1],t[0][0]+p);
            for(int i=1;i<k;++i){
                t[i][0]=Math.max(t[i][0],t[i-1][1]-p);
                t[i][1]=Math.max(t[i][1],t[i][0]+p);
            }
        }
        return t[k-1][1];
    }
    private int greedy(int[] prices){
        int max=0;
        for(int i=1;i<prices.length;++i){
            if(prices[i]>prices[i-1]) max+=prices[i]-prices[i-1];
        }
        return max;
    }
}
