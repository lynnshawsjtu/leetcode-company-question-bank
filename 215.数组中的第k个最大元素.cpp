class Solution {
public:
    int findKthLargest(vector<int>& nums, int k) {
        //调库没意思，写个快排
        quickSort(nums,0,nums.size()-1);
        return nums[nums.size()-k];
    }
    void quickSort(vector<int> &nums,int left,int right){
        if(left>right) return;
        int remLeft=left;
        int remRight=right;
        //基准值
        int num=nums[remLeft];
        while(left!=right){
            while(left<right&&nums[right]>=num) right--;
            while(left<right&&nums[left]<=num)left++;
            if(left<right) swap(nums[left],nums[right]);
        }
        nums[remLeft]=nums[left];
        nums[left]=num;
        quickSort(nums,remLeft,left-1);
        quickSort(nums,right+1,remRight);
    }
};
