class Solution {
    public int findDuplicate(int[] nums) {
        int len = nums.length;
        int[] arr = new int[len];
        Arrays.fill(arr,-1);

        for (int num : nums){
            if (arr[num] > 0)
                return num;

            else
                arr[num] = num;
        }
        return 0;
    }
}