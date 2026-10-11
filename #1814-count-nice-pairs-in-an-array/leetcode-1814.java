class Solution {
    public int countNicePairs(int[] nums) {
        long count = 0;
        int rev;
        int copynum;
        int digit;
        int key;
        HashMap<Integer, Integer> freq = new HashMap<>();
        int mod = 1_000_000_007;

        for (int num : nums){
            rev = 0;
            copynum = num;
            while (copynum != 0){
                digit = copynum % 10;
                rev = rev * 10 + digit;
                copynum /= 10;
            }

            key = num - rev;
            freq.put (key, freq.getOrDefault(key, 0) + 1);
        }

        for (long val : freq.values()){
            count = (count + (val * (val - 1) / 2)) % mod;
        }
        return (int) count;
    }
}