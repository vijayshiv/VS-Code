import java.util.Scanner;

public class CoinChangePermutations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number coins you have -> ");
        int n = in.nextInt();

        System.out.print("Enter the coins that you have -> ");
        int[] coins = new int[n];

        for (int i = 0; i < coins.length; i++) {
            coins[i] = in.nextInt();
        }

        System.out.print("Enter the target amount you want combinations with -> ");
        int tar = in.nextInt();

        int[] dp =new int[tar + 1];
        dp[0] = 1;
        for(int i = 1; i < dp.length; i++){
            for(int coin : coins){
                if(coin <= i){
                    int ramt = i - coin;
                    dp[i] += dp[ramt];
                }
            }
        }

        System.out.println("Total number of permutations are -> " + dp[tar]);
        in.close();
        
    }
}
