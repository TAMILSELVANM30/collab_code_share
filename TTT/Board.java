package TTT;

public class Board {


    private int size;
    private Symbol[][] board;

    public Board(int size) {
        this.size = size;
        board=new Symbol[size][size];
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j]=Symbol.EMPTY;
            }
        }
    }
    public void display() {
        System.out.println();
        System.out.println("Current Board");
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.println(" ");
            for (int j = 0; j < size; j++) {
                if (board[i][j] == Symbol.EMPTY) {
                    System.out.println(" ");
                } else {
                    System.out.print(board[i][j]);
                }
                if (j < size - 1) {
                    System.out.println(" | ");
                }
            }
            System.out.println();
            if (i < size - 1) {
                System.out.println("-----------------------------------");
            }
        }
    }
        public boolean makeMove(int row,int col, Symbol symbol){
            if(!isValidMove(row,col)){
                return false;
            }
            board[row][col]=symbol;
            return true;
        }
        private boolean isValidMove(int row,int col){
        if(row<0 || row>=size || col<0 || col>=size){
            return false;
        }
        return board[row][col]==Symbol.EMPTY;
        }


    public boolean isBoardFull() {
        return false;
    }
}
