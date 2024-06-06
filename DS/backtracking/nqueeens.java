public class nqueeens {
    public static boolean issafe(int row,int col,char[][] board){
        for(int i=0;i<board.length;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        
        for(int j=0;j<board.length;j++){
            if(board[row][j]=='Q'){
                return false;
            }
        }

        //upper left cross
        int r = row;
        for(int i=col;r>=0 && i>=0;i--,r--){
            if(board[r][i]=='Q'){
                return false;
            }
        }

        //upper right cross
        r = row;
        for(int i=col;r>=0 && i<board.length;i++,r--){
            if(board[r][i]=='Q'){
                return false;
            }
        }

        //lower left cross
        r = row;
        for(int i=col;r<board.length && i>=0;i--,r++){
            if(board[r][i]=='Q'){
                return false;
            }
        }

        //llower right cross
        r = row;
        for(int i=col;r<board.length && i<board.length;i++,r++){
            if(board[r][i]=='Q'){
                return false;
            }
        }

        return true;
    }

    public static void nqueens( char[][] board, int col) {
        if (col == board.length) {
            for(int i=0;i<board.length;i++){
                for (int j = 0; j < board.length; j++) {
                    if (board[i][j] == 'Q') {
                        System.out.print(board[i][j] + " ");
                    }
                    else {
                        System.out.print("."+" ");
                    }
                }
                System.out.println();
            }
        }
        for (int i = 0; i < board.length; i++) {
                if (issafe(i, col, board)) {
                    board[i][col] = 'Q';
                    nqueens(board, col + 1);
                    board[i][col] = '.';
                }
        }
    }

    public static void main(String[] args) {
        int n = 8;
        char[][] board = new char[n][n];
        nqueens(board, 0);
    }
}
