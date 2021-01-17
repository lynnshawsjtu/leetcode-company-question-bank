class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        boolean flag=false;
        for(int i=0;i<=n-1;++i){
            int begin=i;
            int count=0;
            int num=0;
            
            while(count<n){
                int index=begin+count;
                index=index%n;
                num=num+gas[index]-cost[index];
                if(num<0) break;
                count++;           
            }
            if(count==n) return begin;
        }
        return -1;
    }
}
