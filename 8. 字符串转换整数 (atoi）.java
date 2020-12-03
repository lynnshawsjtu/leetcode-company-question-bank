class Solution {
    public int myAtoi(String s) {
        //主要考虑前导空格，符号和溢出问题
        char[] chars=s.toCharArray();
        int n=chars.length;
        int idx=0;
        while(idx<n&&chars[idx]==' '){
            //去掉前导空格
            idx++;
        }
        if(idx==n){
            return 0;//去掉前导空格后就到了末尾
        }
        boolean negative=false;
        if(chars[idx]=='-'){
            negative=true;
            idx++;
        } else if(chars[idx]=='+'){
            idx++;
        } else if(!Character.isDigit(chars[idx])) return 0;
        int ans=0;
        while(idx<n&&Character.isDigit(chars[idx])){
            int digit=chars[idx]-'0';
            if(ans>(Integer.MAX_VALUE-digit)/10){
                return negative?Integer.MIN_VALUE:Integer.MAX_VALUE;
            }
            ans=ans*10+digit;
            idx++;
        }
        return negative?-ans:ans;
    }
}
