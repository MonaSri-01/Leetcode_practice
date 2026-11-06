# LeetCode 168 - Excel Sheet Column Title

**Difficulty:** Easy  
**Language:** Java  
**Topic:** Strings, Math

## Approach

Use a `StringBuilder` to construct the column title.

If the column number is less than or equal to 26, directly convert it into its corresponding uppercase alphabet character.

For larger numbers, repeatedly divide the column number by 26 to find the corresponding characters.

- If the remainder is `0`, append `Z` and decrement the quotient to handle the 1-based alphabet numbering.
- Otherwise, convert the remainder into its corresponding alphabet character and update the column number.
- Continue until the column number becomes less than or equal to 26.

Finally, append the remaining character and reverse the `StringBuilder` to obtain the correct column title.

## Complexity

- **Time:** O(log₂₆ n), where `n` is the given column number.
- **Space:** O(log₂₆ n), for storing the resulting column title.