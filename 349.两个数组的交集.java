class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1==null||nums2==null) return null;
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        for(int item:nums1) set1.add(item);
        for(int item:nums2){
            if(set1.contains(item)) set2.add(item);
        }

        int[] result=new int[set2.size()];
        int start=0;
        for(int item:set2){
            result[start]=item;
            start++;
        }

        return result;

    }
}
