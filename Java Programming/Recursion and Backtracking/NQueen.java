import java.util.*;

public class NQueen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of chess board -> ");
        int n = in.nextInt();
        int[][] chess = new int[n][n];
        printNQueen(chess, "", 0);
        in.close();
    }
    public static void printNQueen(int[][] chess, String ans, int row){
        if(row == chess.length){
            System.out.println(ans);
            return;
        }
        for(int col = 0; col < chess.length; col++){
            if(isQuessSafe(chess, row, col) == true){
                chess[row][col] = 1;
                printNQueen(chess, ans + row + "-" + col + "    ", row + 1);
                chess[row][col] = 0;
            }
        }
    }
    public static boolean isQuessSafe(int[][] chess, int row, int col){
        for(int i = row - 1, j = col; i >= 0; i--){
            if(chess[i][j] == 1){
                return false;
            }
        }
        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--){
            if(chess[i][j] == 1){
                return false;
            }
        }
        for(int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i--, j++){
            if(chess[i][j] == 1){
                return false;
            }
        }
        return true;
    }
}
