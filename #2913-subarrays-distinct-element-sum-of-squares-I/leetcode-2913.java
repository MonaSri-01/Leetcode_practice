class Solution {
    public int sumCounts(List<Integer> nums) {
        HashSet<Integer> set = new HashSet<>();
        int len = nums.size();
        int distinct_count;
        int sum_sq = 0;

        for (int ind1 = 0; ind1 < len; ind1 ++){
            for (int ind2 = ind1; ind2 < len; ind2 ++){
                set.add (nums.get(ind2));
                distinct_count = set.size();
                sum_sq += distinct_count * distinct_count;
            }
            set.clear();
        }
        return sum_sq;
    }
}