# LeetCode 171 - Excel Sheet Column Number

**Difficulty:** Easy  
**Language:** Java  
**Topic:** Strings, Math

## Approach

Traverse the string from right to left, starting from the last character.

Each character represents a number from `1` to `26`, where `A = 1`, `B = 2`, ..., `Z = 26`.

For each character:
- Calculate its numerical value using `character - 64`.
- Multiply it by `26` raised to the power of its position, starting from `0` at the rightmost character.
- Add the result to `columnNo`.

Finally, return the calculated column number.

## Complexity

- **Time:** O(n), where `n` is the length of the column title.
- **Space:** O(1), using a constant amount of extra space.