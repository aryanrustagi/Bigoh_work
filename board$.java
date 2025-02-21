import java.util.Scanner;

public class board$ {

    private static final int ROWS = 5;
    private static final int COLS = 5;
    private static final char MINE = '*';
    private static final char EMPTY = '.';
    private static final char HIDDEN = '-';
    private static char[][] board;
    private static char[][] displayBoard;

    public static void main(String[] args) {
        setupBoard();
        displayBoard = new char[ROWS][COLS];
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                displayBoard[i][j] = HIDDEN;
            }
        }

        playGame();
    }

    private static void setupBoard() {
        board = new char[][] {
            { '.', '*', '.', '.', '.' },
            { '.', '.', '*', '.', '.' },
            { '*', '.', '.', '*', '.' },
            { '.', '.', '.', '.', '.' },
            { '.', '.', '.', '.', '*' }
        };
    }

    private static void playGame() {
        Scanner scn = new Scanner(System.in);
        boolean gameRunning = true;

        while (gameRunning) {
            printDisplayBoard();
            System.out.print("Enter row and column to uncover (e.g., 1 2): ");
            int row = scn.nextInt();
            int col = scn.nextInt();

            if (row < 0 || row >= ROWS || col < 0 || col >= COLS) {
                System.out.println("Invalid input! Try again.");
                continue;
            }

            if (board[row][col] == MINE) {
                System.out.println("BOOM! You hit a mine. Game over.");
                gameRunning = false;
            } else {
                uncover(row, col);
                if (isWin()) {
                    System.out.println("Congratulations! You've cleared the board!");
                    gameRunning = false;
                }
            }
        }
        printBoard();
        scn.close();
    }

    private static void uncover(int row, int col) {
        if (row < 0 || row >= ROWS || col < 0 || col >= COLS || displayBoard[row][col] != HIDDEN) {
            return;
        }

        int mineCount = countAdjacentMines(row, col);
        if (mineCount > 0) {
            displayBoard[row][col] = (char) ('0' + mineCount);
        } else {
            displayBoard[row][col] = EMPTY;
            for (int dr = -1; dr <= 1; dr++) {
                for (int dc = -1; dc <= 1; dc++) {
                    uncover(row + dr, col + dc);
                }
            }
        }
    }

    private static int countAdjacentMines(int row, int col) {
        int count = 0;
        for (int dr = -1; dr <= 1; dr++) {
            for (int dc = -1; dc <= 1; dc++) {
                int r = row + dr;
                int c = col + dc;
                if (r >= 0 && r < ROWS && c >= 0 && c < COLS && board[r][c] == MINE) {
                    count++;
                }
            }
        }
        return count;
    }

    private static void printDisplayBoard() {
        System.out.println("Current Board:");
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                System.out.print(displayBoard[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void printBoard() {
        System.out.println("Final Board:");
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean isWin() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (board[i][j] == EMPTY && displayBoard[i][j] == HIDDEN) {
                    return false;
                }
            }
        }
        return true;
    }
}