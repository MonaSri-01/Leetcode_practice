class Solution {
    public String convertToTitle(int columnNumber) {

        int columnNo = columnNumber;
        StringBuilder columnTitle = new StringBuilder();
        if (columnNumber <= 26){
            columnTitle.append( (char)(('A' + columnNumber) - 1) );
            return columnTitle.toString();
        }
        
        while(columnNumber > 26){
            if (columnNumber % 26 == 0){
                if (columnNumber % 26 == 0){
                    columnTitle.append ('Z');
                    columnNumber = columnNumber / 26 - 1;
                    System.out.println(columnNumber);
                }
                
                else{
                    columnTitle.append ((char)(('A' + columnNumber % 26) - 1));
                    columnNumber = columnNumber / 26 - 1;
                }
            }
            else{
                columnTitle.append( (char)(('A' + columnNumber % 26) - 1));
                columnNumber /= 26;
            }
        }
        
            columnTitle.append ( (char)(('A' + columnNumber) - 1) );

        return columnTitle.reverse().toString();
    }
}