class Solution {
    public long countBadPairs(int[] nums) {
        
        HashMap <Integer, Integer> freq = new HashMap<>();
        long count = 0;
        long good = 0;
        int key;
        long n = nums.length;
        long total = n * (n-1) / 2;

        for (int ind = 0; ind < n; ind ++){
            key = nums[ind] - ind;
            freq.put (key, freq.getOrDefault(key, 0) + 1);
        }

        for (long val : freq.values()){
            good += (val * (val - 1) / 2) ;
        }
        return total - good;
    }
}