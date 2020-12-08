class Solution {
    public int mySqrt(int x) {
        //x/m<m防止溢出
        if(x==1||x==0) return x;
        int min=0;
        int max=x;
        while(max-min>1){
            int m=(max+min)/2;
            if(x/m<m) max=m;
            else min=m;
        }
        return min;
    }
}
