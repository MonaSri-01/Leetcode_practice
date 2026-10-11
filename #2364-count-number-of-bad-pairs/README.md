# LeetCode 2364 - Count Number of Bad Pairs

**Difficulty:** Medium  
**Language:** Java  
**Topic:** Arrays, HashMap, Counting

## Approach

Calculate a key for each element using `nums[i] - i`. Two indices form a good pair if their keys are equal.

Use a `HashMap` to count the frequency of each key. Calculate the total number of possible pairs and subtract the number of good pairs to obtain the number of bad pairs.

**Formulas:**

- Total pairs = `n × (n − 1) ÷ 2`
- Good pairs = `Frequency × (Frequency − 1) ÷ 2`
- Bad pairs = `Total pairs − Good pairs`

Use `long` to handle large pair counts without integer overflow.

## Complexity

- **Time:** O(n)
- **Space:** O(n), for the HashMap in the worst case.