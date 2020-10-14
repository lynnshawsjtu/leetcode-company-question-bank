class Solution {
public:
    int maxArea(vector<int>& height) {
        //双指针
        //使用2个指针，值小的向内移动
        if(height.size()<=1) return -1;
        int i=0;
        int j=height.size()-1;
        int res=0;
        while(i<j){
            int h=min(height[i],height[j]);
            res=max(res,h*(j-i));
            if(height[i]<height[j])i++;
            else j--;
        }
        return res;
    }
};
