class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res=new ArrayList<Integer>();
        int m=matrix.length;
        if(m==0) return res;
        int n=matrix[0].length;
  
        int l=0;
        int r=n-1;
        int u=0;
        int d=m-1;
        while(l<=r&&u<=d){
            for(int i=l;i<=r;++i) res.add(matrix[u][i]);
            u++;
            if(u>d) break;
            for(int i=u;i<=d;++i) res.add(matrix[i][r]);
            r--;
            if(r<l) break;
            for(int i=r;i>=l;--i) res.add(matrix[d][i]);
            d--;
            if(u>d) break;
            for(int i=d;i>=u;--i) res.add(matrix[i][l]);
            l++;
        }
        return res;
    }
}
