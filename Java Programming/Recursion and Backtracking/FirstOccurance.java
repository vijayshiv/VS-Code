import java.util.*;

public class FirstOccurance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements in array : ");
        int n = in.nextInt();
        System.out.print("Input the elements in array : ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("Input the target number : ");
        int target = in.nextInt();
  
        int ans = firstOccuredoptimized(arr, 0, target);
        System.out.println("The first index value in array is (optimized way): " + ans);
        int ans2 = firstOccured(arr, 0, target);
        System.out.println("The first index value in array is: " + ans2);
        in.close();
    }

    // optimized verison of the below code
    public static int firstOccuredoptimized(int[] arr, int i, int data){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == data){
            return i;
        }
        else{
            int fiisa = firstOccuredoptimized(arr, i + 1, data);
            return fiisa;
        }
    }
    
    public static int firstOccured(int[] arr, int i, int data) {
        if (i == arr.length) {
            return -1;
        }
        int fiisa = firstOccured(arr, i + 1, data);
        if (arr[i] == data) {
            return i;
        } else {
            return fiisa;
        }
    }
}
