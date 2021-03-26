class Solution {
    public int[][] findContinuousSequence(int target) {
        List<int[]> list=new ArrayList<>();
        for(int l=1,r=1,sum=0;r<target;++r){
            sum+=r;
            while(sum>target) sum-=l++;
            if(sum==target){
                int[] temp=new int[r-l+1];
                for(int i=0;i<temp.length;++i){
                    temp[i]=l+i;
                }
                list.add(temp);
            }
        }
        int[][] res=new int[list.size()][];
        for(int i=0;i<res.length;++i){
            res[i]=list.get(i);
        }
        return res;
    }
}
