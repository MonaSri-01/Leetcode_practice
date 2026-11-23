class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int curr = 0;
        int count = 0;

        for (int ind = 0; ind < nums.length; ind ++){
            curr += nums[ind];
            if (map.containsKey(curr - k))
               count += map.get(curr-k);
            
            map.put(curr, map.getOrDefault(curr, 0) + 1);
        }
        return count;
    }
}