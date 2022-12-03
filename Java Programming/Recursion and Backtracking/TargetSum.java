import java.util.*;

public class TargetSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements -> ");
        int n = in.nextInt();
        System.out.print("Enter the elements in array -> ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("Enter the target sum -> ");
        int target = in.nextInt();

        System.out.print("The subsets are -> ");
        printTargetSumSubsets(arr, 0, "", 0, target);
        in.close();
    }
    public static void printTargetSumSubsets(int[] arr, int i, String set, int sos, int tar){
        if(i == arr.length){
            if(sos == tar){
                System.out.println(set);
            }
            return;
        }
        printTargetSumSubsets(arr, i + 1, set + arr[i] + " ", sos + arr[i], tar);
        printTargetSumSubsets(arr, i + 1, set, sos, tar);
    }
}
