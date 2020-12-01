class Solution {
    public int findRepeatNumber(int[] nums) {
       //哈希，给出了原数组值的范围
       int[] arr=new int[nums.length];
       int n=nums.length;
       for(int i=0;i<=n-1;++i){
           arr[nums[i]]++;
           if(arr[nums[i]]>1) return nums[i];
       }
       return -1;
    }
}
