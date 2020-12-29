class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int count=1;
        int res=nums[0];
        for(int i=1;i<=n-1;++i){
            if(nums[i]==res) count++;
            else {
                count--;
                if(count==0){
                    count=1;
                    res=nums[i];
                }
            }
        }
        return res;
    }
}
