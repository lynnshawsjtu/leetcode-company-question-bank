class Solution {
public:
    int climbStairs(int n) {
        if(n==1) return 1;
        int num0=1;
        int num1=1;
        for(int i=2;i<=n;++i){
            int temp=num0+num1;
            num0=num1;
            num1=temp;
        }
        return num1;
    }
};
