class Solution {
public:
    vector<vector<int>> res;
    vector<vector<int>> permute(vector<int>& nums) {
        vector<int> list;
        backtrack(res,list,nums);
        return res;
    }
    void backtrack(vector<vector<int>> &res,vector<int> &list,vector<int> nums){
        if(list.size()==nums.size()) {
            res.push_back(list);
            return;
        }
        for(int num:nums){
            if(!isexist(list,num)) {
                list.push_back(num);
                backtrack(res,list,nums);
                list.pop_back();
            }
        }
    }
    bool isexist(vector<int> list,int n){
        if(list.size()==0) return false;
        for(int i=0;i<=list.size()-1;++i){
            if(list[i]==n) return true;
        }
        return false;
    }
};
