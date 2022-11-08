import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements in array : ");
        int n = in.nextInt();
        System.out.print("Input the elements in array : ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("Reversing this array using recursion : ");
        displayReverseArray(arr, 0);
        in.close();
    }

    public static void displayReverseArray(int[] arr, int i) {
        if (i == arr.length) {
            return;
        }
        displayReverseArray(arr, i + 1);
        System.out.print(arr[i] + " ");

    }
}