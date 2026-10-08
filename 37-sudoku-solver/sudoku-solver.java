class Solution {
  boolean solve(char[][] board){
    for(int i=0; i<board.length; i++){
        for(int j=0; j<board[0].length; j++){
            if(board[i][j]=='.'){
                for(char c='1'; c<='9'; c++){
                    if(isValid(board,i,j,c)){
                        board[i][j]=c;

                        if(solve(board))
                        return true;
                        else
                        //backtrack
                        board[i][j]='.';
                    }
                }
                //no digit fit this call
                return false;
            }
        }
    }
    //board is full
    return true;
  }
  boolean isValid(char[][] board,int row,int col, char c){
    for(int i=0; i<9; i++){
        //col check
        if(board[i][col]==c) return false;
        //row check
        if(board[row][i]==c) return false;
        //3x3 box check 
        if(board[3*(row/3)+ i/3][3*(col/3)+i%3]==c)
        return false;
    }
    return true;
  }
    public void solveSudoku(char[][] board) {
        solve(board);
        
    }
}