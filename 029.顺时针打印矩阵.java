class Solution {
    public int[] spiralOrder(int[][] matrix) {
        int m=matrix.length;
        if(m==0) return new int[0];
        int n=matrix[0].length;
        if(n==0) return new int[0];
        int []res=new int[m*n];
        int up=0;
        int down=m-1;
        int left=0;
        int right=n-1;
        int index=0;
        while(true){
            for(int i=left;i<=right;++i){
                res[index]=matrix[up][i];
                index++;
            }
            up++;
            if(up>down) break;
            for(int i=up;i<=down;++i){
                res[index]=matrix[i][right];
                index++;
            }
            right--;
            if(left>right) break;
            for(int i=right;i>=left;--i){
                res[index]=matrix[down][i];
                index++;
            }
            down--;
            if(up>down) break;
            for(int i=down;i>=up;--i){
                res[index]=matrix[i][left];
                index++;
            }
            left++;
            if(left>right) break;
        }
        return res;
    }
}
