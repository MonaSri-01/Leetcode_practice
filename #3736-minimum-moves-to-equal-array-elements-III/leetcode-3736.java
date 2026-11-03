class Solution {
    public int minMoves(int[] nums) {
        int max = 0;
        int sum = 0;
        for (int ind = 0; ind < nums.length; ind ++){
            sum += nums[ind];
            if (max < nums[ind])
                max = nums[ind];
        }
        return max * nums.length - sum;
    }
}