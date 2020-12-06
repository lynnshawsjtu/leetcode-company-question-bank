class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int [][] dp=new int[m][n];
        dp[0][0]=grid[0][0];
        for(int i=0;i<=m-1;++i){
            for(int j=0;j<=n-1;++j){
                if(i==0&&j==0) continue;
                if(i==0){
                    dp[i][j]=dp[i][j-1]+grid[i][j];
                }
                else if(j==0){
                    dp[i][j]=dp[i-1][j]+grid[i][j];
                }
                else{
                    dp[i][j]=Math.min(dp[i][j-1],dp[i-1][j])+grid[i][j];
                }
            }
        }
        return dp[m-1][n-1];
    }
}
