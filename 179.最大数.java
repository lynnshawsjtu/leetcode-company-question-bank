class Solution {
    public String largestNumber(int[] nums) {
        if(nums==null||nums.length==0) return "";
        String[] strArr=new String[nums.length];
        for(int i=0;i<strArr.length;++i){
            strArr[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(strArr,(o1,o2)->(o2+o1).compareTo(o1+o2));

        StringBuilder sb=new StringBuilder();
        for(String aStrArr:strArr){
            sb.append(aStrArr);
        }

        String result=sb.toString();
        if(result.charAt(0)=='0'){
            result="0";//特殊情况，若干个0
        }
        return result;
    }
}
