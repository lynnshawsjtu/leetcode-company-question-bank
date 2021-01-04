class Solution {
    public int romanToInt(String res) {
        char[] s=res.toCharArray();
        int num=0;
        for(int i=0;i<=s.length-1;++i){
            if(s[i]=='M') num=num+1000;
            else if(s[i]=='D') num=num+500;
            else if(s[i]=='C'){
                if(i<s.length-1&&(s[i+1]=='D'||s[i+1]=='M'))
                num=num-100;
                else num=num+100;
            }
            else if(s[i]=='L') num=num+50;
            else if(s[i]=='X'){
                if(i<s.length-1&&(s[i+1]=='L'||s[i+1]=='C'))
                num=num-10;
                else num=num+10;
            }
            else if(s[i]=='V') num=num+5;
            else{
                 if(i<s.length-1&&(s[i+1]=='V'||s[i+1]=='X'))
                num=num-1;
                else num=num+1;
            }
        }
        return num;
    }
    
}
