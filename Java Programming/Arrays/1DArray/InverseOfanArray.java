import java.util.Scanner;

public class InverseOfanArray {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        int[] ans = inverse(arr);
        for(int val: ans){
            System.out.print(val + " ");
        }

        in.close();
    }

    public static int[] inverse(int[] arr){
        int[] inv = new int[arr.length];

        for(int j = 0; j < arr.length; j++){
            int v = arr[j];
            inv[v] = j;
        }

        return inv;
    }
}
