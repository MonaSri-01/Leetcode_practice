class Solution {
    public int compareBitonicSums(int[] nums) { 

        int len = nums.length;
        long asc = nums[0];
        long desc = nums[len - 1]; 
        for (int ind = 1; ind < len; ind ++){
            if (nums[ind] > nums[ind - 1])
                asc += nums[ind];
            else
                desc += nums[ind - 1];
        }
        
        if (asc > desc) return 0;
        if (desc > asc) return 1;
        return -1;
    }
}