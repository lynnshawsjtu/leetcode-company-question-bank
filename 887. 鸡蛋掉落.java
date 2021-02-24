class Solution {
    public int superEggDrop(int K, int N) {
        //dp
        int[] dp=new int[K+1];
        int m=0;
        while(dp[K]<N){
            m+=1;
            for(int k=K;k>0;--k){
                dp[k]=dp[k-1]+dp[k]+1;
            }
        }
        return m;
    }
}
