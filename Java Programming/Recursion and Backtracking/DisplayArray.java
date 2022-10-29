import java.util.*;

public class DisplayArray{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements in array : ");
        int n = in.nextInt();
        System.out.print("Input the elements in array : ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("Displaying this array using recursion : ");
        display(arr, n - 1);
        in.close();
    }
    public static void display(int[] arr, int i){
        if(i == -1){
            return;
        }
        display(arr, i - 1);
        System.out.print(arr[i] + " ");
    }
}