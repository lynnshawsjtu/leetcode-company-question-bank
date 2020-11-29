import java.util.Map.Entry;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int []rst=new int[k];
        HashMap<Integer,Integer> frequency=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;++i) frequency.merge(nums[i],1,Integer::sum);
        ArrayList<Entry<Integer,Integer>> entryList=new ArrayList<>(frequency.entrySet());
        entryList.sort((o1,o2)->o2.getValue()-o1.getValue());
        for(int i=0;i<k;++i) rst[i]=entryList.get(i).getKey();
        return rst;
    }
}
