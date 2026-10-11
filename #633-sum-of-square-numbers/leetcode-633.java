class Solution {
    public boolean judgeSquareSum(int c) {
        int sqr_rt = (int) Math.sqrt(c);
        int start = 0; 
        int end = sqr_rt;
        long a, b;

        while (start <= end){
            a = start * start;
            b = end * end;
            if (a + b == c)
                return true;
            else if (a + b < c)
                start ++;
            else
                end --; 
        }
        return false;
    }
}