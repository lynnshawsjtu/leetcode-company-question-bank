class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st=new Stack<Integer>();
        int n=s.length();
       int[] mark=new int[n];
       int left=0;
       int len=0;
       int ans=0;
       for(int i=0;i<s.length();++i){
           if(s.charAt(i)=='(') st.push(i);
           else{
               if(st.empty()) mark[i]=1;//不需要多余的右括号，标记
               else st.pop();
           }
       }
       //未匹配的左括号是不需要的，标记
       while(!st.empty()){
           mark[st.pop()]=1;
       }
        //寻找标记与标记之间的最大长度
        for(int i=0;i<s.length();++i){
            if(mark[i]==1) {
                len=0;
                continue;
            }
            len++;
            ans=Math.max(ans,len);
        }
        return ans;
    }
}
