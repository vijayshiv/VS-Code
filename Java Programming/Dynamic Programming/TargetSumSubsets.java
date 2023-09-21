import java.util.*;

public class TargetSumSubsets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the array -> ");
        int n = in.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elements int he array -> ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.print("Enter the target sum -> ");
        int tar = in.nextInt();

        boolean[][] dp = new boolean[n + 1][tar + 1];

        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j <dp[0].length; j++){
                if(i == 0 && j == 0){
                    dp[i][j] = true;
                }
                else if(i == 0){
                    dp[i][j] = false;
                }
                else if(j == 0){
                    dp[i][j] = true;
                }
                else{
                    if(dp[i - 1][j] == true){
                        dp[i][j] = true;
                    }
                    else{
                        int val = arr[i - 1];
                        if(j >= val){
                            if(dp[i - 1][j - val] == true){
                                dp[i][j] = true;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(dp[arr.length][tar]);
        in.close();
    }
}
