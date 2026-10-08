class Solution {
    public boolean isSafe(int row, int col,char[][] board,int n){
        int dupRow=row;
        int dupCol=col;
       //for left upper diagonal
        while(row>=0 && col>=0){
            if(board[row][col]=='Q'){
                return false;
            }
            row--;
            col--;
        }
        col=dupCol;
        row=dupRow;
       //for left same column
        while(col>=0){
            if(board[row][col]=='Q'){
                return false;
            }
            col--;
        }

        row=dupRow;
        col=dupCol;
    //for left lower diagonal
        while(row<n && col>=0){
            if(board[row][col]=='Q'){
                return false;
            }
            row++;
            col--;
        }
        return true;

    }

    public void solve(int col,char[][] board,List<List<String>> ans,int n){
        if(col==n){
            List<String> temp=new ArrayList<>();
            for(int i=0; i<n; i++){
                temp.add(new String(board[i]));
            }
            ans.add(temp);
            return;
        }
        for(int row=0; row<n; row++){
            if(isSafe(row,col,board,n)){
                board[row][col]='Q';

                solve(col+1,board,ans,n);
             //backtracking agr Q nhi rkh skte to pichle Q ko erase krdo
                board[row][col]='.';
            }
        }
        
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();

        char[][] board=new char[n][n];
        for(int i=0; i<n; i++){
            Arrays.fill(board[i],'.');

        }
        solve(0,board,ans,n);
        return ans;
 
        
    }
}