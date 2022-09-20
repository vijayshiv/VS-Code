// We are doing a normal sum of numbers but our digits are in array form
//we can only put 0 - 9 digits in single place of arary

import java.util.Scanner;

public class SumOfTwoArrays {
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of 1st array : ");
        int n1 = in.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter the values : ");
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = in.nextInt();
        }

        System.out.print("Enter the length of 2nd array : ");
        int n2 = in.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter the values : ");
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = in.nextInt();
        }

        int[] sum = new int[n1 > n2? n1: n2];
        int c =0;

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = sum.length - 1;

       while(k >= 0){
            int d = c;

            if(i >= 0){
                d += arr1[i];
            }

            if(j >= 0){
                d += arr2[j];
            }

            c = d / 10;
            d = d % 10;

            sum[k] = d;

            i--;
            j--;
            k--;
        }

        if(c != 0){
            System.out.print(c);
        }

        for(int val : sum){
            System.out.print(val);
        }

        in.close();

    }
}
