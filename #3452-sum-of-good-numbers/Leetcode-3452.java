class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int len = nums.length - 1;
        int sum = 0;
        int prev;
        int next;

        for (int ind = 0; ind <= len; ind++){
            prev = ind - k;
            next = ind + k;

            if (prev < 0 && next > len)
                sum += nums[ind];
            else if (prev < 0 && nums[next] < nums[ind])
                sum += nums[ind];
            else if (next > len && nums[prev] < nums[ind])
                sum += nums[ind];
            else if (prev >= 0 && nums[prev] < nums[ind] && next <= len && nums[next] < nums[ind])
                sum += nums[ind];

        }
        return sum;
        
    }
}