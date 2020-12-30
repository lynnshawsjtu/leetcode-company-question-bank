class Solution {
    public int numDecodings(String s) {
        int cnt=0;
        int n=s.length();
        char[] s1=s.toCharArray();
        if(n==0||n==1&&s1[0]=='0') return 0;
        if(n==1) return 1;
        int[] dp=new int[n+1];
        dp[0]=1;
        //约束的f(n)=f(n-1)+f(n-2)
        for(int i=0;i<n;++i){
            dp[i+1]=s1[i]=='0'?0:dp[i];
            if(i>0&&(s1[i-1]=='1'||s1[i-1]=='2'&&s1[i]<='6'))
            dp[i+1]+=dp[i-1];
        }
        return dp[n];
    }
}
