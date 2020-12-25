class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        if(matrix.length==0||matrix[0].length==0) return 0;
        int row=matrix.length;
        int col=matrix[0].length;
        int max=0;
        int[][] dp=new int[row][col];
        for(int i=0;i<row;++i){
            for(int j=0;j<col;++j){
                max=Math.max(max,search(matrix,Integer.MIN_VALUE,i,j,dp));
            }
        }
        return max;
    }
    private int search(int [][] matrix,int curNum,int i,int j,int[][] dp){
        int row=matrix.length;
        int col=matrix[0].length;
        if(i<0||i>=row||j<0||j>=col||matrix[i][j]<=curNum) return 0;
        if(dp[i][j]!=0) return dp[i][j];
        int max=0;
        max=Math.max(max,search(matrix,matrix[i][j],i-1,j,dp));
        max=Math.max(max,search(matrix,matrix[i][j],i+1,j,dp));
        max=Math.max(max,search(matrix,matrix[i][j],i,j-1,dp));
        max=Math.max(max,search(matrix,matrix[i][j],i,j+1,dp));
        dp[i][j]=max+1;
        return max+1;
    }
}
