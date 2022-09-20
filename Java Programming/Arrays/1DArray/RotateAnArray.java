import java.util.Scanner;

public class RotateAnArray {
    
    // reversing the array 
    public static void reversearray(int[] arr, int n, int m){
        int i = n;
        int j = m;

        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp; 

            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of array -> ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array -> ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }

        System.out.print("Enter the value of k -> ");
        int k = in.nextInt();

        rotatearray(arr, k);

        for(int j = 0; j < arr.length; j++){
            System.out.print(arr[j] + " ");
        }

        in.close();
    }

    public static void rotatearray(int[] arr, int k){
        k = k % arr.length;
        if(k < 0){
            k = k + arr.length;
        }
        //part1
        reversearray(arr, 0, arr.length-k-1);
        //part2
        reversearray(arr, arr.length-k, arr.length-1);
        //part3
        reversearray(arr, 0, arr.length-1);
    }
}
