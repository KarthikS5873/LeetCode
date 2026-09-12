class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
            HashSet<Character> row=new HashSet<>();
            HashSet<Character> col=new HashSet<>();
            for(int j=0;j<board[i].length;j++){
                if(row.contains(board[i][j]) && board[i][j]!='.'){
                    return false;
                }
                else if(board[i][j]!='.'){
                    row.add(board[i][j]);
                }
                if(col.contains(board[j][i]) && board[j][i]!='.'){
                    return false;
                }
                else if(board[j][i]!='.'){
                    col.add(board[j][i]);
                }
            }
        }
        for(int i=0;i<9;i++){
            HashSet<Character> box=new HashSet<>();
            for(int j=3*(i/3);j<3*(i/3)+3;j++){
                for(int k=3*(i%3);k<3*(i%3)+3;k++){
                    if(box.contains(board[j][k]) && board[j][k]!='.'){
                        return false;
                    }
                    else if(board[j][k]!='.'){
                        box.add(board[j][k]);
                    }
                }
            }
        }
        return true;
    }
}