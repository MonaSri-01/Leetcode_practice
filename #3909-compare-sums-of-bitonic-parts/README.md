# LeetCode 3909 - Compare Sums of Bitonic Parts

**Difficulty:** Medium\
**Language:** Java\
**Topic:** Arrays

## Approach

Initialize `asc` with the first element and `desc` with the last element.

Traverse the array and compare each element with the previous element:

- If the current element is greater than the previous element, add the current element to `asc`.
- Otherwise, add the previous element to `desc`.

Finally, compare the two sums:

- Return `0` if `asc` is greater.
- Return `1` if `desc` is greater.
- Return `-1` if both sums are equal.

Use `long` for the sums to handle larger values.

## Complexity

- **Time:** O(n), where `n` is the length of the array.
- **Space:** O(1), using only a constant amount of extra space.
