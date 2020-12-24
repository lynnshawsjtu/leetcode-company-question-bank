class Solution {
    public int maxSubArray(int[] nums) {
        //最大子数组的第一个数必定是正数，最后一个数也是
        int sum=nums[0];
        int max_sum=sum;
        int n=nums.length;
        for(int i=1;i<=n-1;++i){
            if(sum<0) sum=0;
            sum+=nums[i];
            max_sum=Math.max(sum,max_sum);
            
        }
        return max_sum;
    }
}
