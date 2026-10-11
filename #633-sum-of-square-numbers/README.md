# LeetCode 633 - Sum of Square Numbers

**Difficulty:** Medium  
**Language:** Java  
**Topic:** Two Pointers, Math

## Approach

Calculate the integer square root of `c` to determine the maximum possible value for the two numbers.

Use two pointers, `start` and `end`, to check candidate numbers. Calculate their squares and compare their sum with `c`.

- If the sum equals `c`, return `true`.
- If the sum is less than `c`, increment `start`.
- If the sum is greater than `c`, decrement `end`.

If no pair satisfies the condition, return `false`.

Use `long` for square calculations to prevent integer overflow with large inputs.

## Complexity

- **Time:** O(√c)
- **Space:** O(1)