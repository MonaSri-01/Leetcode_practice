# LeetCode 3736 - Minimum Moves to Equal Array Elements III

**Difficulty:** Easy  
**Language:** Java  
**Topic:** Arrays, Math

## Approach

Traverse the array to find the maximum element and calculate the sum of all elements.

To make all elements equal to the maximum element, calculate the difference between the maximum possible total sum and the current sum.

**Formula:**

`Minimum Moves = (Maximum Element × Array Length) − Sum of Elements`

Return the calculated result.

## Complexity

- **Time:** O(n), where `n` is the length of the array.
- **Space:** O(1), using only a constant amount of extra space.