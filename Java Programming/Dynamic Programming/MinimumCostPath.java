import java.util.*;

public class MinimumCostPath {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows -> ");
        int n = in.nextInt();
        System.out.print("Enter the number of columns -> ");
        int m = in.nextInt();

        int[][] arr = new int[n][m];
        System.out.println("Enter the elements in the " + n + " x " + m + " array -> ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        int[][] dp = new int[n][m];

        for (int i = dp.length - 1; i >= 0; i--) {
            for (int j = dp[0].length - 1; j >= 0; j--) {
                if (i == dp.length - 1 && j == dp[0].length - 1) {
                    dp[i][j] = arr[i][j];
                } else if (i == dp.length - 1) {
                    dp[i][j] = dp[i][j + 1] + arr[i][j];
                } else if (j == dp[0].length - 1) {
                    dp[i][j] = dp[i + 1][j] + arr[i][j];
                } else {
                    dp[i][j] = Math.min(dp[i + 1][j], dp[i][j + 1]) + arr[i][j]; 
                }
            }
        }
        System.out.println("The minimum cost is -> "+ dp[0][0]);
        // for (int i = 0; i < dp.length; i++) {
        //     for (int j = 0; j < dp[0].length; j++) {
        //         System.out.print(dp[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        in.close();
    }
}
