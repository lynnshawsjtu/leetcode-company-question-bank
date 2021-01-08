class Solution {
    public int findDuplicate(int[] nums) {
      //寻找链表环的入口
      int fast=0;
      int slow=0;
      while(true){
          fast=nums[nums[fast]];
          slow=nums[slow];
          if(slow==fast){
              fast=0;
              while(nums[slow]!=nums[fast]){
                  fast=nums[fast];
                  slow=nums[slow];
              }
              return nums[slow];
          }
      }
    }
}
