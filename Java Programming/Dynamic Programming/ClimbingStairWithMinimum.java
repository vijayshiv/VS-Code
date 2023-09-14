import java.util.Arrays;
import java.util.Scanner;

public class ClimbingStairWithMinimum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the lenght of array : ");
        int n = in.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        
        Integer[] dp = new Integer[n + 1];
        dp[n] = 0;

        for (int i = n - 1; i >= 0; i--) {
            if(arr[i] > 0){
                int min = Integer.MAX_VALUE;
                for (int j = 1; j <= arr[i] && i + j < dp.length; j++) {
                    if(dp[i+j] != null){
                        min = Math.min(min, dp[i + j]);
                    }
                }

                if(min != Integer.MAX_VALUE){
                     dp[i] = min + 1;
                }
            }
        }

        System.out.println(Arrays.toString(dp));
        in.close();
    }
}
