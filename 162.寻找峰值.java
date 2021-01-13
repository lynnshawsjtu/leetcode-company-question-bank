class Solution {
    public int findPeakElement(int[] nums) {
        //o(lgn)的时间复杂度
        //二分查找
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(nums[mid]>nums[mid+1]) right=mid;
            else left=mid+1;
        }
        return left;
    }
}
