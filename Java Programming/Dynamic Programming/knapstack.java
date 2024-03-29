import java.util.*;

public class knapstack {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of items -> ");
        int n = in.nextInt();
        int[] vals = new int[n];
        int[] wts = new int[n];

        System.out.print("Enter the values of each bag can have -> ");
        for (int i = 0; i < vals.length; i++) {
            vals[i] = in.nextInt();
        }

        System.out.print("Enter the capacity each bag can have -> ");
        for (int i = 0; i < wts.length; i++) {
            wts[i] = in.nextInt();
        }
        System.out.print("Enter the capacity you want -> ");
        int cap = in.nextInt();

        int[][] dp = new int[n + 1][cap + 1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (j >= wts[i - 1]) {
                    int rCap = j - wts[i - 1];

                    if (dp[i - 1][rCap] + vals[i - 1] > dp[i - 1][j]) {
                        dp[i][j] = dp[i - 1][rCap] + vals[i - 1];
                    } else {
                        dp[i][j] = dp[i - 1][j];
                    }
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        System.out.print("Max wtsacity is -> " + dp[n][cap]);
        in.close();
    }
}