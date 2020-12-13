class Solution {
    public String addStrings(String num1, String num2) {
        int m=num1.length();
        int n=num2.length();
        if(m<n){
            String res=num1;
            num1=num2;
            num2=res;
        }
        int diff=Math.abs(n-m);
        for(int i=1;i<=diff;++i){
            num2="0"+num2;
        }
        int len=Math.max(n,m);
        int t=0;
        String res=new String();
        for(int i=len-1;i>=0;--i){
            int num=num1.charAt(i)-'0'+num2.charAt(i)-'0'+t;
            t=num/10;
            num=num%10;
            res=String.valueOf(num)+res;
        }
        if(t>0) res=String.valueOf(t)+res;
        return res;
    }
}
