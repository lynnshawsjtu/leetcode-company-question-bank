class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        //转化为两数之和
        vector<vector<int>> res;
        if(nums.size()<3) return res;
        sort(nums.begin(),nums.end());
        for(int i=0;i<=nums.size()-3;++i){
            if(i>0&&nums[i]==nums[i-1]) continue;
            int target=-nums[i];
            //双指针
            int l=i+1;
            int r=nums.size()-1;
            while(l<r){
                if(nums[l]+nums[r]==target){
                    res.push_back({nums[i],nums[l],nums[r]});
                    while(l<r&&nums[l]==nums[l+1]) l++;
                    while(l<r&&nums[r]==nums[r-1]) r--;
                    l++;
                    r--;
                } else if (nums[l]+nums[r]<target){
                     while(l<r&&nums[l]==nums[l+1]) l++;
                     l++;
                }
                else{
                    while(l<r&&nums[r]==nums[r-1]) r--;
                    r--;
                }
            }
                
                }
            
            return res;
        }
       
    
 
};
