class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<=1) return nums.length;
        Arrays.sort(nums);
        int len=1;
        int n=nums.length;
        int tmp=1;
        int[] nums1=new int[n];
        int j=0;
        for(int i=0;i<=n-1;++i)
        {
            if(i==n-1||nums[i]!=nums[i+1]) nums1[j++]=nums[i];
        }
       
        for(int i=0;i<j-1;++i){
            if(nums1[i]+1!=nums1[i+1]){
                len=Math.max(tmp,len);
                tmp=1;
            }
            else tmp++;
        }
        len=Math.max(tmp,len);
        return len;
    }
}
