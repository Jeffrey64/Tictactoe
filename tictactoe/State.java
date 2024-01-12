package tictactoe;

/**
 * Tic-Tac-Toe state variables.
 */
public class State
{
    private int gameState = Constants.STANDBY;
    private int whoseMove = Constants.X;

    public void setwhoseMove(int whoseMove) {
        this.whoseMove = whoseMove;
    }

    public int getwhoseMove() {
        return this.whoseMove;
    }
    private String xName = "";
    public int getxName () {
        return this.xName;
    }

    public void setxName(int xName) {
        this.xName = xName
    }
    private String oName = "";
    public int getoName() {
        return this.oName;
    }

    public void setoName(int oName) {
        this.oName = oName;
    }
    private int[][] board = new int[Constants.BOARD_SIZE][Constants.BOARD_SIZE];
        public int getBoardCell(int row, int col) {
            return this.board[row][col];
        }
        public void setBoardCell(int row, int col, int value) {
            this.board[row][col] = value;
        }
    public boolean isWinner() {
        // You will write this code!!
    }

    public boolean isTie() {
        // You will write this code too!!
    }
}

