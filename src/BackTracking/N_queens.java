package BackTracking;

public class N_queens {
    public static boolean isSafe(int[][] board, int row, int col) {

        int r=row-1;
        while(r>=0){
            if(board[r][col]==1){
                return false;
            }
            r--;
        }
        int r1=row-1;
        int c1=col-1;
while(r1>=0&&c1>=0){
    if(board[r1][c1]==1){
        return false;
    }
    r1--;
    c1--;

}
int r2=row-1;
int c2=col+1;
while(r2>=0&&c2<board.length){
    if(board[r2][c2]==1){
        return false;
    }
    r2--;
    c2++;
}



        return true;
    }
    public static boolean solve(int[][] board, int row) {
        if(row== board.length){
            printBoard(board);
            return true;
        }
        for (int i=0;i<board.length;i++){

            if(isSafe(board,row,i)){
board[row][i]=1;
if(solve(board,row+1)){
    return true;
}
                board[row][i]=0;

            }
        }
return false;
    }
    public static void printBoard(int[][] board){
        for(int i=0;i< board.length;i++){
            for(int j=0;j< board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=4;
        int[][] board=new int[n][n];
        solve(board,0);

    }
}
