class Solution {
    public int[] dailyTemperatures(int[] T) {
        //从最后一天倒推到第一天
        int n=T.length;
        int []res=new int[n];
        for(int i=n-2;i>=0;--i){
            for(int j=i+1;j<n;j+=res[j]){
                if(T[i]<T[j]) {
                    res[i]=j-i;
                    break;
                }else if(res[j]==0){
                    break;
                }
            }
        }
        return res;

    }
}
