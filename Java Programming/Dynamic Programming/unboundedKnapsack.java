import java.util.*;

public class unboundedKnapsack {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] vals = new int[n];
        for (int i = 0; i < vals.length; i++) {
            vals[i] = in.nextInt();
        }

        int[] wts = new int[n];
        for (int i = 0; i < wts.length; i++) {
            wts[i] = in.nextInt();
        }

        int cap = in.nextInt();
        int[] dp = new int[cap + 1];
        dp[0] = 0;
        for (int bagc = 1; bagc <= cap; bagc++) {
            int max = 0;
            for (int i = 0; i < n; i++) {

                if (wts[i] <= bagc) {
                    int rbagc = bagc - wts[i];
                    int rbagv = dp[rbagc];
                    int tbagv = rbagv + vals[i];

                    if (tbagv > max) {
                        max = tbagv;
                    }
                }
            }
            dp[bagc] = max;
        }

        System.out.println(dp[cap]);
        in.close();
    }
}
