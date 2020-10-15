class Solution {
public:
    int search(vector<int>& nums, int target) {
        //logn级别，所以只能是二分查找
        //中间数小于右半边，左半边有序，否则右半边有序
        int len=nums.size();
        int left=0;
        int right=len-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]<nums[right]){
                if(nums[mid]<target&&target<=nums[right]) left=mid+1;
                else right=mid-1;
            }
            else{
                if(nums[left]<=target&&target<nums[mid]) right=mid-1;
                else left=mid+1;
            }
        }
        return -1;
    }
};
