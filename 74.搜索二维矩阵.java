class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //右上，左下
        int m=matrix.length;
        if(m==0) return false;
        int n=matrix[0].length;
        if(n==0) return false;
        int i=0;
        int j=n-1;
        
        while(i<m&&j>=0){
            if(matrix[i][j]==target) return true;
            else if(matrix[i][j]>target) j--;
            else i++;
        }
        return false;
    }
}
