class Solution {
    public String reverseWords(String s) {
        //split方法
        String[] strs=s.split(" ");
        StringBuffer buffer=new StringBuffer();
        for(int i=0;i<strs.length;++i){
            buffer.append(new StringBuffer(strs[i]).reverse().toString());
            buffer.append(" ");
        }
        return buffer.toString().trim();
    }
}
