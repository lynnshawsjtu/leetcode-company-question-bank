class Solution {
    public int threeSumClosest(int[] nums, int target) {
        //排序
        Arrays.sort(nums);
        int closestNum=nums[0]+nums[1]+nums[2];
        int n=nums.length;
        for(int i=0;i<n-2;++i){
            int l=i+1;
            int r=n-1;
            while(l<r){
                int threeSum=nums[l]+nums[r]+nums[i];
                if(Math.abs(threeSum-target)<Math.abs(closestNum-target))closestNum=threeSum;
                if(threeSum>target) r--;
                else if(threeSum<target)l++;
                else return target;
            }
        }

        return closestNum;
    }
}
