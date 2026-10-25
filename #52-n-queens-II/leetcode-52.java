class Solution {
    int solutions = 0;
	
	//Check for left diagonal boxes
    public boolean leftDiagonal(int row, int col, int[][] board){
        if (row - 1 >= 0 && col - 1 >= 0){
            if (board[row-1][col-1] == 0 && leftDiagonal(row-1, col-1, board))
                return true;
            else
                return false;
        }
        return true;
    }
	
	//Check for top boxes
    public boolean top(int row, int col, int[][] board){
        if (row - 1 >= 0 && col >= 0){
            if (board[row-1][col] == 0 && top(row-1, col, board))
                return true;
            else
                return false;
        }
        return true;
    }
	
	//Check for right diagonal boxes
    public boolean rightDiagonal(int row, int col, int n, int[][] board){
        if (row - 1 >= 0 && col + 1 < n){
            if (board[row-1][col+1] == 0 && rightDiagonal(row-1, col+1, n, board))
                return true;
            else
                return false;
        }
        return true;
    }

    public void totalSolutions(int row, int n, int[][] board){
        if (row == n){
            solutions ++;
            return;
        }
        
        for (int col = 0; col < n; col++){
            if (leftDiagonal(row, col, board) && top(row, col, board) && rightDiagonal(row, col, n, board)){
                board [row][col] = 1;
                totalSolutions(row + 1, n, board);
                board [row][col] = 0;
            }
        }
    }

    public int totalNQueens(int n) {
        int [][] board = new int[n][n];
        if (n == 1) 
            return 1;
        
        for (int row = 0; row < n; row++){
            for (int col = 0; col < n; col++){
                board[row][col] = 0;
            }
        }

        totalSolutions (0, n, board);

        return solutions;
    }
}