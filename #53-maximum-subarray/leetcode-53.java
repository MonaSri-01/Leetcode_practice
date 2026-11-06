class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int total_max = nums[0];
        for (int ind = 1; ind < nums.length; ind ++){
            sum += nums[ind];
            if (nums[ind] > sum)
                sum = nums[ind];
            if (sum > total_max)
                total_max = sum;
        }
        return total_max;
    }
}