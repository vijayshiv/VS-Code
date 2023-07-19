import java.util.*;

public class ClimbingStairsWithJump {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements -> ");
        int n = in.nextInt();
        System.out.print("Enter the elements -> ");
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }

        int[] dp = new int[n + 1];
        dp[n] = 1;
        
        for(int i = n - 1; i >= 0; i--){
            for(int j = 1; j <= arr[i] && i + j <dp.length; j++){
                dp[i] += dp[i + j];
            }
        }

        System.out.println(dp[0]);
        in.close();
    }
}