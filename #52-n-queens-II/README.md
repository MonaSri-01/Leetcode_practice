# LeetCode 52 - N-Queens II

**Difficulty:** Hard  
**Language:** Java  
**Topic:** Backtracking, Recursion

## Approach

Use backtracking to find all possible arrangements of `n` queens on an `n × n` chessboard.

For each row, try placing a queen in every column. Before placing a queen, check whether its left diagonal, top, and right diagonal are safe.

- If all three directions are safe, place a queen by setting the cell to `1`.
- Recursively process the next row.
- After returning from recursion, remove the queen by resetting the cell to `0` to explore other possibilities.

When all rows have been processed, increment the `solutions` counter. Finally, return the total number of valid arrangements.

## Complexity

- **Time:** O(n!), approximately, due to exploring possible queen placements.
- **Space:** O(n²) for the chessboard, with additional recursion stack space of O(n).