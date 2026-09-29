# LeetCode 3452 - Sum of Good Numbers

**Difficulty:** Easy  
**Language:** Java  
**Topic:** Arrays

## Approach

For each element, check the elements `k` positions to its left and right.

A number is considered **good** if:
- Both positions are outside the array, or
- The available neighboring value(s) are smaller than the current number.

If the number satisfies the condition, add it to the sum.

## Complexity

- **Time:** O(n)
- **Space:** O(1)