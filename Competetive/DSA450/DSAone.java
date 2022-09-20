import java.util.*;

public class DSAone{
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int j = 1; j <= t; j++){
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < arr.length; i++){
                arr[i] = in.nextInt();
            } 
            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }
            
        }
        in.close();
        // int[] rev = arr;
        // int i = 0;
        // int j = a.length - 1;

        // while(i < j){
        //     int temp = arr[i];
        //     arr[i] = arr[j];
        //     arr[j] = temp;

        //     i++;
        //     j--;
        // }
    }
}