# LeetCode 287 - Find the Duplicate Number

**Difficulty:** Medium  
**Language:** Java  
**Topic:** Arrays

## Approach

Create an auxiliary array initialized with `-1` to keep track of the numbers that have already been encountered.

Traverse through `nums`:

- If `arr[num] > 0`, the number has already been encountered, so it is the duplicate.
- Otherwise, store the number at `arr[num]`.

Return the duplicate number when it is found.

## Complexity

- **Time:** O(n)
- **Space:** O(n)