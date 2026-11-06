# LeetCode 53 - Maximum Subarray

**Difficulty:** Medium\
**Language:** Java\
**Topic:** Arrays, Dynamic Programming

## Approach

Initialize `sum` and `total_max` with the first element of the array.

Traverse the array from the second element:

- Add the current element to `sum`.
- If the current element is greater than the updated `sum`, reset `sum` to the current element.
- Update `total_max` whenever `sum` becomes greater than the current maximum sum.

Finally, return `total_max`, which stores the maximum sum of a contiguous subarray.

## Complexity

- **Time:** O(n), where `n` is the length of the array.
- **Space:** O(1), using only a constant amount of extra space.
