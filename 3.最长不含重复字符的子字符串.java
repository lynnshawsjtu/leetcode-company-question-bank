class Solution {
    public int lengthOfLongestSubstring(String s) {
        //用set维护一个不重复的窗口
        int res=0;
        Set<Character> set=new HashSet<>();
        for(int l=0,r=0;r<s.length();++r){
            char c=s.charAt(r);
            while(set.contains(c)) set.remove(s.charAt(l++));
            set.add(c);
            res=Math.max(res,r-l+1);
        }
        return res;
       
    }
}
