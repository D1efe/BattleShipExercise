package battleships;

public class Board {

    int[][] boardSize = new int[10][10];

    public Board() {

        this.boardSize = boardSize;
        setBoardSize();
        printBoard();

    }

    private void setBoardSize() {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                boardSize[i][j] = i * j;

            }
        }
    }

    private void printBoard() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                System.out.print(boardSize[i][j] + "\t");
            }
            System.out.println();

        }

    }

    public int[][] getBoardSize() {
        return boardSize;
    }

}
