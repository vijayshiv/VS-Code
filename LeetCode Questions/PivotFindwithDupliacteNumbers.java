import java.util.*;

public class PivotFindwithDupliacteNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the array -> ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements in the array -> ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        System.out.print("Enter the target element -> ");
        int target = in.nextInt();

        int ans = search(arr, target);
        System.out.println("The target found at "+ ans + " index and the position is "+ (ans + 1) + "th in the array");
 
        in.close();
    }
    public static int search(int[] arr, int target){
        int pivot = findPivotWithDuplicates(arr);
        //if the pivot is not found then the arrayis not rotated, so just do binary search
        if(pivot == -1){
            return SimpleBS(arr, target, 0, arr.length - 1);
        }

        //if pivot is found you found 2 ascending arrays
        if(arr[pivot] == target){
            return pivot;
        }
        if(target >= arr[0]){
            return SimpleBS(arr, target, 0, pivot - 1);
        }

        return SimpleBS(arr, target, pivot + 1, arr.length - 1);
    }
    public static int SimpleBS(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid + 1;
            } else{
                return mid;
            }
        }
        return -1;
    }
    public static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }

            // if elements at middle, start, end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check whether end is pivot
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}