class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0) return 0;//空串返回0
        int len=needle.length();
        int j=0;//needle指针
        for(int i=0;i<haystack.length();++i){
            if(haystack.charAt(i)==needle.charAt(j)){
                if(j==len-1) return i-j;
                j++;
            } else{
                i=i-j;//回退
                j=0;
                if(haystack.length()-i<len) return -1;
            }
        }
        return -1;

    }
}
