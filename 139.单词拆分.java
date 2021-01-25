class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n=s.length();

        boolean[] memo=new boolean[n+1];//s中以i-1结尾的字符串是否可被wordDict拆分
        memo[0]=true;
        for(int i=1;i<=n;++i){
            for(int j=0;j<i;++j){
                if(memo[j]==true&&wordDict.contains(s.substring(j,i))){
                    memo[i]=true;
                    break;
                }
            }
        }
        return memo[n];
    }
}
