class Solution {
    public boolean canMeasureWater(int x, int y, int z) {
        //x,y的最大公约数能否被z整除
        if(z==0) return true;
        if(x+y<z) return false;
        if(x>y){
            int temp=x;
            x=y;
            y=temp;
        }
        if(x==0) {
            if(y==z) return true;
            else return false;
        }
        while(y%x!=0){
            int a=y;
            int b=x;
            y=b;
            x=a%b;
        }
        if(z%x==0) return true;
        else return false;
    }
}
