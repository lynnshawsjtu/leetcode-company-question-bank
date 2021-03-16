class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        //排序+双指针
         List<List<Integer>> quadruplets = new ArrayList<List<Integer>>();
         if(nums==null||nums.length<4) return quadruplets;
         Arrays.sort(nums);
         int length=nums.length;
         for(int i=0;i<length-3;++i){
             if(i>0&&nums[i]==nums[i-1]) continue;//去重
             if(nums[i]+nums[i+1]+nums[i+2]+nums[i+3]>target) break;
             if(nums[i]+nums[length-3]+nums[length-2]+nums[length-1]<target) continue;
             for(int j=i+1;j<length-2;++j){
                 if(j>i+1&&nums[j]==nums[j-1])continue;
                 if(nums[j]+nums[j+1]+nums[j+2]+nums[i]>target) break;
                if(nums[i]+nums[j]+nums[length-2]+nums[length-1]<target) continue;
                int left=j+1;
                int right=length-1;
                while(left<right){
                    int sum=nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum==target){
                        quadruplets.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        while(left<right&&nums[left]==nums[left+1]) left++;
                        left++;
                        while(left<right&&nums[right]==nums[right-1]) right--;
                        right--;
                    } else if(sum<target){
                        left++;
                    } else right--;

                }
             }
         }
         return quadruplets;
    }
}
