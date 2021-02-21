class Solution {
    public String reverseWords(String s) {
        //用好api
        String[] words=s.trim().split(" +");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ",words);
    }
}
