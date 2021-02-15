class Solution {
    public void moveZeroes(int[] nums) {
        int j=0;
        int n=nums.length;
        for(int i=0;i<=n-1;++i){
            if(nums[i]!=0) {
                nums[j]=nums[i];
                if(i!=j) nums[i]=0;
                j++;
            }
        }
    }
}
