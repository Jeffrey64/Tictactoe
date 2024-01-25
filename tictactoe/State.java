package tictactoe;

/**
 * Tic-Tac-Toe state variables.
 */
public class State
{
    private int gameState = Constants.STANDBY;

    public int getGameState() {
        return this.gameState;
    }
    
    public void setGameState (int gameState) {
        this.gameState = gameState;
    }

    private int whoseMove = Constants.X;

    public int getWhoseMove() {
        return this.whoseMove;
    }
    
    public void setWhoseMove(int whoseMove) {
        this.whoseMove = whoseMove;
    }

    private String xName = "";

    public String getXName() {
        return this.xName;
    }

    public void setXName(String xName) {
        this.xName = xName;
    }

    private String oName = "";

    public String getOName() {
        return this.oName;
    }
    
    public void setOName(String oName) {
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
        return true;
    }

    public boolean isTie() {
        for (int row = 0; row<Constants.BOARD_SIZE; row++) {
            for (int col=0; col<Constants.BOARD_SIZE; col++) {
                if (getBoardCell(row,col) == Constants.BLANK) {
                    return false;
                }
            }
        }
        return true;
    }
}

