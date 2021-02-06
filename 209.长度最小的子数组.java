class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        //滑动窗口
        int i=0;
        int sum=0;
        int len=Integer.MAX_VALUE;
        for(int j=0;j<nums.length;++j){
            sum+=nums[j];
            while(sum>=target){
                len=Math.min(j-i+1,len);
                sum-=nums[i++];
            }
        }
        if(len==Integer.MAX_VALUE) len=0;
        return len;
    }
}
