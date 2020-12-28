class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> list=new ArrayList<>();
        int M=digits.length();
        if(M==0) return list;
        String[] s=new String[M];
       
        for(int i=0;i<M;++i){
            switch(digits.charAt(i)){
                case '2':s[i]="abc";break;
                case '3':s[i]="def";break;
                case '4':s[i]="ghi";break;
                case '5':s[i]="jkl";break;
                case '6':s[i]="mno";break;
                case '7':s[i]="pqrs";break;
                case '8':s[i]="tuv";break;
                case '9':s[i]="wxyz";break;

            }
        }
        getAllTheStrings(s,0,list,"");
        return list;
    }
   private static void getAllTheStrings(String[] str, int index, List<String> list, String temp) {
       if (index == str.length - 1) {
           for (int i = 0; i < str[index].length(); i++) {
               list.add(temp + str[index].charAt(i));
           }
       } else {
           for (int i = 0; i < str[index].length(); i++) {
               getAllTheStrings(str, index + 1, list, temp + str[index].charAt(i));
           }
       }
   }
}
