class Solution {
    public int titleToNumber(String columnTitle) {
        
        int len = columnTitle.length();
        int columnNo = 0;
        int power;

        for (int ind = len-1; ind >= 0; ind --){
            power = (len-1) - ind;
            columnNo += (Math.pow(26, power) * (columnTitle.charAt(ind) - 64)) ;
        }

        return columnNo;
    }
}