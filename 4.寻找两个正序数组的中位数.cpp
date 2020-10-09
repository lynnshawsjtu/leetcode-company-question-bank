class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
      
        vector<int> nums3;
        int n1=nums1.size();
        int n2=nums2.size();
        for(int i=0;i<=n1-1;++i){
            nums3.push_back(nums1[i]);
        }
        for(int i=0;i<=n2-1;++i){
            nums3.push_back(nums2[i]);
        }
        sort(nums3.begin(),nums3.end());
        if((n1+n2)%2) return double(nums3[(n1+n2)/2]);
        else return double(nums3[(n1+n2)/2]+nums3[(n1+n2)/2-1])/2;
    }
};
