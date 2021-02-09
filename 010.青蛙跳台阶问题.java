class Solution {
    public int numWays(int n) {
        int x=0;
        int y=1;
        for(int i=1;i<=n;++i){
            int temp=y;
            y=(x+y)%1000000007;
            x=temp;
        }
        return y;
    }
}
