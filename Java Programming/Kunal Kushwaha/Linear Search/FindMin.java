import java.util.*;

public class FindMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the array and elements in next line -> ");
        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
    
        int val = minimum(arr);
        System.out.println("The minimum is -> " + val);
        in.close();
    }

    public static int minimum(int[] arr){
        int ans = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(ans > arr[i]){
                ans = arr[i];
            }
        }

        return ans;
    }
}
