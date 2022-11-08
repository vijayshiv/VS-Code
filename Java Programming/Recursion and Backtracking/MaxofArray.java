import java.util.*;

public class MaxofArray {
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
        int max = MaxValueinArray(arr, 0);
        System.out.print("The max value in array is : " + max);
        in.close();
    }
    public static int MaxValueinArray(int[] arr, int i){
        if(i == arr.length - 1){
            return arr[i];
        }
        int misa = MaxValueinArray(arr, i + 1); // misa -> max in smaller array
        if(misa > arr[i]){
            return misa;
        } else{
            return arr[i];
        }
    }
}
