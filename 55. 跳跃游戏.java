class Solution {
    public boolean canJump(int[] nums) {
        //贪心算法，每个位置都计算自己能达到的最远距离，同时判断自己是否可达
        int len=nums.length;
        if(len<=1) return true;
        int max=nums[0];
        for(int i=1;i<len-1;++i){
            if(i<=max) max=Math.max(max,nums[i]+i);
        }
        return max>=len-1;
    }
}
