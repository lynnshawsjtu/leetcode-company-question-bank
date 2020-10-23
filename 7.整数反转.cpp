class Solution {
public:
    int reverse(int x) {
        long res=0;//用long表示方便判断溢出
        while(x){
            res=res*10+x%10;
            x=x/10;
        }
        //判断溢出
        return res>INT_MAX||res<INT_MIN?0:res;
    }
};
