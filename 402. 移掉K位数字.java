class Solution {
    public String removeKdigits(String num, int k) {
        //从左到右，找第一个左边比右边大的，移除
        //头部的0清除
        //作k次扫描
        if(num.length()==k) return "0";
        StringBuilder s=new StringBuilder(num);
        for(int i=0;i<k;++i){
            int idx=0;
            for(int j=1;j<s.length()&&s.charAt(j)>=s.charAt(j-1);++j) idx=j;
            s.delete(idx,idx+1);
            while(s.length()>1&&s.charAt(0)=='0') s.delete(0,1);
        }

        return s.toString();
    }
}
