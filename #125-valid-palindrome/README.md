# LeetCode 125 - Valid Palindrome

**Difficulty:** Easy  
**Language:** Python  
**Topics:** Two Pointers, Strings

## Approach

Used string preprocessing and the **Two Pointers** technique to check whether the given string is a palindrome.

1. Convert the entire string to lowercase using `lower()` to make the comparison case-insensitive.
2. Create a new string containing only alphanumeric characters using `isalnum()`, removing spaces and special characters.
3. Initialize two pointers:
   - `start` at the beginning of the string.
   - `end` at the last character.
4. Compare the characters at both pointers.
5. If they are different, return `False`.
6. Otherwise, move `start` forward and `end` backward until they meet.
7. If all corresponding characters match, return `True`.

## Complexity Analysis

- **Time Complexity:** O(n) – Traverses the string for preprocessing and palindrome checking.
- **Space Complexity:** O(n) – Creates a new string containing only lowercase alphanumeric characters.