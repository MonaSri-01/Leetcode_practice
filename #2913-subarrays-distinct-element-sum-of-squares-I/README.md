# LeetCode 2913 - Subarrays Distinct Element Sum of Squares I

**Difficulty:** Easy\
**Language:** Java\
**Topic:** Arrays, HashSet

## Approach

Use two nested loops to generate all possible subarrays.

For each starting index, use a `HashSet` to store the distinct elements in the current subarray. After adding each element, calculate the square of the number of distinct elements and add it to the total sum.

Clear the set before processing subarrays with the next starting index.

## Complexity

- **Time:** O(n²) on average, assuming constant-time HashSet operations.
- **Space:** O(n), for storing distinct elements in the HashSet.
