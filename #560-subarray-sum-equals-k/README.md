# LeetCode 560 - Subarray Sum Equals K

**Difficulty:** Medium  
**Language:** Python  
**Topics:** Array, Hash Table, Prefix Sum

## Approach

Used the **Prefix Sum + HashMap** technique to count the number of continuous subarrays whose sum equals `k`.

1. Initialize a prefix sum dictionary with `{0: 1}` to handle subarrays starting from index 0.
2. Iterate through the array and calculate the cumulative sum (`curr`).
3. Calculate the required previous prefix sum using `curr - k`.
4. If `curr - k` exists in the dictionary, add its frequency to the count.
5. Update the frequency of the current prefix sum in the dictionary.
6. Return the total count.

## Key Concept

**Prefix Sum:** The sum of all elements from the beginning of the array up to the current position.

The subarray sum can be calculated using:

`Current Prefix Sum - Previous Prefix Sum = k`

Using a HashMap allows us to find the required previous prefix sum efficiently without checking every possible subarray.

## Complexity Analysis

- **Time Complexity:** O(n) – Traverses the array only once. Dictionary operations take O(1) average time.
- **Space Complexity:** O(n) – Stores prefix sums and their frequencies in the dictionary.