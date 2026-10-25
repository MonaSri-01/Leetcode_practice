# LeetCode 263 - Ugly Number

**Difficulty:** Easy  
**Language:** Java  
**Topic:** Math

## Approach

If `n` is less than or equal to `0`, return `false`. If `n` is `1`, return `true`.

Repeatedly divide the number by `2`, `3`, or `5` whenever it is divisible by one of these factors.

After all possible divisions, if the remaining number is `1`, it is an ugly number. Otherwise, it is not.

## Complexity

- **Time:** O(log n)
- **Space:** O(1)