class Solution {
    public String countAndSay(int n) {
        String s=new String();
        s=s+"1";
        if(n==1) return s;
        for(int j=2;j<=n;++j){
            int len=s.length();
            char ch=s.charAt(0);
            int num=0;
            String s1=new String();
            for(int i=0;i<=len-1;++i){
                if(s.charAt(i)==ch){
                    num++;
                    
                }
                else{
                    s1+=String.valueOf(num);
                    s1+=ch;
                    ch=s.charAt(i);
                    num=1;
                }
            }
            s1+=String.valueOf(num);
            s1+=ch;
            s=s1;
        }
        return s;
    }
}
