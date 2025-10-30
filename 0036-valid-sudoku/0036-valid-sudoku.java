class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rset=new HashSet[9];
        Set<Character>[] cset=new HashSet[9];
        Set<Character>[] bset=new HashSet[9];
        for(int i=0;i<9;i++){
            rset[i]=new HashSet<>(); 
            cset[i]=new HashSet<>(); 
            bset[i]=new HashSet<>(); 
        }
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                if((!rset[i].add(board[i][j])) || (!cset[j].add(board[i][j])) || (!bset[(i/3)*3+(j/3)].add(board[i][j])))
                    return false;
            }
        }
        return true;
    }
}