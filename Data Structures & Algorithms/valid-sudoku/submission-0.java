class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                char ch=board[i][j];
                if(ch=='.'){
                    continue;
                }
                if(!isValid(board,i,j)){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isValid(char[][] board,int row,int col){
        char ch=board[row][col];
        for(int i=0;i<board.length;i++){
            if(ch==board[i][col] && i!=row){
                return false;
            }
        }
        for(int i=0;i<board[0].length;i++){
            if(ch==board[row][i] && i!=col){
                return false;
            }
        }

        int sRow=row/3*3;
        int sCol=col/3*3;
        for(int i=sRow;i<sRow+3;i++){
            for(int j=sCol;j<sCol+3;j++){
                if(board[i][j]==ch && i!=row && j!=col){
                    return false;
                }
            }
        }
        return true;
    }
}
