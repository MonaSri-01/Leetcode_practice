# LeetCode 242 - Valid Anagram

**Difficulty:** Easy  
**Language:** Java  
**Topic:** Strings, Sorting

## Approach

First, compare the lengths of the two strings. If they are different, they cannot be anagrams.

Convert both strings into character arrays and sort them. If the sorted arrays contain the same characters in the same order, the strings are anagrams. Otherwise, they are not.

## Key Concept

- Character arrays
- Sorting
- Comparing sorted arrays

## Complexity

- **Time:** O(n log n)
- **Space:** O(n)