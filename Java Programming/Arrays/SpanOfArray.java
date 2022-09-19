// Span means the difference btw the max and the min values of the array

import java.util.*;

public class SpanOfArray{
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elemenets in the array : ");
        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        int max = arr[0];
        int min = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }

            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println();

        int span = max - min;
        System.out.println("The difference of max i.e ["+max+"] and min i.e ["+min+"] is " + span);
        in.close();
    }
}