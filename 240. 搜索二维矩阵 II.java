class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //从左下角开始找
        //因为左下角元素是本行最小，本列最大
        int m=matrix.length;
        int n=matrix[0].length;
        int i=m-1;
        int j=0;
        while(i>=0&&j<=n-1){
            if(matrix[i][j]==target) return true;
            else if(matrix[i][j]<target) j++;
            else i--;
        }
        return false;
    }
}
