import java.util.*;

public class FindallIndices {
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

        int ans[] = allIndices(arr, 0, target,0);
        System.out.println("The all index value in array is : " + Arrays.toString(ans));

        in.close();
    }
    public static int[] allIndices(int[] arr, int i, int data, int f){
        if(i == arr.length){
            return new int[f];
        }
        if(arr[i] == data){
            int[] ansarr = allIndices(arr, i + 1, data, f + 1);
            ansarr[f] = i;
            return ansarr;
        } else{
            int[] ansarr = allIndices(arr, i + 1, data, f);
            return ansarr;
        }
    }
}
