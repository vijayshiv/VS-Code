// We can only move 2.5 chaal like horse in chess

import java.util.*;

public class KnightTour {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of chess board -> ");
        int n = in.nextInt();
        System.out.print("Enter the position of first Knight -> ");
        int r = in.nextInt();
        int c = in.nextInt();
        int[][] chess = new int[n][n];

        printKnightTour(chess, r, c, 1);
        in.close();
    }
    public static void printKnightTour(int[][] chess, int r, int c, int move){
        if(r < 0 || c < 0 || r >= chess.length || c >= chess.length || chess[r][c] > 0 ){
            return;
        } else if(move == chess.length * chess.length){
            chess[r][c] = move;
            displayBoard(chess);
            chess[r][c] = 0;
            return;
        }
        chess[r][c] = move;
        printKnightTour(chess, r - 2, c + 1, move + 1);
        printKnightTour(chess, r - 1, c + 2, move + 1);
        printKnightTour(chess, r + 1, c + 2, move + 1);
        printKnightTour(chess, r + 2, c + 1, move + 1);
        printKnightTour(chess, r + 2, c - 1, move + 1);
        printKnightTour(chess, r + 1, c - 2, move + 1);
        printKnightTour(chess, r - 1, c - 2, move + 1);
        printKnightTour(chess, r - 2, c - 1, move + 1);
        chess[r][c] = 0;
    }
    public static void displayBoard(int[][] chess){
        System.out.println("The outputs are -> ");
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[0].length; j++) {
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }
    }
}
