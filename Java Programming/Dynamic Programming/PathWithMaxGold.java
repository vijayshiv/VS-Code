import java.util.*;

public class PathWithMaxGold {
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

        for (int j = arr[0].length - 1; j >= 0; j--) {
            for (int i =arr.length - 1; i >= 0; i--) {
                if (j == arr[0].length - 1) {
                    dp[i][j] = arr[i][j];
                } else if (i == 0) {
                    dp[i][j] = arr[i][j] + Math.max(dp[i][j + 1], dp[i + 1][j + 1]);
                } else if (i == arr.length - 1) {
                    dp[i][j] = arr[i][j] + Math.max(dp[i][j + 1], dp[i - 1][j + 1]);
                } else {
                    dp[i][j] = arr[i][j] + Math.max(dp[i][j + 1], Math.max(dp[i + 1][j + 1], dp[i - 1][j + 1]));
                }
            }
        }

        System.out.println("The output is -> ");
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        in.close();
    }
}