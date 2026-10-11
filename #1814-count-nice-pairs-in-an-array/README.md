# LeetCode 1814 - Count Nice Pairs in an Array

**Difficulty:** Medium  
**Language:** Java  
**Topic:** Arrays, HashMap, Counting

## Approach

For each number, reverse its digits and calculate `num - rev(num)`.

Two numbers form a nice pair if their calculated values are equal. Use a `HashMap` to count how many times each value appears.

For each key, calculate the number of pairs using:

**Number of pairs = Frequency × (Frequency − 1) ÷ 2**

Add the pair counts and apply modulo `1,000,000,007` to keep the result within the required limit. Use `long` to avoid integer overflow during calculations.

## Complexity

- **Time:** O(n × d), where `d` is the maximum number of digits in a number.
- **Space:** O(n), for the HashMap in the worst case.