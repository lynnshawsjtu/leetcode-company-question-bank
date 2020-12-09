class Solution {
    public int maximalRectangle(char[][] matrix) {
        //dp，记录每一个位置向上能达到的最大高度和向左能达到的最大宽度
        int m=matrix.length;
        if(m==0) return 0;
        int n=matrix[0].length;
        int max=0;
        int [][][] dp=new int[m][n][2];
        if(matrix[0][0]=='1'){
            dp[0][0][0]=1;
            dp[0][0][1]=1;
            max=1;
        }
        for(int i=1;i<n;++i){
            if(matrix[0][i]=='1'){
                dp[0][i][0]=dp[0][i-1][0]+1;
                dp[0][i][1]=1;
                max=Math.max(max,dp[0][i][0]);
            }
        
        }
        for(int i=1;i<m;++i){
            if(matrix[i][0]=='1'){
                dp[i][0][1]=dp[i-1][0][1]+1;
                dp[i][0][0]=1;
                max=Math.max(max,dp[i][0][1]);
            }
        }
        for(int i=1;i<m;++i){
            for(int j=1;j<n;++j){
                if(matrix[i][j]=='1'){
                    dp[i][j][0]=dp[i][j-1][0]+1;
                    dp[i][j][1]=dp[i-1][j][1]+1;
                    int width=dp[i][j][0],height=dp[i][j][1],minHeight=height;
                    for(int k=1;k<=width;++k){
                        minHeight=Math.min(minHeight,dp[i][j-k+1][1]);
                        max=Math.max(max,k*minHeight);
                    }
                }
            }
        }
        return max;
    }
}
