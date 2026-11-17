# LeetCode 15 - 3Sum

**Difficulty:** Medium  
**Language:** Python  
**Topic:** Arrays, Sorting, Two Pointers

## Approach

First, sort the array to make it easier to find triplets and handle duplicates.

Use a loop to select the first element of each triplet. Skip duplicate elements to avoid generating repeated triplets. If the current element is greater than `0`, stop the loop because no valid triplet can have a sum of zero.

For each selected element, initialize two pointers:
- `j` starts at the next index.
- `k` starts at the last index.

Calculate the sum of the three elements:

- If the sum is `0`, add the triplet to the result and move both pointers.
- If the sum is less than `0`, increment `j` to increase the sum.
- If the sum is greater than `0`, decrement `k` to decrease the sum.

After finding a valid triplet, skip duplicate values for both pointers to avoid repeated combinations.

Finally, return the list of unique triplets.

## Complexity

- **Time:** O(n²), where `n` is the length of the array. Sorting takes O(n log n), followed by the two-pointer traversal.
- **Space:** O(1) auxiliary space, excluding sorting and the output list.