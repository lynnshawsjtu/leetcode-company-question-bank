class Solution {
    public int subarraySum(int[] nums, int k) {
        //扫描一遍数组，使用map记录同样的和出现的次数
        //对每个i计算累计和sum并判断map内是否存在k-sum
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0,ret=0;

        for(int i=0;i<nums.length;++i){
            sum+=nums[i];
            if(map.containsKey(sum-k)) ret+=map.get(sum-k);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }

        return ret;
    }
}
