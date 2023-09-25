import java.util.Scanner;

public class CoinChangeCombination{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number coins you have -> ");
        int n = in.nextInt();

        System.out.print("Enter the coins that you have -> ");
        int[] coins = new int[n];

        for(int i = 0; i < coins.length; i++){
            coins[i] = in.nextInt();
        }

        System.out.print("Enter the target amount you want combinations with -> ");
        int amt = in.nextInt();

        int[] dp = new int[amt + 1];
        dp[0] = 1;

        for(int i = 0; i < coins.length; i++){
            for(int j = coins[i]; j < dp.length; j++){
                dp[j] += dp[j - coins[i]];
            }
        }

        System.out.print("The total number of combinations are -> " + dp[amt]);
        in.close();
    }
}