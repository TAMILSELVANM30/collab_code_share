package TTT;

import java.util.Scanner;

public class Game {
    private Player[] players;
    private Board board;
    private int currentPlayerIndex;
    public Game(Player p1, Player p2){
        this.board=new Board(3);
        this.players=new Player[]{p1,p2};
        this.currentPlayerIndex=0;
    }
    public void startGame(){
        Scanner s=new Scanner(System.in);
        System.out.println("Tic Tac Toe Game");
        System.out.println("Enter row and column b/w 0 and 2");
        board.display();
        while(true){
            Player currentPlayer= players[currentPlayerIndex];
            System.out.println(currentPlayer.getName()+ " 's Turn");
            System.out.println("Symbol is: "+currentPlayer.getSymbol());

            System.out.println("Enter row: ");
            int row= s.nextInt();
            System.out.println("Enter column: ");
            int col= s.nextInt();

            boolean moveSuccess=board.makeMove(row,col,currentPlayer.getSymbol());

            if(!moveSuccess){
                System.out.println("Invalid move. Try again");
                continue;
            }
            board.display();

            if(isWinner(currentPlayer.getSymbol())){
                System.out.println(currentPlayer.getName()+" Wins the game!");
            }
            if(board.isBoardFull()){
                System.out.println("Game Draw");
                break;
            }
            switchPlayer();
        }
    }

    private boolean isWinner(Symbol symbol) {
        return checkRows(symbol)||checkColumns(symbol)||checkMainDiagonal(symbol)||checkAntiDiagonal(symbol);
    }

    private boolean checkRows(Symbol symbol) {
        int size=board.getSize();
    }
    private boolean checkColumns(Symbol symbol) {
        int size= board.getSize();
        for(int col)
    }
    private boolean checkMainDiagonal(Symbol symbol) {
    }
    private boolean checkAntiDiagonal(Symbol symbol) {
    }



    private void switchPlayer() {
        currentPlayerIndex=1-currentPlayerIndex;
    }

}
