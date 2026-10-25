class Solution {
    public boolean isUgly(int n) {
        
        if (n == 1) return true;
        if (n <= 0) return false;

        int copynum = n;
        while (copynum % 2 == 0 || copynum % 3 == 0 || copynum % 5 == 0){
            if (copynum % 2 == 0) copynum /= 2;
            else if (copynum % 3 == 0) copynum /= 3;
            else copynum /= 5;
        }
        if (copynum == 1) return true;
        return false;
    }
}