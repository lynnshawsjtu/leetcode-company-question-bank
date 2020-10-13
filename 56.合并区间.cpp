class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& intervals) {
        if(intervals.size()==0) return {};
        sort(intervals.begin(),intervals.end());
        vector<vector<int>> merged;
        for(int i=0;i<=intervals.size()-1;++i){
            int L=intervals[i][0];
            int R=intervals[i][1];
            if(!merged.size()||merged.back()[1]<L) merged.push_back({L,R});
            else {
                merged.back()[1]=max(R,merged.back()[1]);
            }
        }
        return merged;
    }
};
